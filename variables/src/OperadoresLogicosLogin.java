import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String []usernames = new String[3];
        String [] passwords = new String[3];

        usernames[0] = "denis";
        usernames[1] = "admin";
        usernames[2] = "root";

        passwords[0] = "12345";
        passwords[1] = "123456";
        passwords[2] = "root";*/

        String []usernames = {"denis", "admin", "root"};
        String []passwords = {"12345", "123456", "root"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.next();
        System.out.println("Ingrese el password");
        String pass = scanner.next();

        boolean isAuthentic = false;
        for(int i = 0; i < usernames.length; i++){

            if(usernames[i].equals(usuario) && passwords[i].equals(pass)){
                System.out.println("Bienvenido ".concat(usuario));
                isAuthentic = true;
                break;
            }
        }
        if(isAuthentic == false)
            System.out.println("Datos incorrectos");
    }
}