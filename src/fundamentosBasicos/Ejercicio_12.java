package fundamentosBasicos;

public class Ejercicio_12 {
    public static void main(String[]args){
        /*
        12: Intercambia a=7, b=9 sin usar variable extra. (suma/resta o XOR; comenta riesgos de overflow)
         */
        int a = 7;
        int b = 9;

        a = a ^ b;
        b= a ^ b;
        a = b ^ a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        //A lo que se entiende por overflow es el desbordamiento que pueden ocurrir al hacer o utilzar algunas herramientas o metodos dentro de la JVM
    }
}
