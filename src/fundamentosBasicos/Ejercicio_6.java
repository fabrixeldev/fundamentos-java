package fundamentosBasicos;

public class Ejercicio_6 {
    public static void main(String[] args){
        /*
        6: Promedia 17, 19 y 20 como int (truncado) y como double (exacto). Explica la diferencia en un comentario.
         */
        final int NUMERO1 = 17;
        final int NUMERO2 = 19;
        final int NUMERO3 = 20;

        int operacionEntera = (NUMERO1 + NUMERO2 + NUMERO3) / 3;
        double operacionDecimal = (NUMERO1 + NUMERO2 + NUMERO3) / 3;

        System.out.println("Operacion Truncada: " + operacionEntera + "\nOperacion Decimal: " + operacionDecimal);
        //LA DIFERENCIA RADICA EN QUE CUANDO UTILIZAMOS LA ASIGNACION DE LA VARIABLE PRIMITIVA INT ES UN TIPO DE VARIABLE ENTERA ES DECIR QUE NO CONTIENE NUMEROS
        //DECIMALES A COMPARACION DE DOUBLE Y PARA OPERACIONES QUE CONLLEVAN DIVISONES MODULOS O MULTIPLICACIONES ES MAS FACTIBLE UTILIZAR DOUBLE PARA TENER UN RESULTADO MAS PRECISO

    }
}
