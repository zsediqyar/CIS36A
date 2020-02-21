class MethodDemo {

    static void introMessage() {
        System.out.println("This program demonstrates static methods");
    }

    static void square(int x) {
      System.out.println("square of " + x + " is " + x * x);
    }

    public static void main (String[] args) {

     introMessage();
     square(2);

    }
}