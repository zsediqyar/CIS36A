class Asgn5Ex22 {
    public static void main (String[] args)
  {

    int triArray[][] = new int[10][];
        triArray[0] = new int[1];
        triArray[1] = new int[2];
        triArray[2] = new int[3];

    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 2; j++) {
        triArray[i][j] = i + j;
      }
    }

    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(triArray[i][j] + " ");
      }
    }

  }
}