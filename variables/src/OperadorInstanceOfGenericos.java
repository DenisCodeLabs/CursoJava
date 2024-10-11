public class OperadorInstanceOfGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un onjeto de la clase String ... Hi!";

        Number num = Integer.valueOf(7);
        
        Boolean b1 = texto instanceof String;

        System.out.println("Texto del tipo String  = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto del tipo Object = " + b1);
        
        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num del tipo Integer = " + b1);

        b1 = num instanceof Object;
        System.out.println("num del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

        Number decimal = Float.valueOf(45.54f);
        b1 = decimal instanceof Double;
        System.out.println("decimal del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal del tipo Integer = " + b1);

        b1 = decimal instanceof Object;
        System.out.println("decimal del tipo Number = " + b1);
        
        b1 = b1 instanceof Boolean;
        System.out.println("decimal = " + decimal);
    }
}
