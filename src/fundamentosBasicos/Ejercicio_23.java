package fundamentosBasicos;

public class Ejercicio_23 {
    public static void main(String[]args){
        /*
        3: Dada una nota 0–100:
        90–100: A, 80–89: B, 70–79: C, 60–69: D, <60: F.
        Cuida bordes con >= y <=.
         */
        int nota = 100;
        if (nota >= 90 && nota <=100){
            System.out.println("A");
        }else if (nota >= 80 && nota <= 89){
            System.out.println("B");
        }else if (nota >= 70 && nota <= 79){
            System.out.println("C");
        }else if (nota >= 60 && nota <= 69){
            System.out.println("D");
        }else if (nota < 60){
            System.out.println("F");
        }
    }
}
