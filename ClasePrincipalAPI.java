package conversorDeMonedas;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.OptionalDouble;
import java.util.Scanner;
public class ClasePrincipalAPI {
        public static JsonObject rates;
    public static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";
        public static double copRate;
        static{
            try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/d03aafeb5fe0548f076c9c0e/latest/USD")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).join();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
        rates = jsonObject.getAsJsonObject("conversion_rates");
        double usdRate = rates.get("USD").getAsDouble();
        double copRate = rates.get("COP").getAsDouble();
        double arsRate = rates.get("ARS").getAsDouble();
        double brlRate = rates.get("BRL").getAsDouble();
//        System.out.println(usdRate);
//        System.out.println(copRate);
//        System.out.println(arsRate);
//        System.out.println(brlRate);
//        System.out.println(rates);
    }catch (IOException | InterruptedException e){
            e.printStackTrace();}
        }
    public double getcopRate() {
        return copRate;
    }
    public void setcopRate(double copRate) {
        this.copRate = copRate;
    }
}
