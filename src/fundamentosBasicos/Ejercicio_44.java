package fundamentosBasicos;

public class Ejercicio_44 {
    public static void main(String []args){
        /*
        44: Tabla de multiplicar de m del 1 al 12.
            Salida esperada: m x 1 = ... hasta m x 12 = ....
         */
        int m = 3;
        int res = 0;

        for (int i = 1 ; i <= 12 ; i++){
            res = m * i;
            System.out.println(m + " x " + i + " = " + res);
        }
    }
}
