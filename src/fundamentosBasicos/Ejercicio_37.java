package fundamentosBasicos;

public class Ejercicio_37 {
    public static void main(String[]args){
        /*
        37: Dado un número del 1 al 12, imprimir el nombre del mes con switch.
         */
        int numeroMes = 1;
        switch (numeroMes){
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
            default -> System.out.println("Numero invalido");
        }
    }
}
