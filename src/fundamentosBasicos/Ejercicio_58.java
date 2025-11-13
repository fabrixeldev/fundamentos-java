package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_58 {
    public static void main(String[]args){
        /*
        58: Producto acumulado hasta -1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numeros positivos: ");
        int numero;
        int mult = 1;

        if (scanner.hasNextInt()){
            numero = scanner.nextInt();
            while (numero > 0){
                mult *= numero;
                if (scanner.hasNextInt()){
                    numero = scanner.nextInt();
                }else {
                    System.out.println("No hay datos validos");
                    break;
                }
            }
        }else {
            System.out.println("No hay datos validos");
        }
        scanner.close();
        System.out.println("La acumulacion de numeros multiplicados positivos es: " + mult);
    }
}
