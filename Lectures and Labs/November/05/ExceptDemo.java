class ExceptDemo {
    public static void main (String args []) {
        int [] nums = new int[4];

        try {
            nums[2] = 5;
            nums[7] = 10;
            nums[3] = 15;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
        nums[3] = 20;
        for(int v: nums) System.out.println(v);
    }
}