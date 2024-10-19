public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,2,5,7,9,11,13};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Link", "Zelda", "mario"};
        for(String name: nombres){
            System.out.println("name = " + name);
        }
        

    }
}
