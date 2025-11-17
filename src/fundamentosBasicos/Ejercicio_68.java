package fundamentosBasicos;

public class Ejercicio_68 {
    public static void main(String[]args){
        /*
        68: Elementos únicos
            Dado un array de enteros, imprime los valores sin repetir (no usar Set todavía).
            Ejemplo: [2, 2, 3, 4, 3] → 2, 3, 4
         */

        int[] array = {2,3,2,4};

        for (int i = 0; i < array.length; i++){
            boolean repetido = false;
            for (int j = 0; j < i; j++){
                if (array[i] == array[j]){
                    repetido = true;
                    break;
                }
            }
            if (!repetido){
                System.out.print(array[i] + " ");
            }
        }

    }
}
