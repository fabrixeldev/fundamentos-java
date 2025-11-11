package fundamentosBasicos;

public class Ejercicio_46 {
    public static void main(String[]args){
        /*
        46: Contar dígitos de n (sin String). Considera n = 0 (tiene 1 dígito) y negativos.
            Tip: usa Math.abs.
         */
        int n = 001;
        int numero = Math.abs(n);
        int acum = 0;

        if (numero == 0){
            acum++;
        }else{
            while (numero > 0){
                int dig = numero % 10;
                acum++;
                numero /= 10;
            }
        }

        System.out.println("El numero: " + n + " tiene " + acum + " digitos");
    }
}
