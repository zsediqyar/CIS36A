class TwoDArrays {
    public static void main (String[] args)
  {

    int[][] table = new int[3][4];

    //FILL THE ARRAYS
    for (int i = 0; i < 3; i++) {
      for (int k = 0; k < 4; k++)
        table[i][k] = i + k;
    }

    //PRINT THE ARRAY ELEMENTS
    for (int i = 0; i < 3; i++) {
      for (int k = 0; k < 4; k++) {
        System.out.print(table[i][k] + " ");
      }
      System.out.println("");
    }
  }
}