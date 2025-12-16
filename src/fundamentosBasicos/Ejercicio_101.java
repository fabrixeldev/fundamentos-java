package fundamentosBasicos;

public class Ejercicio_101 {
    public static void main(String[]args){
        /*
        Dado un número n: Si es negativo → imprime "Número inválido", Si es 0 → imprime "Cero", Si es positivo:, imprime si es par o impar*/
        int numero = 11;
        if (numero != 0){
            if (numero > 0){
                if (numero % 2 == 0){
                    System.out.println("NUMERO PAR");
                }else {
                    System.out.println("NUMERO IMPAR");
                }
            }else {
                System.out.println("NUMERO INVALIDO");
            }
        }else {
            System.out.println("CERO");
        }
    }
}
