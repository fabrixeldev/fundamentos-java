package fundamentosBasicos;

public class Ejercicio_38 {
    public static void main(String[]args){
        /*
        38: Dado un número entre 1 y 3999, determinar en qué rango romano cae (ejemplo: 1–100 → “I-C”, 101–500 → “CI-D”, etc.).
         */
        int numeroRomano = 250;

        if (numeroRomano >= 1 && numeroRomano <= 100) {
            System.out.println("Rango romano: I–C");
        } else if (numeroRomano >= 101 && numeroRomano <= 500) {
            System.out.println("Rango romano: CI–D");
        } else if (numeroRomano >= 501 && numeroRomano <= 1000) {
            System.out.println("Rango romano: DI–M");
        } else if (numeroRomano >= 1001 && numeroRomano <= 2000) {
            System.out.println("Rango romano: MI–MM");
        } else if (numeroRomano >= 2001 && numeroRomano <= 3000) {
            System.out.println("Rango romano: MMI–MMM");
        } else if (numeroRomano >= 3001 && numeroRomano <= 3999) {
            System.out.println("Rango romano: MMMI–MMMCMXCIX");
        } else {
            System.out.println("Número fuera de rango (1–3999)");
        }
    }
}
