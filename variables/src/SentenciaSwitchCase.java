public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num = 4;
        switch (num) {
            case  1:
            System.out.println("Numero 1");
            break;

            case  2:
                System.out.println("Numero 2");
                break;

            case  3:
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("No encontrado");
        }

        String name = "Denis";
        switch (name){
            case "admin":
                System.out.println("Hola Admin");
                break;
            case  "Denis":
                System.out.println("Hola Denis");
                break;
            default:
                System.out.println("Quien eres?");

        }

    }
}
