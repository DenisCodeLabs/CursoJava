import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "USB";
        productos[1] = "PC";
        productos[2] = "SSD";
        productos[3] = "SmartPhone";
        productos[4] = "keyboard";
        productos[5] = "Mouse";
        productos[6] = "Screen";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        for(String p: productos){
            System.out.println(p);
        }
        int total = productos.length;
        int i = 0;
        while(i < total ){
            System.out.println("Producto "+(i+1) +": "+productos[i]);
            i++;
        }

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        //int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];



    }
}
