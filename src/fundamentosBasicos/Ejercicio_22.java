package fundamentosBasicos;

public class Ejercicio_22 {
    public static void main(String []args){
        /*
        2: Primero, encuentra el mayor de a y b. Luego, extiéndelo para a, b, c usando solo if/else o ternario.
         */
        int x = 11;
        int y = 9;
        int z = 11;

        if (x>=y && x>=z){
            System.out.println("El mayor es: " + x);
        }else if (y>=z && y>=x){
            System.out.println("El mayor es: "+ y);
        }else{
            System.out.println("El mayor es: " + z);
        }
    }
}
