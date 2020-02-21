class Asgn5Ex26 {
    public static void main (String [] args) {
  
      int arr1 [] = {1, 2, 3};
      int arr2 [] = {4, 5, 6, 7};
      int size = arr1.length + arr2.length;
      int arr3 [] = new int[size];
      int index = 0;
  
      for(int i = 0; i < arr1.length; i++) {
        arr3[i] = arr1[i];
        index++;
      }
  
      for (int j = 0; j < arr2.length; j++) {
        arr3[index++] = arr2[j];
      }
      
      System.out.println("ARRAY ONE");
      for (int one = 0; one < arr1.length; one++) System.out.print(arr1[one] + " "); System.out.println("");
      System.out.println("ARRAY TWO");
      for (int two = 0; two < arr2.length; two++) System.out.print(arr2[two] + " "); System.out.println("");
      System.out.println("MERGED RESULT OF TWO ARRAYS");
      for (int merged = 0; merged < arr2.length; merged++) System.out.print(arr2[merged] + " "); System.out.println("");
      
    }
  }