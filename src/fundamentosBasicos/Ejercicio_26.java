package fundamentosBasicos;

public class Ejercicio_26 {
    public static void main(String[]args){
        /*
        6: op puede ser 1, 2, 3 o cualquier otro. Con switch clásico:
            1: “Crear”, 2: “Actualizar”, 3: “Eliminar”, default: “Opción inválida”.
         */
        int op;
        switch (op = 5){
            case 1 :
                System.out.println("Crear");
                break;
            case 2 :
                System.out.println("Actualizar");
                break;
            case 3 :
                System.out.println("Eliminar");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }
}
