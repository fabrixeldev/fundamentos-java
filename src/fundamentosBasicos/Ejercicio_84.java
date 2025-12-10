package fundamentosBasicos;

public class Ejercicio_84 {
    public static void main(String[]args){
        /*Dado un array de enteros, escribe una función que devuelva true si la suma de sus elementos pares es mayor que la suma de sus elementos impares.*/
        int array[] = {2,3,4,5};
        Ejercicio_84 ejercicio84 = new Ejercicio_84();
        System.out.println(ejercicio84.sumaElementos(array));
    }

    public boolean sumaElementos(int array[]){
        boolean token = false;
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 0; i < array.length ; i++){
            if (array[i] % 2 == 0){
                sumaPar += array[i];
            }
            if (array[i] % 2 != 0){
                sumaImpar += array[i];
            }
        }
        System.out.println("Suma de numeros pares = " + sumaPar);
        System.out.println("Suma de numeros impares = " + sumaImpar);
        if (sumaPar > sumaImpar) {
            token = true;
        }
        return token;
    }
}
