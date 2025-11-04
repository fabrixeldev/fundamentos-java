package fundamentosBasicos;

public class Ejercicio_19 {
    public static void main(String[]args){
        /*
        19: Capital = 1000 Bs, tasa anual = 5%, tiempo = 3 años. Fórmula: I = C * r * t.
         */
        int capital = 1000;
        double tasaAnual = 0.05;
        int tiempo = 3;

        double formula = (double) capital * tasaAnual * (double) tiempo;
        System.out.println(formula);
    }
}
