package fundamentosBasicos;

import java.util.List;

public class Ejercicio_109 {
    public static void main(String[]args){
        /* **1** Suma solo los números pares entre 1 y n, Imprime el resultado*/
        int n = 10;
        int sumaPares = 0;
        for (int i = 0 ; i <= n; i++){
            if (i % 2 == 0){
                sumaPares += i;
            }
        }
        System.out.println("La suma de los numeros pares es = " + sumaPares);

        /* **2** Dado un String texto: Cuenta cuántas vocales tiene (a e i o u), Ignora mayúsculas/minúsculas*/
        String texto = "HOLA mundo".toLowerCase();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            String vocales = "aeiou";
            if (vocales.contains(String.valueOf(letra))){
                contador++;
            }
        }
        System.out.println("El texto tiene la cantidad de vocales = " + contador);

        /* **3** Dado un int[] array: Encuentra el menor valor, Imprímelo*/
        int [] array = {1,5,2,3,4,0};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("El valor minimo es = " + min);

        /* **4** Dado un List<Integer>: Imprime solo los números:, mayores que 10, y menores o iguales a 50*/
        List<Integer> listaNumeros = List.of(1,2,3,10,20,30,40,60);

        listaNumeros.stream()
                .filter(i -> i > 10 && i <= 50)
                .forEach(System.out::println);

        /* **5** PATRON */
        int h = 5;
        for (int fila = 0; fila < h; fila++){
            for (int col = 0; col < h - fila; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
