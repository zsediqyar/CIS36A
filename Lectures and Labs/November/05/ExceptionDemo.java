class ExceptionDemo {
    public static void main (String args []) {
        int x;
        int y = 0;

        try {
            x = 10 / y;
            System.out.println("Prints only if y is non-zero");
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        System.out.println("After Catch");
        // System.out.println(10 / 0);
    }
}