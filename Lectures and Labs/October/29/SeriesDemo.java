public class SeriesDemo {
    public static void main(String args []) {
        ByTwos two = new ByTwos();
        ByThrees three = new ByThrees();

        System.out.println("Coming From Twos Class");
        for (int i = 0; i < 5; i++) {
            System.out.println("Next Value is: " + two.getNext());
        }

        System.out.println("Coming From Threes Class");
        for(int i = 0; i < 5; i++) {
            System.out.println("Next Value is: " + three.getNext());
        }

    }
}