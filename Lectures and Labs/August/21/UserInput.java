import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        double gallons;
        double liters;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Gallons: ");
        gallons = scan.nextDouble();
        liters = gallons * 3.7;

        System.out.println(gallons + " Gallons are " + liters + " Liters.");

    }
}