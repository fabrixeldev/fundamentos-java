package fundamentosBasicos;

public class Ejercicio_45 {
    public static void main(String[]args){
        /*
        45: Invertir un número entero n (sin usar String). Luego indica si es capicúa.
         */
        int n = 123;
        int numero = Math.abs(n);
        int rev = 0;
        while (numero > 0){
            int dig = numero % 10;
            rev = rev * 10 + dig;
            numero /= 10;
        }

        if (rev == n){
            System.out.println("El numero " + rev + " es igual a " + n + " POR LO TANTO ES CAPICUA");
        }else {
            System.out.println("El numero " + rev + " no es igual a " + n + " POR LO TANTO NO ES CAPICUA");
        }
    }
}
