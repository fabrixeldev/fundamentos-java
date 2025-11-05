package fundamentosBasicos;

public class Ejercicio_25 {
    public static void main(String[]args){
        /*
        5: Imprime “OK” si s no es nulo y no está vacío (largo > 0), “VACÍO” en caso contrario. Usa cortocircuito correctamente.
         */
        String s = "11";
        if (s != null && !s.isEmpty()) {
            System.out.println("OK");
        } else {
            System.out.println("VACIO");
        }
    }
}
