package fundamentosBasicos;

public class Ejercicio_72 {
    public static void main (String[]args){
        /*
        72: boolean esPrimo(int n) — versión eficiente con sqrt.
         */
        int numero = 43;
        boolean resultado = esPrimo(numero);
        System.out.println("The number one " + numero + " ¿Is prime? " + resultado );
    }

    public static boolean esPrimo(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2 ; i <= ((int)Math.sqrt(n)) ; i++){
            if (n % i == 0 && n != 1){
                return false;
            }
        }
        return true;
    }
}
