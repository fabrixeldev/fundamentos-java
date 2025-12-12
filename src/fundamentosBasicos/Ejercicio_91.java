package fundamentosBasicos;

public class Ejercicio_91 {
    public static void main(String[]args){
        /*Escribe una función recursiva sumaHastaN(int n)*/
        int numero = 16;
        Ejercicio_91 ejercicio91 = new Ejercicio_91();
        System.out.println(ejercicio91.sumarHastaN(numero));
    }

    public int sumarHastaN(int n) {
        if (n == 0){
            return 0;
        }
        return n + sumarHastaN(n-1);
    }
}
