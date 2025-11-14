package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_62 {
    public static void main(String[]args){
        /*
        62: Promedio de notas
            Pide (o define en código) 5 notas y calcula el promedio.
         */

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        double promedio = 0;

        System.out.println("Ingresa el numero de notas: ");
        int numNotas = scanner.nextInt();
        int [] notas = new int[numNotas];

        System.out.println("Ingresa las notas: ");
        for (int i = 0 ; i < numNotas; i++){
            notas[i] = scanner.nextInt();
            suma += notas[i];
            promedio = (double) suma / numNotas;
        }

        System.out.println("Las notas ingresadas son: ");
        for (int n : notas){
            System.out.print(n + " ");
        }

        System.out.println("\nEl promedio de las notas ingresadas es: " + promedio);
    }
}
