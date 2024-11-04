package conversorDeMonedas;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
    Scanner entrada = new Scanner(System.in);
    //    Menú de operaciones o menu de opciones
    public void OpcionMenu() {
        int bandera = 0;
        int seleccion = 0;
        do {
            System.out.println("**************************************");
            System.out.println("    1)  DOLAR -> PESO COLOMBIANO");
            System.out.println("    2)  PESO COLOMBIANO -> DOLAR");
            System.out.println("    3)  DOLAR -> PESO ARGENTINO");
            System.out.println("    4)  PESO ARGENTINO -> DOLAR");
            System.out.println("    5)  DOLAR  -> REAL BRASILEÑO");
            System.out.println("    6)  REAL BRASILEÑO ->  DOLAR");
            System.out.println("    7)  SALIR");
            System.out.println("    Elije una opción válida");
            System.out.println("**************************************");
            seleccion = entrada.nextInt();
//            Opciones del menú vinculadas a cada clase hija
            switch (seleccion) {
                case 1:
                    ClasePadre_Abstracta U_C = new ClaseHija_U_C();
                    U_C.Conversion();
                    break;
                case 2:
                    ClasePadre_Abstracta C_U = new ClaseHija_C_U();
                    C_U.Conversion();
                    break;
                case 3:
                    ClasePadre_Abstracta U_A = new ClaseHija_U_A();
                    U_A.Conversion();
                    break;
                case 4:
                    ClasePadre_Abstracta A_U = new ClaseHija_A_U();
                    A_U.Conversion();
                    break;
                case 5:
                    ClasePadre_Abstracta U_B = new ClaseHija_U_B();
                    U_B.Conversion();
                    break;
                case 6:
                    ClasePadre_Abstracta B_U = new ClaseHija_B_U();
                    B_U.Conversion();
                    break;
                case 7:
                    System.out.println("Gracias, vuelva pronto");
                    bandera = 2;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (bandera != 2);
    }
    public abstract void Conversion();

}
