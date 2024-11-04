package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;

public class ClaseHija_U_C extends ClasePadre_Abstracta {
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en dólares:");
        double cantidad = scanner.nextDouble();
        double copRate = rates.get("COP").getAsDouble();
        double resultado = cantidad * copRate;
        System.out.println("La cantidad en pesos colombianos es: " + resultado + " pesos");
    }
}