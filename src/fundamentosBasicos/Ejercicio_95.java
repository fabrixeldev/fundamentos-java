package fundamentosBasicos;

public class Ejercicio_95 {
    public static void main(String[]args){
        /*PATRON*/
        int n = 5;
        for (int fila = 0; fila < n; fila++){
            for (int col = 0; col < n - fila; col++){
                System.out.print(n - fila);
            }
            System.out.println();
        }
    }
}
