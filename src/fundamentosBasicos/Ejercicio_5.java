package fundamentosBasicos;

public class Ejercicio_5 {
    public static void main(String[]args){
         /*
        5: Convierte 36.6 °C a °F. Fórmula: F = C * 9/5 + 32. (asegura double)
         */
        final double GRADOS = 36.6;
        double gradosFarenheit = GRADOS * 9 / 5 + 32;
        System.out.println("Grados Celcius: " + GRADOS + " a Grados Farenheit: " + gradosFarenheit);
    }
}
