package fundamentosBasicos;

public class Ejercicio_50 {
    public static void main(String[]args){
        /*
        50: Dibujar patrones con bucles anidados:
                Un rectángulo de tamaño h x w con *.
                Un triángulo recto de altura h.
                Una pirámide centrada de altura h.
                Tip: controla espacios y asteriscos por fila.
         */
        int h = 5;
        int w = 4;

        //GENERA UN RECTANGULO
        for (int fila = 1; fila <= h ; fila++){
            System.out.println();
            for (int columna = 1; columna <= w; columna++){
                System.out.print("*");
            }
        }
        System.out.println(" ");

        //GENERA UN TRIANGULO
        for (int fila = 1; fila <= h ; fila++){
            System.out.println();
            for (int columna = 1; columna <= fila; columna++){
                System.out.print("*");
            }
        }
        System.out.println();

        //GENERA UNA PIRAMIDE
        for (int fila = 1; fila <= h ; fila++){
            System.out.println();
            for (int columna = 0; columna < h - fila; columna++){
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < 2 * fila - 1; asterisco++){
                System.out.print("*");
            }
        }
        System.out.println();

        //GENERA UN DIAMOND
        for (int fila = 1; fila <= h ; fila++){
            System.out.println();
            for (int columna = 0; columna < h - fila; columna++){
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < 2 * fila - 1; asterisco++){
                System.out.print("*");
            }
        }

        for (int fila = 1; fila <= h ; fila++){
            System.out.println();
            for (int columna = 0; columna < fila; columna++){
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < 2 * (h - fila)-1; asterisco++){
                System.out.print("*");
            }

        }
        System.out.println();

        //GENERA UN RECTANGULO ESPACIOS EN MEDIO
        for (int col = 0 ; col <= h; col++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0 ; i <= h-2; i++) {
            System.out.print("*");
            for (int j = 0; j <= h-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int col = 0 ; col <= h; col++){
            System.out.print("*");
        }
        System.out.println();

        //GENERA UN TRIANGULO AL REVES
        for (int fila = 1 ; fila <= h ; fila++){
            System.out.println();
            for (int col = 0 ; col <= h-fila ; col++){
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println();

        //GENERA UN ROMBOIDE
        for (int fila = 1 ; fila <= h ; fila++){
            for (int col = 1 ; col <= fila ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int fila = 1 ; fila <= h ; fila++){
            for (int col = 1 ; col <= h - fila ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //GENERA UNA X
        for (int fila = 1 ; fila <= h ; fila++){
            for (int col = 1 ; col <= h ; col++){
                if (col == fila || col== (h-fila+1)){
                    System.out.print("x");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA F
        for (int fila = 1; fila <= h; fila++){
            if (fila == 1 ){
                for (int col = 1; col <= h; col++){
                    System.out.print("X");
                }
            }else if (fila==3){
                for (int col = 1; col <= h -1; col++){
                    System.out.print("Y");
                }
            }else {
                System.out.print("Z");
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA A
        for (int fila = 1; fila <= h ; fila++){
            if (fila == 1 || fila == 3){
                for (int col = 1 ; col <= h ; col++){
                    System.out.print("X");
                }
            } else{
                for (int col = 1 ; col <= h ; col++) {
                    if (col == 1 || col == 5){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA B
        for (int fila = 1; fila <= h; fila++){
            if (fila == 1 || fila == 3 || fila == 5){
                for (int col = 1; col <= h-1; col++){
                    System.out.print("X");
                }
            }else {
                for (int col = 1; col <= h; col++){
                    if (col == 1 || col == 5){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA R
        for (int fila = 1; fila <= h ; fila++){
            if (fila == 1 || fila == 3){
                for (int col = 1; col <= h-1; col++){
                    System.out.print("X");
                }
            }else if (fila == 2){
                for (int col = 1; col <= h; col++){
                    if (col == 1 || col == 5){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            } else if (fila == 4 || fila == 5) {
                for (int col = 1 ; col <= h; col++){
                    if ((col == 1) || ((col == 3) && (fila == 3)) || ((col == 4) && (fila == 4)) || ((col == 5) && (fila == 5))){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA I
        for (int fila = 1; fila <= h ; fila++){
            if (fila == 1 || fila == 5){
                for (int col = 1 ; col <= h-1; col++){
                    System.out.print("X");
                }
            }else {
                for (int col = 1; col <= h-1; col++){
                    if (col == 2 || col == 3){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA C
        for (int fila = 1; fila <= h ; fila++){
            if (fila == 1 || fila == 5){
                for (int col = 1 ; col <= h; col++){
                    System.out.print("X");
                }
            }else {
                for (int col = 1; col <= h; col++){
                    if (col == 1){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA I
        for (int fila = 1; fila <= h ; fila++){
            if (fila == 1 || fila == 5){
                for (int col = 1 ; col <= h-1; col++){
                    System.out.print("X");
                }
            }else {
                for (int col = 1; col <= h-1; col++){
                    if (col == 2 || col == 3){
                        System.out.print("X");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //GENERA UNA O
        for (int fila = 1; fila <= h ; fila++){
            for (int col = 1; col <= h ; col++){
                if (fila == 1 || fila == h || col == 1 || col == h){
                    System.out.print("X");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
