public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

      String a = "a";
      String b = "b";
      String c = a;

      StringBuilder sb = new StringBuilder(a);
      long inicio = System.currentTimeMillis();
      for(int i = 0; i<1000; i++){
          //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
          //c += a + b + "\n"; // 500 => 13 mss
            sb.append(a).append(b).append("\n");// 500 => 0ms

      }
      long fin = System.currentTimeMillis();
      System.out.println("Tiempo en milisegundos: " + (fin - inicio));
      //System.out.println(sb.toString());
    }
}
