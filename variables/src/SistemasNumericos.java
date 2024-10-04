import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        int numeroBinario = 0b111110100;
        System.out.println(numeroBinario);
        String resultadoOctal = "Numero octal de: " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHexadecimal = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}