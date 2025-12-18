package fundamentosBasicos;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio_104 {
    public static void main(String[]args){
        /* **1** Dado un List<Integer>: Encuentra el número mayor, Maneja el caso de lista vacía*/
        List<Integer> listaNumeros = List.of(8,2,3,4,5,6);

        Optional<Integer> numeroMayor = listaNumeros.stream()
                .max(Integer::compareTo);
        numeroMayor.ifPresentOrElse(
                i -> System.out.println("El numero mayor de la lista es = " + i),
                () -> System.out.println("Lista vacia")
        );

        /* **2** Dado un List<Integer> desordenado: Ordénalo de menor a mayor, Imprime el resultado*/
        List<Integer> listaOrdenada = listaNumeros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista Ordenada = " + listaOrdenada);

        /* **3** Dado un List<Integer> con valores repetidos: Elimina los duplicados, Imprime los valores únicos*/
        List<Integer> listaNumerosRepetidos = List.of(8,2,3,4,5,6,8,5);

        List<Integer> eliminacionRepetidos = listaNumerosRepetidos.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista de numeros repetidos eliminados = " + eliminacionRepetidos);

        /* **4** Dado un List<Integer>: Calcula el promedio, Maneja el caso donde la lista esté vacía*/

        OptionalDouble promedio = listaNumeros.stream()
                .mapToInt(i -> i)
                .average();

        System.out.println("Promedio de la lista = " + listaNumeros + " = " + promedio);

        /* **5** Dado un List<String>: Filtra palabras que empiecen con vocal, Convierte a minúsculas, Ordénalas alfabéticamente, Imprime el resultado*/
        List<String> listaPalabras = List.of("UNDO", "OLA", "JAVA", "PYTHON");

        List<String> empiezaVocal = listaPalabras.stream()
                .filter(s -> s.toLowerCase().matches(("^[aeiouáéíóú].*")))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(empiezaVocal);
    }
}
