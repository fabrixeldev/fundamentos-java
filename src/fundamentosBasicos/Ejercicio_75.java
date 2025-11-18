package fundamentosBasicos;

public class Ejercicio_75 {
    public static void main(String[]args){
        /*
        75: int max(int[] a) y int segundoMax(int[] a) — manejo de duplicados.
         */
        int [] array = {7,7,7};
        int maxNumero = max(array);
        System.out.println("El numero maximo del array es " + maxNumero);

        int segMax = segundoMax(array);
        System.out.println("El segundo numero mas grande del array es " + segMax);
    }

    public static int max(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < a.length; i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static int segundoMax(int[] a){
        int max = Integer.MIN_VALUE;
        int segMax = Integer.MIN_VALUE;
        for (int i = 0; i< a.length; i++){
            if (a[i] > max){
                max = a[i];
            }else if (a[i] > segMax && a[i] < max ){
                segMax = a[i];
            }
        }
        return segMax;
    }
}
