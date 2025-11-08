package fundamentosBasicos;

public class Ejercicio_43 {
    public static void main(String []args){
        /*
        43: Suma con sentinela: dados muchos enteros, acumula hasta que x == 0. Imprime suma y cantidad de números sumados.
            Tip: while (x != 0) { ... }.
         */
        int x = 10;
        long suma = 0;
        long cantSum = 0;

        while (x >= 1){
            suma += x;
            cantSum++;
            x -= 1;
        }
        System.out.println("La suma total es: " +suma);
        System.out.println("La cantidad de numeros sumados es: " + cantSum);
    }
}
