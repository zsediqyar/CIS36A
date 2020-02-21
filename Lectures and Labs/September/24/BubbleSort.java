class BubbleSort {
    public static void main (String[] args)
  {

    int [] grades = {70, 85, 92, 90, 55, 99, 75, 77, 56, 51};
    System.out.println("UNORDERED LIST");
    for(int i = 0; i < 10; i++) {
      System.out.print(grades[i] + " - ");
    }
    int size = grades.length;

    //SORTING LOGIC START
    for(int i = 0; i < size; i++) {
      for(int k = 0; k < size - 1; k++) {
        if(grades[k] > grades[k + 1]) {
          int temp = grades[k];
          grades[k] = grades[k + 1];
          grades[k + 1] = temp;
        }
      }
    }
    //SORTING LOGIC END

  System.out.println(" ");
  System.out.println("ORDERED LIST");
    for(int i = 0; i < 10; i++) {
        System.out.print(grades[i] + " - ");
    }
  }
}