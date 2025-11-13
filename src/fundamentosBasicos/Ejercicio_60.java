package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_60 {
    public static void main(String[]args){
        /*
        60: Contar cuántos intentos hasta adivinar
         */
        int numeroSecret = (int) (Math.random() * 50 +1);
        int contIntentos = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero secreto: ");
        int numero = scanner.nextInt();
        while (numero != 0){
            if (numero == numeroSecret){
                contIntentos++;
                System.out.println("El numero " + numero + " es igual al numero secreto " + numeroSecret);
                break;
            }else {
                contIntentos++;
                if (numero > numeroSecret){
                    System.out.println("El numero ingresado es mayor al Numero Secreto");
                }else {
                    System.out.println("El numero ingresado es menor al Numero Secreto");
                }
            }
            numero = scanner.nextInt();
        }
        scanner.close();
        System.out.println("El numero de intentos para encontrar el numero secreto es: " + contIntentos);
    }
}
