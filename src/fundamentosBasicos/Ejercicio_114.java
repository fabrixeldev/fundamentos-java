package fundamentosBasicos;

import java.util.List;

public class Ejercicio_114 {
    public static void main(String[]args){
        /* **1** Dado un int[] array: Cuenta cuántos números cumplen todas estas condiciones:
            Son positivos
            Son múltiplos de 5
            Son menores que 200
            No son divisibles entre 10*/
        int[] array = {10,-11,12,-13,-14,20,31,1,3,9,500,10,12};
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0 && array[i] % 5 == 0 && array[i] < 200 && array[i] % 10 != 0){
                contador++;
            }
        }
        System.out.println("Los numeros que cumplen todas las condiciones son = " + contador);

        /* **2** Dado un int[] array: Muestra solo los números que aparecen más de una vez, pero imprímelos una sola vez.*/
        for (int i = 0; i < array.length; i++){
            int contadorRepetidos = 0;
            boolean repetido = false;

            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    contadorRepetidos++;
                }
            }
            if (contadorRepetidos > 1){
                for (int j = 0; j < i; j++){
                    if (array[i] == array[j]){
                        repetido = true;
                    }
                }
            }
            if (contadorRepetidos > 1 && !repetido){
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();

        /* **3** Dado un número n: Mientras n sea distinto de 1: Si es par → divídelo entre 2
                    Si es impar → multiplícalo por 3 y súmale 1
                    Cuenta cuántas operaciones se hicieron.*/

        /*int numero = 10;
        int contadorOperacion = 0;
        while (numero != 1){
            if (numero % 2 == 0){
                numero /= 2;
                contadorOperacion++;
            }else{
                numero *= 3 + 1;
                contadorOperacion++;
            }
        }
        System.out.println("El numero de operaciones totales es = " + contadorOperacion);*/

        /* **4** Dado un List<Integer>: Deja solo los números: Mayores que 10, Menores que 100, Pares
                    Luego: Súmalos, Imprime el resultado final*/
        List<Integer> listaNumeros = List.of(10,-11,12,-13,-14,20,31,1,3,9,500,10,12);
        int listaSuma = listaNumeros.stream()
                .filter(i -> i > 10 && i < 100 && i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma total de listaNumeros = " + listaSuma);

        /* **5**
         ******
         *    *
         * ** *
         * ** *
         *    *
         ******

         */
        int h = 11;
        for (int fila = 0; fila < h; fila++){
            for (int col = 0; col < h; col++){
                if (fila == 0 || fila == h - 1 || col == 0 || col == h - 1 || fila > 1 && fila < h - 2 && col > 1 && col < h - 2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
