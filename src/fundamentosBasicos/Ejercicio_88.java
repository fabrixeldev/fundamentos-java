package fundamentosBasicos;

public class Ejercicio_88 {
    public static void main(String[]args){
        /*Escribe una función clasificarTemperatura que devuelva:
          "Frío" si t < 10
          "Templado" si t está entre 10 y 25
          "Caluroso" si t > 25*/
        double temperatura = 23;
        Ejercicio_88 ejercicio88 = new Ejercicio_88();
        System.out.println(ejercicio88.clasificarTemperatura(temperatura));
    }

    public String clasificarTemperatura(double t){
        String indicador = "";
        if (t < 10){
            indicador = "Frio";
        } else if (t >= 10 && t <= 25) {
            indicador = "Templado";
        } else if (t > 25) {
            indicador = "Caluroso";
        }
        return indicador;
    }
}
