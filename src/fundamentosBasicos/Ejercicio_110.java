package fundamentosBasicos;

import java.util.List;

public class Ejercicio_110 {
    public static void main(String[]args){
        /* **1** Dado un número n: Cuenta cuántos números entre 1 y n:, son múltiplos de 3, pero no múltiplos de 5*/
        int numero = 16;
        int contador = 0;
        for (int i = 1; i <= numero; i++){
            if (i % 3 == 0 && i % 5 != 0){
                contador++;
            }
        }
        System.out.println("El numero de multiplos de 3 sin contar los multiplos de 5 es = " + contador);

        /* **2** Dado un String texto: Invierte cada palabra, pero mantiene el orden*/
        String texto = "hola mundo";
        String textoInverso = "";
        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++){
            String palabraActual = palabras[i];
            String palabrainvertida = "";
            for (int s = palabraActual.length() -1; s >= 0; s--){
                palabrainvertida += palabraActual.charAt(s);
            }
            textoInverso += palabrainvertida + " ";
        }

        System.out.println(textoInverso);

        /* **3** Dado un int[] array: Encuentra el segundo número más pequeño, Considera valores repetidos correctamente*/
        int [] array = {1,1,2,2,3,3,4,0};
        int min = Integer.MAX_VALUE;
        int segMin = Integer.MAX_VALUE;

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

        for (int fila = 1; fila <= h; fila++) {
            // espacios iniciales
            for (int esp = 1; esp <= h - fila; esp++) {
                System.out.print(" ");
            }

            // columnas
            for (int col = 1; col <= 2 * fila - 1; col++) {
                if (fila == h || col == 1 || col == 2 * fila - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
