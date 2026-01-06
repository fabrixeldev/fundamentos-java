package fundamentosBasicos;

import java.util.List;

public class Ejercicio_116 {
    public static void main(String[]args){
        /* **1** Dado un int[] array, cuenta cuántos números son positivos, múltiplos de 4 y menores que 50.*/
        int[] array = {1,2,3,2,4,5,8,15,2,55,4,68,4,7,7};
        System.out.print("Los numeros que cumplen con las condiciones son: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0 && array[i] % 4 == 0 && array[i] < 50){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        /* **2** Dado un int[] array, imprime solo los valores que aparecen exactamente 3 veces.
                    Restricción: No crear un array adicional.*/

        for (int i = 0; i < array.length; i++){
            int contador = 0;
            boolean repetidos = false;
            for (int k = 0; k < array.length; k++){
                if (array[i] == array[k]){
                    contador++;
                }
            }
            if (contador == 3){
                for (int k = 0; k < i; k++){
                    if (array[i] == array[k]){
                        repetidos = true;
                    }
                }
            }
            if (contador == 3 && !repetidos){
                System.out.print(array[i] + " ");
            }
        }

        /* **3** Dado un número n, mientras n > 1:
Si n es divisible por 2 → dividir entre 2
Si n es divisible por 3 → dividir entre 3
Si no → restarle 1
Cuenta cuántas operaciones se hicieron y muestra el valor final de n.*/
        int n = 20;
        int contadorOperaciones = 0;
        while (n > 1){
            if (n % 2 == 0){
                n /= 2;
                contadorOperaciones++;
            } else if (n % 3 == 0) {
                n /= 3;
                contadorOperaciones++;
            }else {
                n -= 1;
                contadorOperaciones++;
            }
        }
        System.out.println("\n" + "La cantidad de operaciones es = " + contadorOperaciones + " y el resultado final es = " + n);

        /* **4** Dado un List<Integer> lista:
Filtra los números mayores que 0 y menores que 20
Eleva cada número al cuadrado
Muestra solo los pares*/

        List<Integer> listaNumeros = List.of(1,2,3,15,20,21,25);
        listaNumeros.stream()
                .filter(i -> i > 0 && i < 20)
                .map(i -> i * i)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        /* **5**
         *   *
         * *
         *
         * *
         *   *
        */
        int h = 5;
        for (int fila = 0; fila <= h; fila++){
            for (int col = 0; col <= h; col++){
                if (col == 0 || col == h - fila - 2 && fila <= h / 2 || col == fila - 2 && fila >= h / 2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
