package fundamentosBasicos;

public class Ejercicio_49 {
    public static void main(String[]args){
        /*
        49: Primalidad: dado n, indica si es primo usando la técnica eficiente con sqrt(n) (o con salto 6k±1 como en el ejemplo de arriba).
            Tip: cuida casos pequeños (≤1, 2, 3).
         */

        int n = 43;
        boolean esPrimo = true;

        if (n == 1){
            esPrimo = false;
        }
        for (int i = 2 ; i <= ((int)Math.sqrt(n)) ; i++){
            if (n % i == 0 && n != 1){
                esPrimo = false;
            }
        }

        if (esPrimo){
            System.out.println("El numero " + n + " es primo");
        }else {
            System.out.println("El numero " + n + " no es primo");
        }
    }
}
