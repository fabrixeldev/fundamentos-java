package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_57 {
    public static void main (String[]args){
        /*
        57: Contador de pares e impares hasta 0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numeros pares e impares: ");
        int numero = scanner.nextInt();
        int par = 0;
        int impar = 0;

        while (numero != 0){
            if (numero % 2 == 0){
                par++;
            }else {
                impar++;
            }
            numero = scanner.nextInt();
        }
        System.out.println("La cantidad de numeros pares hasta antes de ingresar el numero 0 son: " + par);
        System.out.println("La cantidad de numeros impares hasta antes de ingresar el numero 0 son: " + impar);
    }
}
