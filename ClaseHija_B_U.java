package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;

public class ClaseHija_B_U extends ClasePadre_Abstracta {
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en reales brasileños:");
        double cantidad = scanner.nextDouble();
        double brlRate = rates.get("BRL").getAsDouble();
        double resultado = cantidad / brlRate;
        System.out.printf("La cantidad en dólares es: %.6f%n", resultado);
    }
}
