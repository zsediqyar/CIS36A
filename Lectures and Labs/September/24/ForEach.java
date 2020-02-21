class ForEach {
    public static void main (String[] args)
  {

    int[] nums = {1, 2, 3, 4, 5};
    String[] names = {"alex", "bob", "mateo", "john"};

    System.out.println("FOR LOOP");
    for(int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    System.out.println("FOR EACH LOOP");
    for(int v: nums) 
    System.out.println(v);

    for(String n: names)
    System.out.println(n);
  }
}