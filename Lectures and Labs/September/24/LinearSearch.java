class LinearSearch {
    public static void main (String[] args)
  {

    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int val = 11;
    boolean found = false;
    
    for(int v: nums) {
      if(v == val) {
        found = true;
      }
    }
    System.out.println(found);
  }
}