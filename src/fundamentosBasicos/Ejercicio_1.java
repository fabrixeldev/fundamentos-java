package fundamentosBasicos;

public class ejercicio_1 {
    public static void main (String[] args){
        /*
        1: Si tienes 25 años, ¿cuántos tendrás dentro de 15 años?
         */
        final int EDAD_ACTUAL = 25;
        final int ANOS_FUTUROS = 15;

        int edadEstimada = EDAD_ACTUAL + ANOS_FUTUROS;
        System.out.println("En 15 años mas se tendra la edad de: " + edadEstimada);
    }
}
