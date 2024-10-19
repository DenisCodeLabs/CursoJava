public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Fin while");


        i = 0;
        boolean prueba = true;

        while (prueba == true) {
            if (i == 20) {
                prueba = false;
            }
            System.out.println(i);
            i++;
        }
    }
}

