package fundamentosBasicos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_63 {
    public static void main(String[]args){
        /*
        63: Buscar número
            Dado un array de enteros y un número x, indica si x está en el array o no.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingresa un numero del 1 - 20: ");
        int numero = scanner.nextInt();
        boolean valorEncontrado = false;

        int[] numRand = new int[10];
        for (int i = 0 ; i < numRand.length; i++){
            numRand[i] = random.nextInt(20) + 1;
        }
        for ( int n : numRand){
            System.out.print(n + " ");
        }
        for (int i = 0 ; i < numRand.length ; i++){
            if (numero == numRand[i]){
                valorEncontrado = true;
            }else {
                valorEncontrado = false;
            }
        }

        if (valorEncontrado == true) {
            System.out.println("\nEl numero " + numero + " se encuentra en el array");
        }else {
            System.out.println("\nEl numero " + numero + " no se encuentra en el array");
        }
    }
}
