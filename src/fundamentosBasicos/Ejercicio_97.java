package fundamentosBasicos;

import java.util.List;

public class Ejercicio_97 {
    public static void main(String[]args){
        /*Dado un List<Integer> numeros, usando Streams:
            Elimina los números negativos.
            Eleva al cuadrado los restantes.
            Calcula la suma final.*/
        List<Integer> listaNumeros = List.of(-2, 3, -1, 4);
        int operacion = listaNumeros.stream()
                .filter(i -> i > 0)
                .mapToInt(i -> i * i)
                .sum();

        System.out.println(operacion);
    }

}
