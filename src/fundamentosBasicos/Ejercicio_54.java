package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_54 {
    public static void main(String[]args){
        /*
        54: Mayor número ingresado hasta que el usuario escriba -1
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mayor = Integer.MIN_VALUE;
        System.out.println("Ingrese numeros: ");
        numero = scanner.nextInt();

        while (numero != -1){
            if (numero > mayor){
                mayor = numero;
                System.out.println("El mayor es: " + mayor);
            }
            numero = scanner.nextInt();
        }
    }
}
