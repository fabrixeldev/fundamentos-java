package fundamentosBasicos;

import java.math.BigInteger;

public class Ejercicio_71 {
    public static void main(String[]args){
        /*
        FUNCIONES O METODOS
        71: int factorial(int n) — iterativo y recursivo.
         */

        Ejercicio_71 ejerFact= new Ejercicio_71();
        System.out.println(ejerFact.calcularFactorial(12));
    }

    public BigInteger calcularFactorial(int n){
        if (n < 0 ){
            throw new IllegalArgumentException("El numero no debe ser NEGATIVO");
        }
        if (n == 0 || n == 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calcularFactorial(n-1));
    }
}
