public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un onjeto de la clase String ... Hi!";

        Integer num = 7;
        
        Boolean b1 = texto instanceof String;

        System.out.println("Texto del tipo String  = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num del tipo Integer = " + b1);

        b1 = num instanceof Object;
        System.out.println("num del tipo Object = " + b1);

        Double decimal = 45.5;
        b1 = decimal instanceof Object;
        System.out.println("decimal del tipo Number = " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("decimal = " + decimal);
    }
}
