package fundamentosBasicos;

public class Ejercicio_76 {
    public static void main(String[]args){
        /*
        76: boolean esCapicua(int n) — usar método helper invertirNumero(int n).
         */
        int n =5225;
        boolean capicua = esCapicua(n);
        System.out.println("El numero " + n + " ¿Es Capicua? " + capicua );

    }

    public static boolean esCapicua(int n){
        if (invertirNumero(n) == n){
            return true;
        }else{
            return false;
        }
    }

    public static int invertirNumero(int n){
        int rev = 0;
        int dig = 0;
        while (n > 0){
            dig = n % 10;
            rev = rev * 10 + dig;
            n /= 10;
        }
        return rev;
    }
}
