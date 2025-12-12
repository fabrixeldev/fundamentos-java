package fundamentosBasicos;

public class Ejercicio_90 {
    public static void main(String[]args){
        /*Dado un número n, imprime: Se construye una pirámide numérica ascendente y luego descendente.*/
        int n = 5;
        for (int fila = 1; fila < n; fila++){
            for (int col = 1; col <= fila; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for (int fila = 1; fila < n; fila++){
            for (int col = 1; col < n- fila; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
