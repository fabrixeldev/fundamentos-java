package fundamentosBasicos;

public class Ejercicio_15 {
    public static void main(String[]args){
        /*
        15: Calcula cuántos segundos hay en 1 día, 1 semana y 1 mes de 30 días.
         */
        int dias = 1 * 24 * 60 * 60;
        int semana = 7 * 24 * 60 * 60;
        int mes = 30 * 24 * 60 * 60;

        System.out.println("En un dia hay: " + dias + " segundos");
        System.out.println("En una semana hay: " + semana + " segundos");
        System.out.println("En un mes hay: " + mes + " segundos");
    }
}
