class Arr {
    public static void main (String[] args)
  {

    int[] grades = new int[20];


    for(int i = 0; i < 20; i++) {
      grades[i] = 70 + i;
    }

    for(int j = 0; j < 20; j++) {
      System.out.println(grades[j]);
    }


  }
}