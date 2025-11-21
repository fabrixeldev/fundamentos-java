package fundamentosBasicos;

import java.util.function.*;

public class Ejercicio_81 {
    public static void main(String[]args){
        /*
        LAMBDAS
        81:
        1: Predicate
            Escribe una lambda que verifique si un número entero es mayor a 100.
            Input: 150 → Output: true.
            Input: 80 → Output: false.
         */

        Predicate<Integer> mayor = x -> x>100;
        System.out.println(mayor.test(80));

        /*
        2: Predicate
            Escribe una lambda que verifique si una cadena empieza con la letra "A".
            Input: "Amigo" → Output: true.
            Input: "java" → Output: false.
         */

        String cadenaa = "Amigo";
        Function<String,String> iC = x -> x.toLowerCase();
        Predicate<String> sW = x -> x.startsWith("a");
        System.out.println(sW.test(iC.apply(cadenaa)));

        /*
        3: Function
            Escribe una lambda que convierta una cadena a mayúsculas.
            Input: "hola" → Output: "HOLA".
         */

        Function<String,String> function = x -> x.toUpperCase();
        System.out.println(function.apply("hola"));

        /*
        4:Function
            Escribe una lambda que tome un número y devuelva su valor absoluto (positivo).
            Input: -9 → Output: 9.
         */

        Function<Integer,Integer> function1 = x -> Math.abs(x);
        System.out.println(function1.apply(-11));

        /*
        5:Consumer
            Escribe una lambda que reciba un nombre y lo imprima con el mensaje: "Bienvenido, <nombre>".
            Input: "Carlos" → Output en consola: Bienvenido, Carlos.
         */

        Consumer<String> consumer = x -> System.out.println("Bienvenido, " + x);
        consumer.accept("Carlos");

        /*
        6: Consumer
            Escribe una lambda que reciba un número y muestre en consola el número multiplicado por 10.
            Input: 7 → Output en consola: 70.
         */

        Consumer<Integer> consumer1 = x -> System.out.println(x * 10);
        consumer1.accept(7);

        /*
        7: Supplier
            Escribe una lambda que genere un número aleatorio entre 0 y 1.
            Output: un número tipo 0.12345....
         */

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        /*
        8: UnaryOperator
            Escribe una lambda que calcule el cuadrado de un número.
            Input: 6 → Output: 36.
         */

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(3));

        /*
        9: BinaryOperator
            Escribe una lambda que tome dos números enteros y devuelva el mayor.
            Input: (10, 25) → Output: 25.
         */

        BinaryOperator<Integer> binaryOperator = (x,y) -> {
            int mayorr = 0;
            if (x > y){
                mayorr = x;
            }else {
                mayorr = y;
            }
            return mayorr;
        };
        System.out.println(binaryOperator.apply(10,25));

        /*
        10: BiFunction
            Escribe una lambda que tome un String y un Integer, y devuelva el string repetido n veces.
            Input: ("Hi", 3) → Output: "HiHiHi".
         */

        BiFunction<String,Integer,String> biFunction = (texto,veces) -> texto.repeat(veces);
        System.out.println(biFunction.apply("Hi",10));
    }
}
