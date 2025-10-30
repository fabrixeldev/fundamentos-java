package fundamentosBasicos;

public class Ejercicio_10 {
    public static void main(String[]args){
        /*
        10: Para n = 4_371, obtén el último dígito, el primer dígito y la suma de todos los dígitos. (/ y % encadenados; evita String por ahora)
         */
        int nume = 4371;
        int acumulador = 0;

        int primerDigito = nume / 1000;
        acumulador = acumulador + primerDigito;

        int segundoDigito = (nume / 100) % 10;
        acumulador = acumulador + segundoDigito;

        int tercerDigito = (nume / 10) % 10;
        acumulador = acumulador + tercerDigito;

        int cuartoDigito = (nume / 1) % 10;
        acumulador = acumulador + cuartoDigito;

        System.out.println(primerDigito);
        System.out.println(cuartoDigito);
        System.out.println("La suma de los digitos del numero 4371 es: " + acumulador);
    }
}
