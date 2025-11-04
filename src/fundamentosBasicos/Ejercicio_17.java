package fundamentosBasicos;

public class Ejercicio_17 {
    public static void main(String[]args){
        /*
        17: Convierte 123.45678 a:
            Redondeado con Math.round a 2 decimales.
            Truncado a 2 decimales.
         */
        double numee = 123.45678;
        double redondeado = Math.round(numee*100.0) / 100.0;
        System.out.println(redondeado);
        double truncado = (int)(numee * 100.0) / 100.0;
        System.out.println(truncado);
    }
}
