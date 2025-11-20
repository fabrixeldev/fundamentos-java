package fundamentosBasicos;

public class Ejercicio_78 {
    public static void main(String[]args){
        /*
        78: int[][] transponer(int[][] m) — transponer matriz (práctica de arrays 2D).
         */
        int a[][] = {{1,2,3}, {6,5,4}, {7,8,9}};
        int b[][] = transponer(a);

        mostrarMatriz(b);

    }

    public static int[][] transponer (int[][] m) {
        int filas = m.length;
        int cols = m[0].length;
        int [][] a= new int[cols][filas];
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                a[i][j] = m[i][j];
            }
        }
        return a;
    }

    public static int[][] mostrarMatriz(int[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        return m;
    }

}

