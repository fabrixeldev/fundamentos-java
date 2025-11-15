package fundamentosBasicos;

public class Ejercicio_67 {
    public static void main (String[]args){
        /*
        67: Dado un array de enteros, genera un segundo array donde cada posición i tenga la suma de los elementos desde 0 hasta i.
         */

        int[] firstArray = {2, 4 ,6 ,8, 10};
        int[] secondArray = new int[firstArray.length];
        int acumulador = 0;

        for (int i = 0 ; i < firstArray.length ; i++){
            acumulador += firstArray[i];
            secondArray[i] = acumulador;
        }

        for (int fa : firstArray){
            System.out.print(fa + " ");
        }

        System.out.println();
        for (int sa : secondArray){
            System.out.print(sa + " ");
        }
    }
}
