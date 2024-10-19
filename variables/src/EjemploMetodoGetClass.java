import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal";
        Class str = texto.getClass();
        System.out.println("str.getName() = " + str.getName());
        System.out.println("str.getName() = " + str.getSimpleName());
        System.out.println("str.getPackageName() = " + str.getPackageName());
        System.out.println("str = " + str);
        
        for(Method metodo: str.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);


        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
