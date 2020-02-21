//RANDOM NUMBERS IN THREE VARIABLES
class Lab02Three {
    public static void main (String[] args) {
        double a, b, c, limit;

        a = Math.random();
        b = Math.random();
        c = Math.random();

        limit = .5;

        if(a < limit && b < limit && c < limit) {
          System.out.println("All are tiny");
          System.out.println("a: " + a);
          System.out.println("b: " + b);
          System.out.println("c: " + c);
        } 
        
        else if (a < limit || b < limit || c < limit) {
          System.out.println("One is tiny");
          System.out.println("a: " + a);
          System.out.println("b: " + b);
          System.out.println("c: " + c);
        } 
        
        else if (a > limit && b < limit && c < limit
        || b > limit && a < limit && c < limit
        || c > limit && a < limit && b < limit) {
          System.out.println("Only two are tiny");
          System.out.println("a: " + a);
          System.out.println("b: " + b);
          System.out.println("c: " + c);
        } 
        
        else {
          System.out.println("None are tiny");
          System.out.println("a: " + a);
          System.out.println("b: " + b);
          System.out.println("c: " + c);
        }
    }
}