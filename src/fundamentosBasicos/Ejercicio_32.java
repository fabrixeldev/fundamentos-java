package fundamentosBasicos;

public class Ejercicio_32 {
    public static void main(String[]args){
        /*
        32: Dado un número, indicar si es múltiplo de 3 y de 5 a la vez.
         */
        int numero = 75;
        if (numero %3 == 0 && numero %5 == 0){
            System.out.println("El numero: " + numero + " es multiplo de 3 y 5");
        }else{
            System.out.println("El numero: " + numero + " no es multiplo de 3 y 5");
        }
    }
}
