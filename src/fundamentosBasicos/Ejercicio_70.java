package fundamentosBasicos;

public class Ejercicio_70 {
    public static void main (String[]args){
        /*
        70: Segundo mayor
            Dado un array de enteros, encuentra el segundo número más grande (sin ordenar con librerías).
         */

        int[] array = {55,66,66,777,11,77,157,1, 777};
        int temporal =  0;

        for (int i = array.length -1; i > 0; i--){
            for(int j = array.length -1 ; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temporal = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temporal;
                }
            }
        }

        for (int a : array){
            System.out.print(a + " ");
        }

        System.out.println("\nEl segundo numero mayor del array es: " + array[array.length-2]);

    }
}
