package fundamentosBasicos;

public class Ejercicio_48 {
    public static void main(String[]args) {
        /*
        48: Dado un rango [a, b] (a ≤ b), encuentra el primer múltiplo de 7 en ese rango. Si no existe, indícalo.
            Tip: recorre y usa break al encontrar.
         */
        int multiploSiete = 0;

        for (int i = 15; i <= 21; i++) {
            if (i % 7 == 0) {
                multiploSiete += i;
                break;
            }
        }

        if (multiploSiete != 0){
            System.out.println("El primer multiplo de 7 encontrado es: " + multiploSiete);
        }else {
            System.out.println("No existe");
        }

    }
}

