import java.lang.Math; 

class E16 {
    public static void main (String[] args)
      throws java.io.IOException
    {
      int num = 3;

      for (int i = 0; i < 10; i++) {
        int res = (int) Math.pow(num, i);
        
        System.out.println(num + " - " + i + " -> " + res);
      }
    }
}