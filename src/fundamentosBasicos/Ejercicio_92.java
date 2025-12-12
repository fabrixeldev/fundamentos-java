package fundamentosBasicos;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio_92 {
    public static void main(String[]args){
        /*
        Dado un List<String> nombres, usa Streams para:
        Convertir todos los nombres a mayúsculas (Function)
        Filtrar solo los que tengan longitud > 4 (Predicate)
        Guardarlos en una nueva lista (Collectors.toList)
         */
        List<String> nombres = List.of("Ana", "Roberto", "Luis", "María");

        List<String> lista = nombres.stream()
                .filter( s -> s.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(lista);
    }
}
