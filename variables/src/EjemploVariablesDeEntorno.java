import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("Listando variables de entorno del sistema");

        for(String ket: varEnv.keySet()){
            System.out.println("ket = " + ket);
        }
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);
        
        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);

    }
}