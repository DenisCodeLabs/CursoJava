import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try{
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("fecha.form = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            if(fecha.after(fecha2)){
                System.out.println("Fecha es mayor que la actual");
            } else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que la actual");
            } else if(fecha.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha1 (del usuario) es despues que fecha2 (actual)");
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha1 (del usuario) es anterior que fecha2 (actual)");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("Fecha1 (del usuario) es igual que fecha2 (actual)");
            }
        } catch(ParseException e){
            System.out.println("Ingresa un formato correcto ");
            //e.printStackTrace();
        }

    }
}
