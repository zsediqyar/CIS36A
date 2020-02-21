class Asgn5Ex27 {
    public static boolean sorted(int arr[]) {
      for(int i = 0; i < arr.length; i++) {
        if(arr[i] < arr[i + 1]) {
          return true;
        }
      }
      return false;
    }
  
    public static void main(String[] args) {
      int [] nums = {1, 2, 3, 4, 5};
      boolean result = sorted(nums);
      if(result == true) {
        System.out.println("--- THE ARRAY ---");
        for(int i = 0; i < nums.length; i++) { System.out.print(nums[i] + ", ");}
        System.out.println("");
        System.out.println("--- IS SORTED ---");
      } 
      else if(result == false){
        System.out.println("--- THE ARRAY ---");
        for(int i = 0; i < nums.length; i++) { System.out.print(nums[i] + ", ");}
        System.out.println("");
        System.out.println("--- IS NOT SORTED ---");
      }
    }
  }