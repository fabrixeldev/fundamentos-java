package fundamentosBasicos;

public class Ejercicio_9 {
    public static void main (String[]args){
        /*
        9: Convierte 527 minutos a formato horas y minutos. (división entera y resto)
         */
        int numero = 527;
        int horas = numero / 60;
        int minutos = numero % 60;
        System.out.println("527 minutos equivale a: " + horas + " horas y " + minutos + " minutos");
    }
}
