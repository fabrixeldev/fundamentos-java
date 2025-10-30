package fundamentosBasicos;

public class Ejercicio_8 {
    public static void main(String[] args){
         /*
        8: Dado un monto entero en Bs = 786, desglósalo en la menor cantidad de billetes/monedas de: 200, 100, 50, 20, 10, 5, 2, 1. (pista: división y % en cascada)
         */
        int billeteMonedas = 786;
        int resto = 0;

        int primerDesglose = billeteMonedas / 200;
        resto = billeteMonedas % 200;
        System.out.println((primerDesglose + " x 200"));

        int segundoDesglose = resto / 100;
        resto = resto % 100;
        System.out.println((segundoDesglose + " x 100"));

        int tercerDesglose = resto / 50;
        resto = resto % 50;
        System.out.println(tercerDesglose + " x 50");

        int cuartoDesglose = resto / 20;
        resto = resto % 20;
        System.out.println(cuartoDesglose + " x 20");

        int quintoDesglose = resto / 10;
        resto = resto % 10;
        System.out.println(quintoDesglose + " x 10");

        int sextoDesglose = resto / 5;
        resto = resto % 5;
        System.out.println(sextoDesglose + " x 5");

        int septimoDesglose = resto / 1;
        resto = resto % 1;
        System.out.println(septimoDesglose + " x 1");
    }
}
