package fundamentosBasicos;

public class Ejercicio_13 {
    public static void main(String[]args){
        /*
        13: Demuestra con código que int puede desbordar al multiplicar 50_000 * 50_000. Luego corrígelo usando long y Math.multiplyExact. (muestra la diferencia)
         */
        int multiplicacion = 50000 * 50000;
        System.out.println(multiplicacion);

        long num1 = 50000;
        long multip = Math.multiplyExact(num1, num1);
        System.out.println(multip);
    }
}
