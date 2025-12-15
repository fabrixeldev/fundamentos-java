package fundamentosBasicos;

public class Ejercicio_96 {
    public static void main(String[]args){
        /*Implementa una función recursiva: int potencia(int base, int exp)*/
        int base = 2;
        int exp = 4;
        Ejercicio_96 ejercicio96 = new Ejercicio_96();
        System.out.println(ejercicio96.potencia(base, exp));
    }

    public int potencia(int base, int exp){
            if (exp == 0){
                return 1;
            }
        return base * potencia(base, exp - 1);
    }
}
