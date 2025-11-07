package fundamentosBasicos;

public class Ejercicio_35 {
    public static void main(String[]args){
        /*
        35: Dado un número de 3 cifras, indicar si es capicúa (ej: 121, 343).
         */
        int numero = 12211;
        String numeroOriginal = String.valueOf(numero);
        StringBuilder numeroReverso = new StringBuilder(numeroOriginal).reverse();
        if (numeroOriginal.equals(numeroReverso.toString())){
            System.out.println("El numero: " + numeroOriginal + " es igual a " + numeroReverso);
        }else {
            System.out.println("No es capicua");
        }

    }
}
