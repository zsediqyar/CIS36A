import java.util.Scanner;

class MoonGravity {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double earthGravity, moonGravity, yourWeight, convertWeight;
        int gravityPercentage;

        earthGravity = 9.807;
        gravityPercentage = 17;
        moonGravity = (gravityPercentage * earthGravity) / 100;

        System.out.println("Enter Your Weight (in KGs): ");
        yourWeight = scan.nextDouble();

        convertWeight = (yourWeight * gravityPercentage) / 100;
        System.out.println("-------------------------------");
        System.out.println("If you weight " + yourWeight + " KGs on Earth");
        System.out.println("You will weight " + convertWeight + " KGs On Moon.");
        System.out.println("-------------------------------");
    }
}