import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String var = (9==7)  ? "True" : "False";
        System.out.println("var = " + var);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = s.nextDouble();

        System.out.println("Ingresa la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = s.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 - 7.0: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        estado = promedio >= 5.49 ? "aprobado" : "no aprobado";
        System.out.println("promedio = " + promedio + " " + estado);

    }
}
