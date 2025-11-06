package fundamentosBasicos;

public class Ejercicio_28 {
    public static void main(String[]args){
        /*
        8: Precio base 100. Si edad < 12 50% descuento; si edad >= 65 30%; caso contrario, sin descuento. Aplica solo un tramo.
         */
        int edad = 30;
        double basePrecio = 100.0;
        double descuento;

        if (edad < 12){
            descuento = basePrecio - (basePrecio * 0.5);
            System.out.println(descuento);
        }else if (edad >= 65){
            descuento = basePrecio - (basePrecio * 0.3);
            System.out.println(descuento);
        }else {
            System.out.println(Math.round(basePrecio) + " Sin descuento");
        }
    }
}
