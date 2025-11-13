package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_59 {
    public static void main(String[]args){
        /*
        59: Buscar el primer múltiplo de 5
         */
        Scanner scanner = new Scanner(System.in);
        int numero;
        int multiplo;
        System.out.println("Ingrese numeros positivos: ");
        numero = scanner.nextInt();

        while (numero > 0){
            if (numero % 5 == 0){
                multiplo = numero;
                System.out.println("El numero: " + multiplo + " es multiplo de 5");
                break;
            }
            numero = scanner.nextInt();
        }
    }
}
