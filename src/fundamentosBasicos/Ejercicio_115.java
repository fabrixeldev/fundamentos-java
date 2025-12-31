package fundamentosBasicos;

import java.util.List;

public class Ejercicio_115 {
    public static void main(String[]args){
        /* **1** Dado un int[] array: Cuenta cuántos números cumplen todas estas condiciones:
                Son negativos
                Son múltiplos de 4
                Su valor absoluto es menor que 100
                No son divisibles entre 8*/
        int[] array = {1,2,3,4,5,6,-9,-5,-1,-8,-4,-6,-2,10,1,20,-30,300,-40,89,300};
        int contador = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0 && array[i] % 4 == 0 && Math.abs(array[i]) < 100 && array[i] % 8 != 0){
                contador++;
            }
        }
        System.out.println("Los numeros que cumplen con todas estas condiciones son = " + contador);

        /* **2** Dado un int[] array: Muestra solo los números que: Aparecen más de una vez, Pero imprímelos una sola vez, No puedes usar otro array ni Set*/
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

        /* **3** Dado un número n: Mientras n sea mayor que 0: Si n es divisible entre 5, réstale 5, Si es divisible entre 3, réstale 3
                                    Si no cumple ninguna, réstale 1, Cuenta cuántas operaciones se realizan, Imprime el valor final de n*/

        int numero = 34;
        int contadorOperaciones = 0;
        while (numero > 0){
            if (numero % 5 == 0){
                numero -= 5;
                contadorOperaciones++;
            }else if (numero % 3 == 0){
                numero -= 3;
                contadorOperaciones++;
            }else {
                numero -= 1;
                contadorOperaciones++;
            }
        }

        System.out.println("El numero de operaciones que se realizaron es = " + contadorOperaciones);

        /* **4** Dado un List<Integer>: Deja solo los números: Mayores que 20, Menores que 200, Impares, Eleva cada número al cuadrado
                                        Suma todos los resultados, Imprime el resultado final*/

        List<Integer> listaNumeros = List.of(10,20,30,40,100,200,300,211,455,31,51);

        int listaProcesada = listaNumeros.stream()
                .filter(i -> i > 20 && i < 200 && i % 2 != 0)
                .map(i -> i * 2)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("El resultado Final es " + listaProcesada);

    }
}
