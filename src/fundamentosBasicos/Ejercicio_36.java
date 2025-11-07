package fundamentosBasicos;

public class Ejercicio_36 {
    public static void main(String[]args){
        /*
        36: Dado un número del 1 al 7, imprimir el día de la semana con switch.
         */
        int diaSemana = 2;
        switch (diaSemana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
