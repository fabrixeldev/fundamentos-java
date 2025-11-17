package fundamentosBasicos;

public class Ejercicio_69 {
    public static void main(String[]args){
        /*
        69: Desplazamiento circular
            Dado un array, rota sus elementos una posición a la derecha.
            Ejemplo: [1, 2, 3, 4] → [4, 1, 2, 3]
         */

        int[] array = {7,16,32,47,58};
        int[] secondArraY = new int[array.length];
        secondArraY[0] = array[array.length - 1];

        for(int i = 1 ; i < array.length ; i++){
           secondArraY[i] = array[i-1];
        }

        System.out.println("ARRAY ORIGINAL");
        for (int a : array){
            System.out.print(a + " ");
        }

        System.out.println("\nARRAY DESPLAZADO");
        for (int sa : secondArraY){
            System.out.print(sa + " ");
        }
    }
}
