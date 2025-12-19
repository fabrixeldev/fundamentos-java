package fundamentosBasicos;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Ejercicio_105 {
    public static void main(String[]args){
        /* **1** Dado un List<Integer>: Cuenta cuántos números son mayores que 10, Imprime el total*/
        List<Integer> listaNumeros = List.of(1,2,3,4,5,6,11,85,48,0,4,89);

        long totalNumerosMayores = listaNumeros.stream()
                .filter(i -> i > 10)
                .count();

        System.out.println("Total de numeros mayores a 10 = " + totalNumerosMayores);

        /* **2** Dado un List<Integer>: Suma solo los números pares, Imprime el resultado*/

        int sumaNumerosPares = listaNumeros.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("La suma de los numeros pares es = " + sumaNumerosPares);

        /* **3** Dado un List<String>: Convierte cada palabra en su longitud, Imprime las longitudes*/
        List<String> listaPalabras = List.of("PROGRAMACION", "LONGITUD", "JAVA", "JAVAFX");

        Map<Integer, List<String>> longitudPalabras = listaPalabras.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(longitudPalabras);

        /* **4** Dado un List<Integer>: Encuentra el primer número mayor que 50, Si no existe, imprime "No encontrado"*/
        OptionalInt primerMayor = listaNumeros.stream()
                .filter(i -> i > 50)
                .mapToInt(Integer::intValue)
                .findFirst();

        primerMayor.ifPresentOrElse(
                i -> System.out.println(i),
                () -> System.out.println("No encontrado")
        );

        /* **5** PATRON*/

        int h = 5;
        for (int fila = 1; fila <= h; fila++){
            for (int col = 1; col <= h; col++){
                if (fila == col || col == (h-fila)+1){
                    System.out.print("X");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
