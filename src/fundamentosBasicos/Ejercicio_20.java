package fundamentosBasicos;

public class Ejercicio_20 {
    public static void main(String[]args){
         /*
        20: Dado n = 12345, imprime el penúltimo dígito (pista: % 100 / 10).
         */
        int numenume = 12345;
        int opera = (numenume / 10) % 10;
        System.out.println("El penultimo del numero: " + numenume +" es: " + opera);
    }
}
