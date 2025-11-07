package fundamentosBasicos;

public class Ejercicio_39 {
    public static void main(String[]args){
        /*
        39: Dado un número entre 0 y 23, indicar si corresponde a la mañana, tarde, noche o madrugada.
         */
        int numeroHora = 00;
        if (numeroHora >= 0 && numeroHora <= 6){
            System.out.println("Madrugada");
        } else if (numeroHora > 6 && numeroHora <= 12) {
            System.out.println("Mañana");
        } else if (numeroHora > 12 && numeroHora <= 18) {
            System.out.println("Tarde");
        } else if (numeroHora > 18 && numeroHora <= 23) {
            System.out.println("Noche");
        }
    }
}
