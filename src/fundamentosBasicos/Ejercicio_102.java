package fundamentosBasicos;

public class Ejercicio_102 {
    public static void main(String[]args){
        /*Dado un número n: Si tiene 1 dígito → imprime "Pequeño", Si tiene 2 dígitos → imprime "Mediano", Si tiene 3 o más dígitos → imprime "Grande"*/
        int numero = Math.abs(-10);
        int contador = 0;

        while (numero > 0){
            numero = numero / 10;
            contador++;
        }
        if (contador == 1){
            System.out.println("PEQUEÑO");
        } else if (contador == 2) {
            System.out.println("MEDIANO");
        }else if (contador >= 3){
            System.out.println("GRANDE");
        }

    }
}
