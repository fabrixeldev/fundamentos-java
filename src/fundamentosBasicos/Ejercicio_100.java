package fundamentosBasicos;

public class Ejercicio_100 {
    public static void main(String[]args){
        /*PATRON*/
        int h = 4;
        for (int fila = 0; fila <= h ; fila++){
            for (int col = 0; col < fila; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int fila = 1; fila <= h ; fila++){
            for (int col = 0; col < h - fila; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
