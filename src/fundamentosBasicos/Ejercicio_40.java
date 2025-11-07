package fundamentosBasicos;

public class Ejercicio_40 {
    public static void main(String[]args){
        /*
        40: Dado un puntaje de 0–100, convertirlo en una nota cualitativa:
            90–100 → “Excelente”
            70–89 → “Bueno”
            50–69 → “Regular”
            <50 → “Deficiente”
         */
        int puntaje = 65;

        if (puntaje >= 90 && puntaje <= 100){
            System.out.println("Excelente");
        } else if (puntaje >= 70 && puntaje <= 89) {
            System.out.println("Bueno");
        } else if (puntaje >= 50 && puntaje <= 69) {
            System.out.println("Regular");
        } else if (puntaje >=0 && puntaje < 50) {
            System.out.println("Deficiente");
        }
    }
}
