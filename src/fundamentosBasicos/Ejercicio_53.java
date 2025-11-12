package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_53 {
    public static void main (String[]args){
        /*
        53: Tabla de multiplicar hasta que el usuario escriba 999
         */
        Scanner scanner = new Scanner(System.in);
        long numero;
        System.out.println("Ingrese un numero para generar su tabla de multiplicacion: ");
        numero = scanner.nextLong();
        while (numero != 999){
            for (int i = 1; i <= 10; i++){
                long mult = numero * i;
                System.out.println(numero + " x " + i + " = " + mult);
            }
            numero = scanner.nextLong();
        }
    }
}
