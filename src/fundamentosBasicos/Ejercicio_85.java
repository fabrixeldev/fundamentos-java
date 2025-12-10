package fundamentosBasicos;

public class Ejercicio_85 {
    public static void main(String[]args){
        /* Genera el patron de Diamante y Piramide utilizando for anidados*/
        //PIRAMIDE
        int n = 5;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //DIAMANTE
        for (int i = 1; i <= n ; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
