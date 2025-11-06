package fundamentosBasicos;

public class Ejercicio_30 {
    public static void main(String[]args){
        /*
        10: Dados user y pass (String):
            Si user o pass es null → “faltan datos”.
            Si user.equals("admin") y pass.equals("1234") → “acceso”.
            En otro caso → “credenciales inválidas”.
            Evita NPE con orden correcto y .equals.
         */
        String user = "cholo";
        String pass = "1234";
        if ((user == null) || (pass == null)){
            System.out.println("Faltan datos");
        }else if (user.equals("admin") && pass.equals("1234")){
            System.out.println("Acceso Concedido");
        }else {
            System.out.println("Credenciales invalidas");
        }
    }
}
