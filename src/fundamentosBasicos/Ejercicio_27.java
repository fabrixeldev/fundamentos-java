package fundamentosBasicos;

public class Ejercicio_27 {
    public static void main(String[]args){
        /*
        7: Dado mes (1–12), asigna dias (ignora bisiesto en febrero). Usa múltiples etiquetas por caso.
         */
        int meses;
        switch (meses = 12){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 2 -> System.out.println(28);
            default -> System.out.println("Mes invalido");
        }
    }
}
