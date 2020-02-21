class Main {
    public static void main (String[] args) 
    {
      int x = 1;

      while (x > 0) {
        System.out.println(x);
        x++;
        if(x > 10) break;
      }
      System.out.println("value of x outside the loop " + x);
    }
}