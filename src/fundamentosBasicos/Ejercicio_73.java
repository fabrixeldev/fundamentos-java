package fundamentosBasicos;

public class Ejercicio_73 {
    public static void main (String[]args){
        /*
        73: int[] invertirArray(int[] a) — devuelve nueva copia invertida (no modificar entrada).
         */

        int array[] = {11,2,3,45,5};
            array = invertirArray(array);
        for (int ca : array){
            System.out.print(ca + " ");
        }
    }

    public static int[] invertirArray(int[] a){
        int[] copia = new int[a.length];
        for(int i = 0 ; i < a.length; i++){
            copia[i] = a[a.length - 1 - i];
        }
        return copia;
    }

}
