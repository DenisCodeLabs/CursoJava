import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0, totalImpares = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa 10 numeros: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
           if (a[i]%2 == 0){
               totalPares ++;
               //pares[i] = a[i];
           } else{
               totalImpares ++;
               //impares[i] = a[i];
           }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length; i++){
            //a[i] = s.nextInt();
            if (a[i]%2 == 0){
                pares[j++] = a[i];
            } else{
                impares[k++] = a[i];
            }
        }
        System.out.println("Pares");
        for(int p: pares){
            System.out.println(p);
        }

        System.out.println("Impares");
        for(int imp: impares){
            System.out.println(imp);
        }
    }
}
