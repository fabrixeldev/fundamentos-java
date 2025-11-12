package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_55 {
    public static void main(String[]args){
        /*
        55: Promedio de notas hasta que se escriba -1
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;
        double promedio = 0;
        System.out.println("Ingrese notas del 0 - 100: ");
        numero = scanner.nextInt();

        while (numero != -1){
            contador++;
            suma += numero;
            promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
            numero = scanner.nextInt();
        }
    }
}
