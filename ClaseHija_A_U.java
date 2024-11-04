package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;

public class ClaseHija_A_U extends ClasePadre_Abstracta {
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en pesos argentinos:");
        double cantidad = scanner.nextDouble();
        double arsRate = rates.get("ARS").getAsDouble();
        double resultado = cantidad / arsRate;
        System.out.printf("La cantidad en dólares es: %.6f%n", resultado);
    }
}
