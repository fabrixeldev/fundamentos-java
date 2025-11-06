package fundamentosBasicos;

public class Ejercicio_29 {
    public static void main(String[]args){
        /*
        9: Dados a, b, c positivos:
            Si no cumplen desigualdad triangular, “no válido”.
            Si a==b==c: equilátero.
            Si dos lados iguales: isósceles.
            Si los tres distintos: escaleno.
         */
        int ladoA = 5;
        int ladoB = 5;
        int ladoC = 98;

        if (ladoA > 0 && ladoB > 0 && ladoC > 0 &&
                ladoA + ladoB > ladoC &&
                ladoA + ladoC > ladoB &&
                ladoB + ladoC > ladoA){
            if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA){
                System.out.println("Equilatero");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        }else {
            System.out.println("Valor invalido");
        }
    }
}
