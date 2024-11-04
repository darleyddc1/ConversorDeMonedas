package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;

public class ClaseHija_U_A extends ClasePadre_Abstracta{
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en dólares:");
        double cantidad = scanner.nextDouble();
        double arsRate = rates.get("ARS").getAsDouble();
        double resultado = cantidad * arsRate;
        System.out.println("La cantidad en pesos argentinos es: " + resultado + " pesos");
    }
}
