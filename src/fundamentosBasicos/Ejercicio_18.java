package fundamentosBasicos;

public class Ejercicio_18 {
    public static void main(String[]args){
        /*
        18: Si un auto recorre 180 km a 90 km/h, calcula el tiempo en horas y minutos.
         */
        int distanciA = 180;
        int velocidadA = 90;
        int tiempoHrs = 180/90;
        int tiempoMin = tiempoHrs * 60;
        System.out.println("El tiempo en horas es: " + tiempoHrs);
        System.out.println("El tiempo en minutos es: " + tiempoMin);
    }
}
