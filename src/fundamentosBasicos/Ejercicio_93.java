package fundamentosBasicos;

public class Ejercicio_93 {
    public static void main(String[]args){
        /*Crea una función: Que devuelva: "Positivo", "Negativo", "Cero"*/
        int numero = 001;
        Ejercicio_93 ejercicio93 = new Ejercicio_93();
        System.out.println(ejercicio93.clasificarNumero(numero));
    }

    public String clasificarNumero(int n){
        String clasificacion = null;
        if (n != 0){
            if (n > 0){
                clasificacion = "Positivo";
            }else {
                clasificacion = "Negativo";
            }
        }else {
            clasificacion = "Cero";
        }
        return clasificacion;
    }
}
