package fundamentosBasicos;

public class Ejercicio_89 {
    public static void main(String[]args){
        /*Escribe una función que reciba un array de enteros y devuelva la diferencia entre el máximo y el mínimo.*/
        int array[] = {2,4,6,8};
        Ejercicio_89 ejercicio89 = new Ejercicio_89();
        System.out.println(ejercicio89.diferenciaMaxMin(array));
    }

    public int diferenciaMaxMin(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diferencia = 0;
        if (array.length != 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] > max){
                    max = array[i];
                }
                if (array[i] < min){
                    min = array[i];
                }
            }
            diferencia = max - min;
        }else {
            System.out.println("El Array no tiene valores");
        }
        return diferencia;
    }
}
