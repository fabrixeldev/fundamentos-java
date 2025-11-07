package fundamentosBasicos;

public class Ejercicio_33 {
    public static void main(String[]args){
        /*
        35: Dado un número de 3 cifras, indicar si es capicúa (ej: 121, 343).
         */
        int numero = 121;
        String numeroOriginal = String.valueOf(numero);
        StringBuilder numeroReverso = new StringBuilder(numeroOriginal).reverse();
        if (numero >= 100 && numero <= 999){
            if (numeroOriginal.equals(numeroReverso.toString())){
                System.out.println("El numero: " + numeroOriginal + " es igual a " + numeroReverso);
            }else {
                System.out.println("No es capicua");
            }
        }else {
            System.out.println("No es de 3 cifras");
        }

    }
}
