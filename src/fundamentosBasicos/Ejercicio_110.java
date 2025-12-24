package fundamentosBasicos;

import java.util.List;

public class Ejercicio_110 {
    public static void main(String[]args){
        /* **1** Dado un número n: Cuenta cuántos números entre 1 y n:, son múltiplos de 3, pero no múltiplos de 5*/
        int numero = 16;
        int contador = 0;
        for (int i = 0; i <= numero; i++){
            if (i % 3 == 0 && i % 5 != 0){
                contador++;
            }
        }
        System.out.println("El numero de multiplos de 3 sin contar los multiplos de 5 es = " + contador);

        /* **2** Dado un String texto: Invierte cada palabra, pero mantiene el orden*/
        String texto = "hola mundo";
        String textoInverso = "";
        for (int i = texto.length() -1; i >= 0; i--){
            textoInverso += texto.charAt(i);
        }
        System.out.println(textoInverso);

        /* **3** Dado un int[] array: Encuentra el segundo número más pequeño, Considera valores repetidos correctamente*/
        int [] array = {1,1,2,2,3,3,4,0};
        int min = Integer.MAX_VALUE;
        int segMin = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                segMin = min;
                min = array[i];
            }
            if (array[i] > min && array[i] < segMin){
                segMin = array[i];
            }
        }
        System.out.println("El minimo es = " + min);
        System.out.println("El segundo minimo es = " + segMin);

        /* **4** Dado un List<Integer>:
            Imprime:
            "BAJO" si < 50
            "MEDIO" si 50–80
            "ALTO" si > 80*/
        List<Integer> listaNumeros = List.of(10,20,50,80,100);

        listaNumeros.stream()
                .map( nota -> {
                    if (nota < 50) return "BAJO";
                    if (nota <= 80) return "MEDIO";
                    return "ALTO";
                })
                .forEach(etiqueta -> System.out.print(etiqueta + ", "));
        System.out.println();

        /* **5** PATRON */
        int h = 5;
        for (int fila = 0; fila < h; fila++){
            for (int col = 0; col < h - fila; col++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 1; col++){
                System.out.print("*");
            }
            if (fila >= 1 && fila <= 3){
                for (int col = 1; col <= (2 * fila) - 1 ; col++){
                    System.out.print(" ");
                }
                for (int col = 1; col <= 1; col++){
                    System.out.print("*");
                }
            }
            if (fila == 4){
                for (int col = 1; col <= (2 * fila) - 1 ; col++){
                    System.out.print("*");
                }
                for (int col = 1; col <= 1; col++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
