package fundamentosBasicos;

public class Ejercicio_99 {
    public static void main(String[]args){
        /*Dado un número n, calcula la suma de todos los números: del 1 al n, excepto los múltiplos de 3*/
        int n = 10;
        int suma = 0;

        for (int i = 1; i < n; i++){
            if (i % 3 == 0){
                continue;
            }else {
                suma += i;
            }
        }
        System.out.println("La suma acumulativa de los numeros a excepcion de los multiplos de 3 es = " + suma);
    }
}
