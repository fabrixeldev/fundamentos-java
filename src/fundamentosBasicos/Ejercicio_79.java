package fundamentosBasicos;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio_79 {
    public static void main(String[]args){
        /*
        79: long fibMemo(int n) — versión con memoización (Map).
         */

        int serie = 9;
        System.out.println(fibMemo(serie));

    }

    public static Map<Integer, Long> memo = new HashMap<>();
    public static long fibMemo(int n){

        if (n <= 1){return n;}
        if (memo.containsKey(n)){ return memo.get(n);}
        long temp = fibMemo(n-1) + fibMemo(n-2);
        memo.put(n,temp);
        return temp;
    }
}
