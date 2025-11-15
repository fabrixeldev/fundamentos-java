package fundamentosBasicos;

import java.util.Random;

public class Ejercicio_66 {
    public static void main(String[]args){
        /*
        66: invertir un array
            Crea un array y muestra sus elementos en orden inverso.
         */
        Random random = new Random();
        int [] array = new int[10];

        for (int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(20) + 1;
        }

        for (int a: array){
            System.out.print(a + " ");
        }

        System.out.println("\nArray Invertido");
        for (int i = array.length - 1 ; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
