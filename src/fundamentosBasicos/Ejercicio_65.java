package fundamentosBasicos;

import java.util.Random;

public class Ejercicio_65 {
    public static void main(String[]args){
        /*
        65: Máximo y mínimo
            Dado un array de enteros, encuentra el valor máximo y el mínimo.
         */

        Random random = new Random();
        int[] array = new int[20];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(100) +1;
        }

        for(int a : array){
            System.out.print(a + " ");
        }

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("\n\nEl valor maximo del array es: " + max);
        System.out.println("El valor minimo del array es: " + min);
    }
}
