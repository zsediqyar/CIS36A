//MATH.RANDOM EXERCISE

class Lab02Two {
    public static void main (String[] args) {

        double x;

        for(int i = 0; i < 1000; i++) {
            x = Math.random();

            if(x > .5) {
                System.out.println(x);
            }
        }
    }
}