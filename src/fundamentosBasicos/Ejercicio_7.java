package fundamentosBasicos;

public class Ejercicio_7 {
    public static void main(String[]args){
        /*
        7: Rectángulo de base 13 y altura 7. Calcula perímetro y área. (usa final y muestra ambas)
         */

        final int BASE = 13;
        final int ALTURA = 7;

        double perimetro = 2 * (BASE + ALTURA);
        double area = BASE * ALTURA;

        System.out.println("El perimetro del Rectangulo es: " + perimetro);
        System.out.println("El area del Rectangulo es: " + area);
    }
}
