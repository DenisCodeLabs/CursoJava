import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores= {"azul", "amarillo", "rojo", "Verde", "blanco", "negro"};
        
        double random = Math.random();
        System.out.println("random = " + random);
        
        random *= colores.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("random = " + colores[(int) random]);

        Random randomObject = new Random();
        int randomInt = randomObject.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        randomInt = randomObject.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);


        
    }
}
