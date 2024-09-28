public class Primitivos {
    public static void main(String[] args) {
        
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " +
                Byte.BYTES);
        System.out.println("Tipo byte corresponde en byte a " +
                Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo byte corresponde en short a " +
                Short.BYTES);
        System.out.println("Tipo byte corresponde en short a " +
                Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo byte corresponde en int a " +
                Integer.BYTES);
        System.out.println("Tipo byte corresponde en int a " +
                Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo byte corresponde en long a " +
                Long.BYTES);
        System.out.println("Tipo byte corresponde en long a " +
                Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 127;

    }
}
