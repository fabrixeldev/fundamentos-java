package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_51 {
    public static void main(String[]args){
        /*
        51: Suma hasta que el usuario escriba 0
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Ingrese numeros: ");
        numero = scanner.nextInt();

        while (numero != 0){
            suma += numero;
            numero = scanner.nextInt();
        }
        System.out.println("La suma total de numeros mayores a 0 es: " + suma);
    }
}
