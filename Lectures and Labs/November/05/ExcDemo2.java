class ExcDemo2 {
    static void genException() {
        int [] nums = new int [4];
        nums[7] = 20;
    }
    public static void main (String args []) {
        try {
            genException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception");
        }
    }
}