class Squares {
    public static void main (String[] args) {
        int nums, i, total, sum;
        double average;
        nums = 20;
        sum = 0;

        for (i = 1; i <= nums; i++) {
            total = i * i;
            sum = sum + total;
            System.out.println("SQUARE OF " + i + "  -> " + total);
        }
        average = sum / nums;

        System.out.println("----------------------------");
        System.out.println("SUM OF SQUARES: " + sum);
        System.out.println("AVERAGE OF SQUARES: " + average);
        System.out.println("----------------------------");
    }
}