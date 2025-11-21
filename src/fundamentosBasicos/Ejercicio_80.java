package fundamentosBasicos;

import java.util.Arrays;
import java.util.Optional;

public class Ejercicio_80 {
    public static void main(String[]args){
        /*
        80: Optional<Double> mediana(int[] a) — devuelve Optional.empty() si a.length==0, implementa sin mutar a (haz copia).
         */

        int[] array = {1,2,3,4,5,6,7,8};

        System.out.println(mediana(array));
    }

    public static Optional<Double> mediana (int[] a){
        int [] copia = Arrays.copyOf(a,a.length);
        if (copia.length == 0){
            return Optional.empty();
        }
        Arrays.sort(copia);
        double calc = 0;
        if (copia.length % 2 == 0){
            calc = (double) ((copia[copia.length/2]) + (copia[copia.length/2 -1])) /2;
        }else {
            calc = (double) (copia[copia.length/2]);
        }
        return Optional.of(calc);
    }
}
