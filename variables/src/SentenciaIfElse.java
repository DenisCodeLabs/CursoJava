public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 6.4f;
        if(promedio >= 6.5){
            System.out.println("Felicidades");
        }else if(promedio < 6.5 && promedio >= 6.0){
            System.out.println("Muy bien");
        } else{
            System.out.println("Reprobado");
        }
    }
}
