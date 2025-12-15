package fundamentosBasicos;

public class Ejercicio_94 {
    public static void main(String[]args){
        /*Dado un array de enteros, crea una función que devuelva cuántos números son mayores que el promedio del array.*/
        int array[] = {2,4,6,8};
        Ejercicio_94 ejercicio94 = new Ejercicio_94();
        System.out.println(ejercicio94.calcularNumerosPromedio(array));
    }

    public int calcularNumerosPromedio(int a[]){
        int suma = 0;
        double promedio = 0;
        int contador = 0;
        for (int i = 0; i < a.length; i++){
            suma += a[i];
        }
        promedio = (double) suma / a.length;
        for (int i = 0; i < a.length; i++){
            if (promedio > a[i]){
                contador++;
            }
        }
        return contador;
    }
}
