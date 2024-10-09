import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        
        int div =  i/j;
        float div2 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i% j;
        System.out.println("resto = " + resto);
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if(numero % 2 == 0)
            System.out.println(numero + " Es par");
        else
            System.out.println(numero + " Es impar");
    }
}
