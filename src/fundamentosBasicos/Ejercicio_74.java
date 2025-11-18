package fundamentosBasicos;

public class Ejercicio_74 {
    public static void main(String[]args){
        /*
        74: double promedio(int[] a) — validar a.length == 0.
         */

        int[] numeros = {1,2,3,4,5,6,7,8,9,1,10};
        double promedio = promedio(numeros);
        System.out.println(promedio);
    }

    public static double promedio (int[] a){
        if (a.length == 0){
            throw new IllegalArgumentException("El array no debe estar vacio");
        }
        int suma = 0;
        double prom = 0;
        for (int i = 0; i < a.length; i++){
            suma += a[i];
        }
        prom = (double) suma / a.length;
        return prom;
    }
}
