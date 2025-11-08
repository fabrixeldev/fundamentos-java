package fundamentosBasicos;

public class Ejercicio_41 {
    public static void main(String[]args){
        /*
        41: Suma de 1 a n (n ≥ 1). Imprime la suma total y demuestra con fórmula n*(n+1)/2 que coincide (usa long para evitar overflow con n grande).
            Tip: calcula por bucle y por fórmula, compara.
         */
        long n = 4;
        long acum = 0;
        long formula = n*(n+1)/2;

        for (int i = 1; i <= n ; i++){
            acum += i;
        }
        if (formula == acum){
            System.out.println("La suma por formula: " + formula + " coincide con la suma por bucle: " + acum);
        }else {
            System.out.println("La suma no coincide");
        }
    }
}
