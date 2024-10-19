public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 1231312;
        Integer intObjeto1 = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 1213;

        int num = intObjeto1;
        System.out.println("num = " + num);
        int num2 = intObjeto1.intValue();
        System.out.println("num2 = " + num2);
        
        String valor = "67000";
        Integer valor2 = Integer.valueOf(valor);
        System.out.println("valor2 = " + valor2);
        
        Short shortObjeto = intObjeto1.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto1.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto1.longValue();
        System.out.println("longObjeto = " + longObjeto);
                
        
    }
}
