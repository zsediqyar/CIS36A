class Asgn5Ex23 {
    public static void main (String[] args)
  {

    int [] reverse  = new int [10];
    int size = 10;
    int start = 0;
    int end = size - 1;
    int temp;

    for (int i = 0; i < size; i++) {
      reverse[i] = i;
    }

    System.out.println("UN-REVERSED ARRAY"); System.out.println("------------------------------");
      for (int j = 0; j < size; j++) {
        System.out.print(reverse[j] + ", ");
      }
    System.out.println(""); System.out.println("------------------------------");
    
    while (start < end) {
      temp = reverse[start];
      reverse[start] = reverse[end];
      reverse[end] = temp;
      start++;
      end--;
    }

    System.out.println("REVERSED ARRAY"); System.out.println("------------------------------");
      for (int k = 0; k < size; k++) {
        System.out.print(reverse[k] + ", ");
      }
    System.out.println(""); System.out.println("------------------------------");

  }
}