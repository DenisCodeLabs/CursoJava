public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Alberto", "Andres", "Javier", "Carlos"};

        int count = nombres.length;
        for(int i = 0; i<count; i++){
            System.out.println((i+1) + ".- " + nombres[i]);
        }
    }
}
