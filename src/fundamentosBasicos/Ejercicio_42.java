package fundamentosBasicos;

public class Ejercicio_42 {
    public static void main(String[]args){
        /*
        42: Contar cuántos números pares e impares hay entre 1 y n (incluidos).
        Tip: un solo for y dos contadores.
         */
        int n = 10;
        int contPar = 0;
        int contImpar = 0;

        for (int i = 1 ; i <= n ; i++){
            if (i % 2 == 0){
                contPar++;
            }else {
                contImpar++;
            }
        }
        System.out.println("Hay un total de: " + contPar + " pares.");
        System.out.println("Hay un total de: " + contImpar + " impares.");
    }
}
