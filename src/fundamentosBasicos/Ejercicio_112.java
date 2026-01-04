package fundamentosBasicos;

import java.util.List;

public class Ejercicio_112 {
    public static void main (String[]args){
        /* **1** Dado un int[] array: Cuenta cuántos números: son positivos, son múltiplos de 3 y están entre 20 y 100 inclusive*/
        int[] array = {10,20,30,40,50,-60,70,80,-9,9,-60,70,80};
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                if (array[i] % 3 == 0 && array[i] >= 20 && array[i] <= 100){
                    contador++;
                }
            }
        }
        System.out.println("Los números que son positivos, son múltiplos de 3 y están entre 20 y 100 son = " + contador);

        /* **2** Dado un int[] array: Muestra solo los números que: no se repiten (si un número aparece más de una vez, no se muestra)*/
        for (int i = 0; i < array.length; i++){
            int vecesDuplicado = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    vecesDuplicado++;
                }
            }
            if (vecesDuplicado == 1){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

         /* **3** Dado un número n: Mientras n sea mayor que 0: si es par, resta 2, si es impar, resta 1, Cuenta cuántas operaciones se realizaron.*/
        int numero = 7;
        int cont = 0;
        while (numero > 0){
            if (numero % 2 == 0){
                numero -= 2;
                cont++;
            }else {
                numero -= 1;
                cont++;
            }
        }
        System.out.println("\n" + "Se realizaron un total de " + cont + " operaciones.");

        /* **4** Dado un List<Integer>: Filtra los números: mayores que 10 y menores que 50, Eleva cada uno al cuadrado, Imprime solo los que sean pares*/
        List<Integer> listaNumeros = List.of(1,2,3,10,23,33,20,30,60,99);

        listaNumeros.stream()
                .filter(i -> i > 10 && i < 50)
                .map(i -> i * i)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        /* **5**
         *****
         *   *
         * * *
         *   *
         *****
         */
        int h = 7;
        if (h % 2 == 0){
            for (int fila = 0; fila <= h; fila++){
                for (int col = 0; col <= h; col++){
                    if (fila == 0 || fila == h || col == 0 || col == h || fila == h / 2 && col == h / 2){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            for (int fila = 0; fila < h; fila++){
                for (int col = 0; col < h; col++){
                    if (fila == 0 || fila == h - 1 || col == 0 || col == h - 1 || fila == h / 2 && col == h / 2){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
