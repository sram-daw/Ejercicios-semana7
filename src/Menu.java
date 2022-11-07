import java.util.Scanner;

public class Menu {
    public static void menuFuncion() {
        Scanner input = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            int operacion = 0; //selección en el menú qué se desea hacer
            int cantidad = 0; //cantidad de dinero introducida por el usuario
            int comprobacion = 0; //comprueba si la cantidad es múltiplo de 5
            boolean multiplo = false; //mientras no sea verdadero, no para de pedir la cantidad. Debe ser declarada dentro del while para que en las siguientes vueltas del bucle se vuelva a establecer su valor como falso por defecto y se ejecute el case 1.
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
