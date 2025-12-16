package fundamentosBasicos;

public class Ejercicio_98 {
    public static void main(String[]args){
        /*Dado un número n, cuenta cuántos números entre 1 y n son: pares y mayores que 10*/
        int numero = 100;
        int contadorPares = 0;
        int contadorMayores = 0;

        while (numero > 0){
            if (numero % 2 == 0){
                contadorPares++;
            }
            if (numero > 10){
                contadorMayores++;
            }
            numero--;
        }

        System.out.println("Cantidad de numeros Pares = " + contadorPares);
        System.out.println("Cantidad de numeros mayores a 10 = " + contadorMayores);
    }
}
