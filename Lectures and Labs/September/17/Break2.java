class Break2{
    public static void main (String[] args)
    {
      for(int i = 0; i < 3; i++) {
        System.out.println("outer loop count: " + i);
        System.out.print("   inner loop count: ");

        int t = 0;
        while(t < 100) {
          if(t == 20) break;
          System.out.print(t + " ");
          t++;
        }
        System.out.println("");
      }
    }
}