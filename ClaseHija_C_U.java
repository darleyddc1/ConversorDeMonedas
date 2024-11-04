package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;

public class ClaseHija_C_U extends ClasePadre_Abstracta {
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en pesos colombianos:");
        double cantidad = scanner.nextDouble();
        double copRate = rates.get("COP").getAsDouble();
        double resultado = cantidad / copRate;
        System.out.printf("La cantidad en dólares es: %.6f%n", resultado);
    }
}
