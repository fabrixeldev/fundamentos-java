package fundamentosBasicos;

import java.util.Arrays;
import java.util.List;

public class Ejercicio_103 {
    public static void main(String[]args){
        /* **1**Dado un List<Integer> con números positivos y negativos: Filtra solo los positivos*/
        List<Integer> numeros = List.of(1,-2,3,-4,5,-6,7,-8,9,-10, 20, 33, 77);

        List<Integer> listaPositivos = numeros.stream()
                .filter(i -> i > 0)
                .toList();
        System.out.println(listaPositivos);

        /* **2**Dado un List<Integer>: Cuenta cuántos números son pares*/
        long conteoPares = numeros.stream()
                .filter(i -> i % 2 == 0)
                .count();

        System.out.println("La cantidad de numeros pares son = " + conteoPares);

        /* **3**Dado un List<Integer>: Crea una nueva lista con el doble de cada número*/
        List<Integer> numerosDobles = numeros.stream()
                .map(i -> i * 2)
                .toList();

        System.out.print("Lista Original = " + numeros + " Lista Doble = " + numerosDobles);

        /* **4**Dado un List<Integer>: Filtra números mayores que 10, De esos, deja solo los impares, Calcula la suma final*/
        int sumaImpares = numeros.stream()
                .filter(i -> i > 10 && i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println();
        System.out.println(sumaImpares);

        /* **5**Dado un List<String> con palabras: Filtra las palabras con más de 4 letras, Convierte las restantes a mayúsculas, Imprímelas*/
        List<String> palabras = List.of("Coka", "luna", "mar", "estrella", "cielo", "pez");

        palabras.stream()
                .filter(s -> s.length() <= 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
