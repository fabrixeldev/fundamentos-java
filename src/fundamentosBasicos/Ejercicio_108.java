package fundamentosBasicos;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio_108 {
    public static void main(String[]args){
        /* **1** Dado un número entero n:
            Si n es negativo → imprime "Negativo"
            Si n es cero → imprime "Cero"
            Si es positivo y par → imprime "Positivo par"
            Si es positivo e impar → imprime "Positivo impar"*/
        int numero = 11;
        if (numero != 0){
            if (numero > 0){
                if (numero % 2 == 0){
                    System.out.println("POSITIVO PAR");
                }else {
                    System.out.println("POSITIVO IMPAR");
                }
            }else {
                System.out.println("NEGATIVO");
            }
        }else {
            System.out.println("CERO");
        }

        /* **2** Dado un número n: Usa while, Imprime los números desde n hasta 1, Al final imprime "Fin"*/

        int n = 40;
        while (n > 0) {
            n -= 1;
            if (n != 0){
                System.out.print(n + ", ");
            }else {
                System.out.print("Fin");
            }
        }

        /* **3** Dado un List<Integer>: Calcula el promedio, Imprime solo los números mayores al promedio*/
        List<Integer> listaNumeros = List.of(1,2,3,7,5);

        double promedio = listaNumeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.00);

        System.out.println("\n" + "El promedio es = " + promedio);

        List<Integer> mayorPromedio = listaNumeros.stream()
                .filter(i -> i > promedio)
                .toList();

        System.out.println("Numeros mayores al promedio = " + mayorPromedio);

        /* **4** Dado un List<String>: Convierte cada palabra en su longitud, Imprime las longitudes*/
        List<String> listaPalabras = List.of("HOLA", "MUNDO", "LUNA", "ESCAPA");

        Map<Integer, List<String>> longitudPalabras = listaPalabras.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(longitudPalabras);

        List<Integer> longitud = listaPalabras.stream()
                .map(String::length)
                .toList();

        System.out.println(longitud);

        /* **5** PATRON*/
        int h = 4;
        for (int fila = 1; fila <= h; fila++){
            for (int col = 1; col <= fila; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
