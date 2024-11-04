package conversorDeMonedas;
import java.util.Scanner;
import static conversorDeMonedas.ClasePrincipalAPI.rates;
public class ClaseHija_U_B extends ClasePadre_Abstracta{
    @Override
    public void Conversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en dólares:");
        double cantidad = scanner.nextDouble();
        double brlRate = rates.get("BRL").getAsDouble();
        double resultado = cantidad * brlRate;
        System.out.println("La cantidad en reales brasileños es: " + resultado + " reales");
    }
}
