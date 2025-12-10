package fundamentosBasicos;

import java.util.List;
import java.util.Optional;

public class Ejercicio_87 {
    public static void main(String[]args){
        /*Dado un List<Integer>, usa Stream API para:
            Filtrar solo los números mayores a 10
            Transformarlos multiplicándolos por 2 (Function)
            Quedarte con el máximo si existe
            Devolver un Optional<Integer>*/

        List<Integer> listaNumeros = List.of(3, 10, 12, 25);

        Optional<Integer> operacion = listaNumeros.stream()
                .filter(i -> i > 10)
                .map( i -> i * 2)
                .max(Integer::compareTo);

        operacion.ifPresentOrElse(
                i -> System.out.println("El maximo es: " + i),
                () -> System.out.println("No se encontro el maximo")
        );

    }
}
