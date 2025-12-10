package fundamentosBasicos;

public class Ejercicio_83 {
    public static void main(String[] args){
        /*Escribe una función recursiva contarDigitos(int n) que cuente cuántos dígitos tiene un número entero positivo.
          No uses conversión a String.*/

        int numero = 100;
        Ejercicio_83 ejercicio83 = new Ejercicio_83();
        System.out.println(ejercicio83.contarDigitos(numero));
    }

    public int contarDigitos(int n){
        int contador = 0;
        n = Math.abs(n);
        if (n == 0){
            contador++;
        }else {
            while (n > 0){
                n = n / 10;
                contador++;
                contarDigitos(n);
            }
        }
        return contador;
    }
}
