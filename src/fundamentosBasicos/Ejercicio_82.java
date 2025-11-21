package fundamentosBasicos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio_82 {
    public static void main(String[]args){
        /*
        82: STREAMS

        1:Dada una lista de enteros, filtrar pares, elevar al cuadrado y devolver la suma (usa mapToInt y sum()).
         */

        List<Integer> listEnteros = List.of(1,2,3,4,5,6);
        int suma = listEnteros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(suma);

        /*
        2: Tienes List<Producto>: devuelve List<String> con nombres de productos que cuestan > 100 ordenados alfabéticamente.
         */

        List<String> listProducts = List.of("Papaya", "Maracuya", "Banana");

        List<String> stream = listProducts.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stream);

        /*
        3: Dada List<String> con palabras, devuelve Map<Character, List<String>> agrupando por la primera letra.
         */
        List<String> listPalabras = List.of("word1", "pord2", "sord3");

        Map<Character, List<String>>  map = listPalabras.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(map);

        /*
        4:Dada List<List<Integer>>, aplana y devuelve la lista con todos los valores únicos (sin duplicados).
         */

        List<Integer> listValores = List.of(2,2,4,5,6,6);
        List<Integer> list = listValores.stream()
                .distinct()
                .toList();

        System.out.println(list);

        /*
        5: Lee un archivo de texto con Files.lines(path), cuenta cuántas líneas contienen la palabra "error" (case-insensitive).
         */


        try (FileWriter fileWriter = new FileWriter("D:\\lulabeluga.txt")){
            fileWriter.write("error ");
            fileWriter.write("\nHola ");
            fileWriter.write("\nchola ");
            fileWriter.write("\nerror ");
            fileWriter.write("\nERROR");


        }catch (IOException e){
            e.printStackTrace();
        }

        long cantidad = 0;
        try (Stream<String> stream1 = Files.lines(Path.of("D:\\lulabeluga.txt"))){
            cantidad = stream1.filter(n -> n.toLowerCase().contains("error"))
                    .count();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(cantidad);


        /*
        6: Usa streams para obtener una nueva lista que contenga solo los nombres que empiecen con 'a', pero en mayúsculas y ordenados alfabéticamente.
        */

        List<String> nombres = List.of("ana", "mario", "luis", "andres", "lucia", "amalia");

        List<String> newlist = nombres.stream()
                .filter(n -> n.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newlist);

        /*
        7: Usa Streams para contar cuántos números son múltiplos de 5 y mayores que 10.
         */

        List<Integer> numeros = List.of(5, 12, 18, 7, 30, 25, 2, 10);

        long multiplos5 = numeros.stream()
                .filter(n -> n % 5 == 0 && n >= 10)
                .count();

        System.out.println(multiplos5);

        /*
        8: Usa Streams para encontrar el valor máximo y mostrarlo en consola.
           Si la lista estuviera vacía, que muestre "Lista vacía".
         */

        List<Integer> valores = List.of(45, 67, 12, 98, 34, 87, 23);

        Optional<Integer> maximo = valores.stream()
                .max(Integer::compareTo);
        maximo.ifPresentOrElse(
                m -> System.out.println("el maximo es: " + m),
                () -> System.out.println("Lista vacia")
        );

        /*
        9: Usa flatMap para obtener una sola lista con todos los elementos únicos (sin repetidos).
         */

        List<List<Integer>> listaDeListas = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 5),
                List.of(5, 6, 7)
        );

        List<Integer> listSinRepetir = listaDeListas.stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(listSinRepetir);

        /*
        10: Usa Collectors.groupingBy para agrupar las palabras por su longitud, de forma que obtengas un Map<Integer, List<String>>.
         */

        List<String> palabras = List.of("sol", "luna", "mar", "estrella", "cielo", "pez");

        Map<Integer, List<String>> listaPalabras = palabras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(listaPalabras);

        /*
        11: Dada una lista de enteros, usa reduce() para obtener la suma de los números impares mayores que 10.
            Si no hay ninguno, la suma debe ser 0.
         */

        List<Integer> listanumeros = List.of(3, 11, 14, 7, 19, 21);

        Optional<Integer> sumaImpares = listanumeros.stream()
                .filter(s -> s % 2 != 0 && s > 10)
                .reduce(Integer::sum);

        sumaImpares.ifPresentOrElse(
                si -> System.out.println("La suma de los numeros es: " + si),
                () -> System.out.println("El array esta vacio o no se cumple la condicion")
        );

        /*
        12: Dada una lista de Strings con nombres, usa Streams para:
            Verificar si alguno empieza con “A” (mayúscula o minúscula).
            Verificar si todos tienen más de 3 letras.
         */

        List<String> listaNombres = List.of("Ana", "Luis", "Andrés", "Jo");

        Boolean empiezaA = listaNombres.stream()
                .anyMatch(s -> s.toLowerCase().startsWith("a"));
        Boolean tiene3Letras = listaNombres.stream()
                .allMatch(s -> s.length() > 3);

        System.out.println(empiezaA);
        System.out.println(tiene3Letras);

        /*
        13: Dada una lista de precios (List<Double>), usa Streams para calcular el promedio de los valores mayores o iguales a 50.
            Si la lista está vacía o no hay precios que cumplan la condición, muestra “No hay precios válidos”.
         */

        List<Double> listaPrecios = List.of(45.5, 60.0, 120.5, 30.0);

        OptionalDouble promedio = listaPrecios.stream()
                .filter(s -> s >= 50)
                .mapToDouble(Double::doubleValue)
                .average();

        promedio.ifPresentOrElse(
                p -> System.out.println("El promedio es: " + p),
                () -> System.out.println("No hay precios validos")
        );

        /*
        14: Dada una lista de palabras (List<String>), usa Collectors.partitioningBy para crear un Map<Boolean, List<String>> que separe:
            true → palabras que contienen alguna vocal (a, e, i, o, u)
            false → palabras sin vocales
         */

        List<String> palabrasLocas = List.of("Sky", "sol", "Gym" , "mar");

        Map<Boolean, List<String>> palabrasVocales = palabrasLocas.stream()
                .collect(Collectors.partitioningBy(s -> s.matches(".*[aeiouAEIOU].*")));

        System.out.println(palabrasVocales);

        /*
        15: Crea una clase Producto con nombre y precio.
            Luego, dada una List<Producto>, usa Streams para encontrar el producto más caro.
            Muestra "Producto más caro: nombre - precio".
            Si la lista está vacía, muestra "No hay productos".
         */

        /*public double productoCaro(){

            Optional<Producto> prodCaro = listaProductos.stream()
                    .max(Comparator.comparing(Producto::getProdPrecio));

            prodCaro.ifPresentOrElse(
                    pc -> System.out.println("El producto mas caro es: " + pc),
                    () -> System.out.println("No hay productos")
            );
            return prodCaro.get().getProdPrecio();

        }*/

        /*
        16: Tienes una lista de pares (id, nombre) representados como List<String[]> donde cada String[] tiene {"id","nombre"}. Algunos id pueden repetirse con distinto nombre.
            Tarea: construir un Map<Integer, String> que use id como clave y concatene los nombres separados por ; cuando haya claves duplicadas (por ejemplo 1 -> "Juan;Juanito").
         */

        String[] array1 = {"1", "juan"};
        String[] array2 = {"2", "anita"};
        String[] array3 = {"2", "Ana"};
        String[] array4 = {"1", "juanito"};
        String[] array5 = {"3", "luis"};
        List<String[]> listaPares = List.of(array1, array2 ,array3, array4, array5);

        Map<Integer, String> listaFiltrada = listaPares.stream()
                .collect(Collectors.groupingBy(array -> Integer.parseInt(array[0]), Collectors.mapping(array -> array[1], Collectors.joining(";"))));
        System.out.println(listaFiltrada);

        /*
        17: Tienes List<String> de productos con formato "categoria:precio" (ej. "fruta:12.5").
            Crear un Map<String, Long> que cuente cuántos productos hay por categoría.
            Crear un Map<String, Double> que sume los precios por categoría.
            Ejemplo (entrada):
         */

        String[] array6 = {"fruta", "10.0"};
        String[] array7 = {"bebida", "5.5"};
        String[] array8 = {"fruta", "12.0"};
        String[] array9 = {"bebida", "30.0"};
        String[] array10 = {"cereales", "10.0"};

        List<String[]> listaProd = List.of(array6,array7,array8,array9,array10);

        Map<String, Long> map1 = listaProd.stream()
                .collect(Collectors.groupingBy(array -> array[0],Collectors.counting()));
        System.out.println(map1);

        Map<String, Double> map2 = listaProd.stream()
                .collect(Collectors.groupingBy(array -> array[0], Collectors.mapping(array-> Double.parseDouble(array[1]), Collectors.summingDouble(Double::doubleValue))));

        System.out.println(map2);

        /*
        18: Tienes una List<Integer> de edades.
            usar Collectors.summarizingInt para obtener IntSummaryStatistics y mostrar: count, sum, min, max, average (formatea el average con 2 decimales).
         */

        List<Integer> listaEdades = List.of(23, 45, 34, 23, 67, 34);

        IntSummaryStatistics listProcess = listaEdades.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        long contador = listProcess.getCount();
        long zuma = listProcess.getSum();
        int min = listProcess.getMin();
        int max = listProcess.getMax();
        double aver = listProcess.getAverage();
        String formate = String.format("%.2f", aver);

        System.out.println("count=" + contador + ", sum=" + zuma + ", min=" + min + ", max=" + max + ", avg=" + formate);

        /*
        19: Tienes List<String> donde cada string es una frase.
            extraer todas las palabras (separa por espacios), normalizarlas a minúsculas, eliminar puntuación simple (.,;:), y devolver una lista ordenada de palabras únicas (sin duplicados).
         */

        List<String> listaRandom = List.of("Hola mundo, mundo","Hola Java; Streams","java hola");

        /*Set<String> listProcesada = listaRandom.stream()
                .flatMap(lista -> Arrays.stream(lista.split(" ")))
                .map(s -> s.replaceAll("[^a-zA-Z]", ""))
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(TreeSet::new));*/

        List<String> listProcesada = listaRandom.stream()
                .flatMap(lista -> Arrays.stream(lista.split(" ")))
                .map(s -> s.replaceAll("[^a-zA-Z]", ""))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listProcesada);

        /*
        20: Tienes List<Integer> que puede estar vacía.
            Tarea: con IntStream:
            Filtrar números pares.
            Obtener el máximo de esos pares como OptionalInt.
            Si existe, imprimir "Máx par: X"; si no, imprimir "No hay pares".
         */

        List<Integer> listaNormal = List.of(1,8,4,10);

        OptionalInt listaFiltradaa = listaNormal.stream()
                .filter(s -> s % 2 == 0)
                .mapToInt(Integer::intValue)
                .max();
        if (listaFiltradaa.isPresent()){
            System.out.println(listaFiltradaa);
        }else {
            System.out.println("No hay pares");
        }

        /*
        21: Tienes una List<String[]> de empleados: {"id", "nombre", "salario"} (salario como "1200.0").
            Tarea: construir un Map<Integer, Double> que guarde para cada id la suma total de salarios (si el mismo id aparece más de una vez). Usa Collectors.toMap con mergeFunction.
         */

        String[] arrayEmp1 = {"1", "Raul", "1200"};
        String[] arrayEmp2 = {"2", "Penelope", "4000"};
        String[] arrayEmp3 = {"3", "Lorena", "1500"};
        String[] arrayEmp4 = {"3", "Georgina", "4512"};
        List<String[]> listaEmpleados = List.of(arrayEmp1,arrayEmp2,arrayEmp3,arrayEmp4);

        Map<Integer, Double> sumTotalSalarios= listaEmpleados.stream()
                        .collect(Collectors.toMap(array -> Integer.parseInt(array[0]), array -> Double.parseDouble(array[2]), Double::sum));

        System.out.println(sumTotalSalarios);

        /*
        22: Tienes List<String> con entradas "categoria:precio".
            Tarea: crear un Map<String, Double> que calcule el precio promedio por categoría (usa Collectors.averagingDouble). Ten cuidado con el parseo.
         */

        List<String> listaCatPrec = List.of( "Ropa:120.5", "Comida:50.0", "Ropa:80.0", "Juguetes:200.0");

        Map<String ,Double> listaPromedioCat = listaCatPrec.stream()
                .collect(Collectors.groupingBy(s -> s.split(":")[0], Collectors.averagingDouble(s -> Double.parseDouble(s.split(":")[1]))));

        System.out.println(listaPromedioCat);

        /*
        23: Tienes List<Integer> de edades.
            Tarea: particiona en >= 18 (adultos) y < 18 (menores) usando partitioningBy, y devuelve un Map<Boolean, Long> con la cantidad de personas en cada grupo
            (usa downstream counting()). Muestra además la lista de adultos (como List<Integer>) usando otro collector.
         */

        List<Integer> listaEdad = List.of(1,54,25,36,51,42);

        Map<Boolean, Long> listaMayores = listaEdad.stream()
                .collect(Collectors.partitioningBy(s -> s>=18, Collectors.counting()));

        System.out.println(listaMayores.get(false));
        System.out.println(listaMayores.get(true));

        List<Integer> listaAdultos = listaEdad.stream()
                .filter(s -> s>= 18)
                .toList();
        System.out.println(listaAdultos);

        /*
        24: Tienes List<String> de tags: ["java","streams","lambda"].
            Tarea: transforma cada tag a #tag (prefijo #) y luego concatena todos con , usando Collectors.joining(", "). Resultado: "#java, #streams, #lambda".
         */

        List<String> listaTags = List.of("java","streams","lambda");

        List<String> listaTransformaTags = Collections.singletonList(listaTags.stream()
                .map("#"::concat)
                .collect(Collectors.joining(", ")));

        System.out.println(listaTransformaTags);

        /*
        25: Tarea: genera una lista de String con los primeros n cuadrados en formato "i -> i^2"
            (por ejemplo para n=5: ["1 -> 1","2 -> 4","3 -> 9","4 -> 16","5 -> 25"]) usando IntStream.rangeClosed(1, n).mapToObj(...) y recolecta a List<String>.
         */

        List<String> listaPrimerosCuadrados = IntStream.rangeClosed(1,9)
                .mapToObj(i -> i + " -> " + (i * i))
                .toList();

        System.out.println(listaPrimerosCuadrados);

        /*
        26: Tarea: construye un Map<String, Long> que cuente cuántas veces aparece cada palabra (usa groupingBy + counting()).
         */

        List<String> listaPalabrasRepetidas = List.of("limon" , "limon", "azucar", "pescado", "azucar");

        Map<String, Long> listaConteoPalabras = listaPalabrasRepetidas.stream()
                .collect(Collectors.groupingBy(s -> s , Collectors.counting()));

        System.out.println(listaConteoPalabras);

        /*
        27: Tarea: construir Map<String, Integer> con la suma total de puntuaciones por nombre (usa toMap con merge function).
         */

        List<String> entradas = List.of("ana:10", "bob:5", "ana:20", "carl:7", "bob:3");

        Map<String, Integer> listaSuma = entradas.stream()
                .collect(Collectors.groupingBy(s -> s.split(":")[0], Collectors.summingInt(s -> Integer.parseInt(s.split(":")[1]))));

        System.out.println(listaSuma);

        /*
        28: Tarea: crea Map<Integer, Set<String>> donde la clave es la longitud y el valor es un Set<String> con las palabras de esa longitud en mayúsculas
            (usa groupingBy + mapping + toSet()).
         */

        List<String> palabrasClave = List.of("sol","luna","mar","estrella","cielo","pez");

        Map<Integer, Set<String>> palabrasMayusculas = palabrasClave.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toSet())));

        System.out.println(palabrasMayusculas);

        /*
        29: Tarea: produce dos cosas con Streams:
            Map<Boolean, Integer> que guarde la suma de los números pares (true) y la suma de los impares (false) (usa partitioningBy con Collectors.summingInt).
            Imprime también la lista de pares y la lista de impares (puedes obtenerla con partitioningBy(..., toList()) o con filter + collect).
         */

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, Integer> paresImpares = nums.stream()
                .collect(Collectors.partitioningBy(s -> s % 2 == 0, Collectors.summingInt(Integer::intValue)));

        Map<Boolean, List<Integer>> listaParesImpares = nums.stream()
                        .collect(Collectors.partitioningBy(s -> s % 2 == 0, Collectors.toList()));

        System.out.println("pares = " + paresImpares.get(true));
        System.out.println("impares = " + paresImpares.get(false));

        System.out.println("lista pares = " + listaParesImpares.get(true));
        System.out.println("lista impares = " + listaParesImpares.get(false));

        /*
        30: Dado n = 6, genera una cadena que contenga "1=1,2=4,3=9,4=16,5=25,6=36" usando IntStream.rangeClosed(1, n).mapToObj(...).collect(Collectors.joining(",")).
         */

        List<String> cadena = Collections.singletonList(IntStream.rangeClosed(1, 6)
                .mapToObj(i -> i + "=" + i * i)
                .collect(Collectors.joining(",")));

        System.out.println(cadena);
    }
}
