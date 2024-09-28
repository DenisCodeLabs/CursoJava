public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println((decimal == caracter));

        char simbolo = '@';
        System.out.println((simbolo == caracter) && (simbolo == decimal));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char corresponde en bites"+ tabulador + " = " + Character.SIZE);
        System.out.println("Valor maximo para character: " + nuevaLinea + retornoCarro + Character.MAX_VALUE);
        System.out.println("Valor minimo para character: " + System.lineSeparator() + Character.MIN_VALUE);
    }
}
