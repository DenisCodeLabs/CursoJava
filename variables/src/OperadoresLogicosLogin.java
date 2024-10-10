import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "denis";
        String password = "12345";

        String username2 = "admin";
        String password2 = "123456";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.next();

        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean isAuthentic = false;
        if( username.equals(usuario) && password.equals(pass) || username2.equals(usuario) && password2.equals(pass)){
            System.out.println("Bienvenido ".concat(usuario));
            isAuthentic = true;
        } else{
            System.out.println("Datos incorrectos");
        }
    }
}
