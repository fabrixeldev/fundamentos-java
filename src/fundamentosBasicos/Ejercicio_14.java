package fundamentosBasicos;

public class Ejercicio_14 {
    public static void main(String[]args){
         /*
        14: Área y circunferencia de un círculo , Radio = 12. Calcula área y circunferencia. Usa Math.PI.
         */
        int radioC = 12;
        double areaC = (Math.PI * Math.pow(radioC, 2.0));
        double circunferenciaC = 2.0 * Math.PI * radioC;

        System.out.println("El area del Cirulo es: " + areaC + " La circunferencia del circulo es: " + circunferenciaC);
    }
}
