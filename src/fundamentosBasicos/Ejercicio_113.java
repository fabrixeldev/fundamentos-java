package fundamentosBasicos;

import java.util.List;

public class Ejercicio_113 {
    public static void main(String[]args){
        /* **1** Dado un int[] array: Cuenta cuántos números cumplen todas estas condiciones: Son negativos, Son pares, Su valor absoluto es mayor que 10*/
        int[] array = {1,2,3,4,5,6,7,2,8,9,10,-11,-12,1};
        int conteo = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0 && array[i] % 2 == 0 && Math.abs(array[i]) > 10){
                conteo++;
            }
        }
        System.out.println("Los numeros que cumplen con las 3 condiciones son = " + conteo);

        /* **2** Dado un int[] array: Muestra solo los números que aparecen exactamente dos veces. No crees otro array. Usa for anidados.*/
        for (int i = 0; i < array.length; i++){
            int contadorRepetidos = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    contadorRepetidos++;
                }
            }
            if (contadorRepetidos == 2){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        /* **3** Dado un número n: Mientras n sea mayor que 1: Si es divisible entre 3, divídelo entre 3 Si no, réstale 1, Cuenta cuántas operaciones se realizaron, Imprime el valor final de n*/
        int n = 10;
        int contadorOper = 0;
        while (n > 1){
            if (n % 3 == 0){
                n /= 3;
                contadorOper++;
            }else {
                n -= 1;
                contadorOper++;
            }
        }
        System.out.println("Numero de Operaciones = " + contadorOper);
        System.out.println("Estado final del n = " + n);

        /* **4** Dado un List<Integer>: Filtra los números mayores que 5, Transforma cada número en su cubo (n³), Imprime solo los que sean impares*/
        List<Integer> listaNumeros = List.of(1,2,3,4,5,6,7,8,9,10);
        listaNumeros.stream()
                .filter(i -> i > 5)
                .map(i -> (i * i) * i)
                .filter( i -> i % 2 != 0)
                .forEach(System.out::println);

        /* **5** PATRON
         *******
         *     *
         * *** *
         * * * *
         * *** *
         *     *
         *******
         */
        int h = 7;
        for (int fila = 0; fila < h ; fila++){
            for (int col = 0; col < h; col++){
                if (fila == 0 || col == h - 1 || col == 0 || fila == h - 1 || fila == h / 3 && col != 1 && col != h - 2 || fila == (h / 3) * 2 && col != 1 && col != h - 2 || fila == h / 2 && col != 1 && col != h - 2 && col != h / 2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
