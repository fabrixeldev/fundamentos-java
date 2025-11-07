package fundamentosBasicos;

public class Ejercicio_34 {
    public static void main(String[]args){
        /*
        34: Dado un año, determinar si es siglo (ej: 1900, 2000) o no.
         */
        int anio = 2000;
        if (anio % 100 == 0){
            System.out.println("Es siglo");
        }else {
            System.out.println("No es siglo");
        }
    }
}
