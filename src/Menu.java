import java.util.Scanner;

public class Menu {
    public static void menuFuncion() {
        Scanner input = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            int operacion = 0;
            int cantidad = 0;
            int comprobacion = 0; //comprueba si la cantidad es múltiplo de 5
            boolean multiplo = false;
            System.out.println("Indique qué operación desea realizar:\n1- Retirar dinero\n2- Salir");
            operacion = input.nextInt();
            switch (operacion) {
                case 1:
                    while (!multiplo) {
                        System.out.println("Indique la cantidad que desea retirar: ");
                        cantidad = input.nextInt();
                        comprobacion = cantidad % 5;

                        if (comprobacion == 0) {
                            multiplo = true;

                            Billetes instanciaBilletes = new Billetes();
                            instanciaBilletes.cuantosBilletes(cantidad);
                        } else {
                            System.out.println("Introduzca una cantidad múltiplo de 5.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                    break;
            }
        }
    }
}
