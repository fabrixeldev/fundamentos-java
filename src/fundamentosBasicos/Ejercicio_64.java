package fundamentosBasicos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_64 {
    public static void main(String[]args){
        /*
        64: Contar pares e impares
            Dado un array de enteros, cuenta cuántos son pares y cuántos son impares.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[20];
        int par = 0;
        int impar = 0;

        for (int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(100) + 1;
        }

        for ( int a : array){
            System.out.print(a + " ");
        }

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] % 2 == 0){
                par++;
            }else {
                impar++;
            }
        }

        System.out.println("\n\nCantidad de numeros pares en el array: " + par);
        System.out.println("Cantidad de numeros impares en el array: " + impar);
    }
}
