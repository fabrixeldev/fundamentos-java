package fundamentosBasicos;

import java.util.*;

public class Ejercicio_107 {
    public static void main(String[]args){
        /* **1** Dado un List<Integer>: Cuenta cuántos números son negativos, Imprime el resultado*/
        List<Integer> listaNumeros = List.of(-1,-2,-3,-4,1,2,3,4,-5,21);

        long conteoNegativos = listaNumeros.stream()
                .filter(i -> i < 0)
                .count();

        System.out.println("La cantidad de numeros negativos son = " + conteoNegativos);

        /* **2** Dado un List<String>: Convierte todas las palabras a MAYÚSCULAS, Imprímelas en una sola línea*/
        List<String> listaPalabras = List.of(" sol ", " luna ", " destino ", " arena ", " navegar ");

        listaPalabras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();

        /* **3** Dado un List<Integer>: Encuentra el primer número divisible por 7, Si no existe, imprime "No encontrado"*/

        Optional<Integer> divisible = listaNumeros.stream()
                .filter(i -> i % 7 == 0)
                .findFirst();

        divisible.ifPresentOrElse(
                i -> System.out.println("El primer numero divisible en la lista es = " + i),
                () -> System.out.println("No encontrado")
        );

        /* **4** Dado un int[]: Suma solo los valores pares, Imprime la suma*/

        int[] array = {1,2,3,4,5,6};
        int suma = 0;
        for (int i = 0; i <= array.length; i++){
            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("La suma de los numeros pares es = " + suma);

        OptionalInt sumaPares = OptionalInt.of(Arrays.stream(array)
                .filter(i -> i % 2 == 0)
                .sum());

        sumaPares.ifPresentOrElse(
                i -> System.out.println("La suma de los numeros pares es = " + i),
                () -> System.out.println("No hay datos")
        );

        /* **5** PATRON*/
        int h = 5;
        for (int fila = 1; fila <= h; fila++){
            for (int col = 1; col <= h-fila; col++){
                System.out.print(" ");
            }
            for (int col = 1; col <= fila; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
