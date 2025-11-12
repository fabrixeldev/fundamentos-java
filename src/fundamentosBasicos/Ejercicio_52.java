package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_52 {
    public static void main(String[]args){
        /*
        52: Contar números positivos hasta que el usuario escriba -1
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPos = 0;

        System.out.println("Ingrese numeros: ");
        numero = scanner.nextInt();
        while (numero != -1){
            contadorPos++;
            numero = scanner.nextInt();
        }
        System.out.println("La cantidad de numeros positivos son: " + contadorPos);
    }
}
