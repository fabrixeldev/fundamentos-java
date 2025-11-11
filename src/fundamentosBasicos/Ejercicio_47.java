package fundamentosBasicos;

public class Ejercicio_47 {
    public static void main(String[]args){
        /*
        47: Dada una cantidad k y luego k números, calcula máximo, mínimo y promedio. Maneja k = 0 (imprime mensaje “no hay datos”).
            Tip: inicia max = Integer.MIN_VALUE, min = Integer.MAX_VALUE.
         */
        int k = 10;
        int kabs = Math.abs(k);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double promedio = 0;
        int numero = 0;

        if (k == 0){
            System.out.println("No hay datos");
        }else{
            for (int i = 0; i< k ; i++){
                numero = (int) (Math.random() * 100);
                System.out.println(numero);
                if (numero < min){
                    min = numero;
                }
                if (numero > max){
                    max = numero;
                }
                promedio += numero;

                /*while (kabs > 0){
                    numero = (int) (Math.random() * 100);
                    System.out.println(numero);
                    if (numero < min){
                        min = numero;
                    }
                    if (numero > max){
                        max = numero;
                    }
                    promedio += numero;
                    kabs -= 1;*/
            }
        }
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio/ k);
    }
}
















/*while (k > 0){
                numeros = (int) (Math.random() * 100);
                System.out.println(numeros);
                min =numeros;
                k -= 1;

            }*/