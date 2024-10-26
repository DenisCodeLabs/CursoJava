import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        boolean ascedente = false;
        boolean descedente = false;

        for(int i = 0; i< a.length - 1; i++){
            if(a[i] > a[i+1]){
                descedente = true;
            }

            if(a[i] < a[i+1]){
                ascedente = true;
            }
        }
        if(ascedente == true && descedente == true){
            System.out.println("Arreglo = desordenado");
        }

        if(ascedente == false && descedente == false){
            System.out.println("Arreglo = Todos son iguales");
        }

        if(ascedente == true && descedente == false){
            System.out.println("Arreglo = ordenado de forma ascendente");
        }
        if(ascedente == false && descedente == true){
            System.out.println("Arreglo = ordenado de forma descendente");
        }
    }
}