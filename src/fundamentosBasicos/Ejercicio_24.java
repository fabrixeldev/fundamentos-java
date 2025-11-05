package fundamentosBasicos;

public class Ejercicio_24 {
    public static void main(String[]args){
        /*
        4: Reglas: divisible por 4; excepto siglos (divisible por 100) que no son bisiestos, salvo si son divisibles por 400.
         */

        int anio = 1900;
        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)){
            System.out.println("Si es año bisiesto");
        }else {
            System.out.println("No es año bisiesto");
        }
    }
}
