class ExceptionTypeMismatch {
    public static void main (String arg []) {
        int[] nums = new int [4];

        try {
            System.out.println("Before Exception");
            nums[7] = 20;
            System.out.println("This won't display");
        } catch (ArithmeticException e) {
            System.out.println("Index out of bounds");
        }

        System.out.println("After Exception");
    }
}