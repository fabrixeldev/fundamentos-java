package fundamentosBasicos;

import java.util.List;

public class Ejercicio_111 {
    public static void main(String[]args){
        /* **1** Dado un int[] array: Cuenta cuántos números: son pares y están entre 10 y 50 (inclusive)*/
        int[] array = {-1,10,11,20,21,30,31,40,41,50,10,51,-3};
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 10 && array[i] <= 50){
                if (array[i] % 2 == 0){
                    contador++;
                }
            }
        }
        System.out.println("Los numeros pares y mayores que 10 y menores a 50 son = " + contador);

        /* **2** Dado un int[] array: “Elimina” todos los valores negativos, Solo muéstralos ignorándolos, No crees otro array*/
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        /* **3** un int[] array un número x Cuenta cuántas veces aparece x.*/
        int numero = 10;
        int cont = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == numero){
                cont++;
            }
        }
        System.out.println("El numero " + numero + " aparece " + cont + " veces.");

        /* **4** Dado un List<Integer>: Filtra solo los números impares, Multiplícalos por 2, Imprímelos*/
        List<Integer> listaNumeros = List.of(1,2,3,4,5);
        listaNumeros.stream()
                .filter(i -> i % 2 != 0)
                .map(i -> i * 2)
                .forEach(System.out::println);

        /* **5** PATRON X*/
        int h = 7;
        for (int fila = 0; fila < h; fila++){
            for (int col = 0; col < h; col++){
                if (fila == col || col == h - fila - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
