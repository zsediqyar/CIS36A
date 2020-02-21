public class ScopeDemo {
    public static void main(String[] args) {
        int x;

        x = 10;

        if(x == 10) {
            int y = 20;
            System.out.println("x and y " + x + " " + y);
        }

        /*
            THE BELOW LINE DOESN'T RUN BECAUSE Y IS CALLED OUTSIDE ITS SCOPE
        */
       // System.out.println("Y is " + y);

    }
}