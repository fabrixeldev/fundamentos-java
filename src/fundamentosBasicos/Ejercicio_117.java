package fundamentosBasicos;

import java.util.List;

public class Ejercicio_117 {
    public static void main(String[]args){
        /* **1** Dado un int[] array:
Compara cada elemento con el siguiente (array[i] con array[i+1])
Cuenta cuántas veces:
El número actual es mayor que el siguiente
El número actual es menor que el siguiente
Ignora la última posición*/
        int[] array = {10,9,8,11,12,8,7,1,1};
        int contadorNumMayor = 0;
        int contadorNumMenor = 0;

        for (int i = 0; i < array.length; i++){
            for (int k = i; k < array.length - 2; k++){
                if (array[i] > array[k+1]){
                    contadorNumMayor++;
                }
                if (array[i] < array[k+1]){
                    contadorNumMenor++;
                }
            }
        }
        System.out.println("La cantidad de veces que el numero es mayor al siguiente es = " + contadorNumMayor);
        System.out.println("La cantidad de veces que el numero es menor al siguiente es = " + contadorNumMayor);

        /* **2** Dado un int[] array:
Calcula la suma de la primera mitad
Calcula la suma de la segunda mitad
Indica si el array está balanceado (ambas sumas iguales)
⚠️ El array puede tener número impar de elementos (decide qué hacer con el del medio).*/

        int primeraSuma = 0;
        int segundaSuma = 0;
        int contadorArray = 0;

        for (int i = 0; i < array.length; i++){
            contadorArray++;
        }
        System.out.println("El array contiene " + contadorArray + " elementos");

        if (contadorArray % 2 == 0){
            for (int i = 0; i < array.length / 2; i++){
                primeraSuma += array[i];
            }
            for (int i = array.length - 1; i >= array.length / 2; i--){
                segundaSuma += array[i];
            }
        }else {
            for (int i = 0; i < array.length / 2; i++){
                primeraSuma += array[i];
            }
            for (int i = array.length - 1; i > array.length / 2; i--){
                segundaSuma += array[i];
            }

        }
        System.out.println("La suma de los primera mitad del array es: " + primeraSuma);
        System.out.println("La suma de la segunda mitad del array es: " + segundaSuma);

        /* **3** Dado un List<Integer>:
Filtra los números que:
Sean negativos o
Sean mayores que 50
Convierte cada número a su valor absoluto
Elimina duplicados
Imprime el resultado*/

        List<Integer> listaNumeros = List.of(1,2,3,-1,51,-52,-1);

        List<Integer> listaProcesada = listaNumeros.stream()
                .filter(i -> i < 0 || i > 50)
                .map(Math::abs)
                .distinct()
                .toList();

        System.out.println(listaProcesada);

        /* **4** Dado un número n:
Mientras n sea distinto de 0:
Si n es múltiplo de 5 → réstale 5
Si no → divídelo entre 2 (división entera)
Imprime:
Cuántas veces se restó 5
Cuántas veces se dividió entre 2
El valor final de n*/

        int n = 13;
        int contadorResta = 0;
        int contadorDivision = 0;

        while (n != 0){
            if (n % 5 == 0){
                n -= 5;
                contadorResta++;
            }else {
                n /= 2;
                contadorDivision++;
            }
        }
        System.out.println("Veces que se resto 5 = " + contadorResta);
        System.out.println("Veces que se dividio en 2 = " + contadorDivision);
        System.out.println("Valor Final de N = " + n);

    }
}
