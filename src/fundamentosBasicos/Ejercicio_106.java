package fundamentosBasicos;

import java.util.*;

public class Ejercicio_106 {
    public static void main(String[]args){

        /* **1** Dado un List<Integer>: Encuentra el valor máximo, Si la lista está vacía, imprime "Lista vacía"*/
        List<Integer> listaNumeros = List.of(6,8,1,2,3,6,8,9,2,2,25,25);

        OptionalInt valorMaximo = listaNumeros.stream()
                .sorted(Comparator.naturalOrder())
                .mapToInt(Integer::intValue)
                .max();

        valorMaximo.ifPresentOrElse(
                i -> System.out.println("El valor maximo es: " + i),
                () -> System.out.println("Lista vacia")
        );

        /* **2** Dado un List<String> con números como texto: Ejemplo: ["10", "abc", "20", "5x", "30"], Convierte solo los válidos a Integer, Ignora los que no sean números, Imprime la lista resultante*/
        List<String> listaVariada = List.of("10", "abc", "20", "5x", "30");

        List<Integer> evaluarNumero = listaVariada.stream()
                .map(s -> intentarParsear(s))
                .filter(Objects::nonNull)
                .toList();

        System.out.println(evaluarNumero);

        /* **3** Dado un List<Integer>: Elimina los duplicados, Imprime los valores únicos*/
        List<Integer> eliminarDuplicados = listaNumeros.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .toList();

        System.out.println("Lista sin Duplicados = " + eliminarDuplicados);

        /* **4** Dado un List<Integer>: Calcula el promedio de los números mayores a 20, Si no hay ninguno, imprime "Sin datos"*/
        OptionalDouble promedioMayores20 = listaNumeros.stream()
                .filter(i -> i > 20)
                .mapToDouble(Integer::intValue)
                .average();

        promedioMayores20.ifPresentOrElse(
                i -> System.out.println("El promedio de numeros mayores a 20 es = " + i),
                () -> System.out.println("Sin datos")
        );

        /* **5** PATRON*/
        int h = 5;
        for (int fila = 0; fila < h; fila++){
            for (int col = 0; col < h - fila; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static Integer intentarParsear(String s){
        try{
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("No se pudo convertir: " + s);
            return null;
        }
    }
}
