package fundamentosBasicos;

public class Ejercicio_16 {
    public static void main(String[]args){
        /*
        16: Dados catetos 9 y 12, calcula la hipotenusa. Usa Math.sqrt.
         */
        int catetoA = 9;
        int catetoB = 12;
        double hipot = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));

        System.out.println("La Hipotenusa de los catetos A y B es: " + hipot);
    }
}
