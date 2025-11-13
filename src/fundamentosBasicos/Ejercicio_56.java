package fundamentosBasicos;

import java.util.Scanner;

public class Ejercicio_56 {
    public static void main(String[]args){
        /*
        56: Adivina el número con sentinela
         */
        Scanner scanner = new Scanner(System.in);
        int numeroAlea =(int) (Math.random()* 50) +1;
        int numeroAdiv;
        System.out.println("Intenta adivinar el numero Secreto: ");
        numeroAdiv = scanner.nextInt();

        while (numeroAdiv != 0){
            if (numeroAdiv == numeroAlea){
                System.out.println("Encontraste el numero Secreto: " + numeroAlea);
            }
            if (numeroAdiv > numeroAlea){
                System.out.println("El numero ingresado es mayor al numero Secreto");
            }else{
                System.out.println("El numero ingresado es menor al numero Secreto");
            }
            numeroAdiv = scanner.nextInt();
        }
    }
}
