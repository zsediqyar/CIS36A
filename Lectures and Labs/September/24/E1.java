class E1 {
    public static void main (String[] args)
      throws java.io.IOException
    {
      int count = 0;
      char input;
      do {
          System.out.println("Enter a Character: ");
          input = (char) System.in.read();
      
          if(input == 'a') {
           count++;
        }

        else if (input == 'q') {
          System.out.println("Exiting ... Q was pressed");
        }
      } while (input != 'q');
      System.out.println("The number of As: " + count);
    }
}