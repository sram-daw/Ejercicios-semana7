import java.util.Scanner;

public class Billetes {
    public static void cuantosBilletes(int cantidad) {
        int cuantosQuinientos = 0, cuantosDoscientos = 0, cuantosCien = 0, cuantosCincuenta = 0, cuantosVeinte = 0, cuantosDiez = 0, cuantosCinco = 0;

        cuantosQuinientos = cantidad / 500;
        cantidad = cantidad - cuantosQuinientos * 500;

        cuantosDoscientos = cantidad / 200;
        cantidad = cantidad - cuantosDoscientos * 200;

        cuantosCien = cantidad / 100;
        cantidad = cantidad - cuantosCien * 100;

        cuantosCincuenta = cantidad / 50;
        cantidad = cantidad - cuantosCincuenta * 50;

        cuantosVeinte = cantidad / 20;
        cantidad = cantidad - cuantosVeinte * 20;

        cuantosDiez = cantidad / 10;
        cantidad = cantidad - cuantosDiez * 10;

        cuantosCinco = cantidad / 5;
        cantidad = cantidad - cuantosCinco * 5;

        System.out.println();
        if (cuantosQuinientos > 0) {
            System.out.println(cuantosQuinientos + " billetes de 500€");
        }
        if (cuantosDoscientos > 0) {
            System.out.println(cuantosDoscientos + " billetes de 200€");
        }
        if (cuantosCien > 0) {
            System.out.println(cuantosCien + " billetes de 100€");
        }
        if (cuantosCincuenta > 0) {
            System.out.println(cuantosCincuenta + " billetes de 50€");
        }
        if (cuantosVeinte > 0) {
            System.out.println(cuantosVeinte + " billetes de 20€");
        }
        if (cuantosDiez > 0) {
            System.out.println(cuantosDiez + " billetes de 10€");
        }
        if (cuantosCinco > 0) {
            System.out.println(cuantosCinco + " billetes de 5€");
        }

    }
}



