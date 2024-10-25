public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }

    }

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;
        for(int i = 0; i < total-1; i++){
            for(int j = 0; j < total-1; j++){
                if(((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
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

        int total = productos.length;
        sortBurbuja(productos);
        System.out.println("=== Usando for inverso 3 ===");
        for(int i = 0; i < total; i++){
            System.out.println("i = " + (i) + " valor: " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 2;
        numeros[3] = 4;

        sortBurbuja(numeros);

        for(int i = 0; i< numeros.length; i++){
            System.out.println("numeros[i] = " + numeros[i]);
        }

    }
}