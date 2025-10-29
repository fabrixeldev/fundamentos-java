package fundamentosBasicos;

public class Ejercicio_3 {
    public static void main (String[] args){
        /*
        3: Si una hamburguesa cuesta 35 Bs y compras 3 hamburguesas, ¿cuál es el costo total?
         */
        int cantidadHamburguesas = 3;
        int precioUnidad = 35;

        int precioTotal = cantidadHamburguesas * precioUnidad;
        System.out.println("El total a pagar es: " + precioTotal);
    }
}
