package fundamentosBasicos;

public class Ejercicio_86 {
    public static void main(String[]args){
        /*Escribe una función que reciba una matriz int[][] y un número x, y devuelva true si el número aparece en la matriz.
          Debe usar dos for anidados.*/
        int numero = 0;
        int matriz[][] = {{3,5,8}, {4,2,9}};
        Ejercicio_86 ejercicio86 = new Ejercicio_86();
        System.out.println(ejercicio86.buscar(matriz,numero));
    }

    public boolean buscar(int matriz[][], int n){
        boolean token = false;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= matriz.length; j++){
                if (matriz[i][j] == n){
                    token = true;
                }
            }
        }
        return token;
    }
}
