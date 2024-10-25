import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = {
                "USB",
                "PC",
                "SSD",
                "SmartPhone",
                "keyboard",
                "Mouse",
                "Screen"
        };

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        int total = productos.length;

        System.out.println("=== Usando for inverso ===");
       for(int i = 0; i < total; i++){
           System.out.println("i = " + (total - 1 + i) + " valor: " + productos[total-1-i]);
       }

       System.out.println("=== Usando for inverso 2 ===");
       for(int i = total-1; i >= 0; i--){
           System.out.println("i = " + (i) + " valor: " + productos[i]);
       }

    }
}
