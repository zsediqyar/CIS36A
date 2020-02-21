import java.util.Scanner;

class Lab02Four {
    public static void main (String[] args) {
        double amount, change;
        int quarter, dime, nickel, penny, result;

        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("PLEASE ENTER THE DOLLAR AMOUNT: ");
        amount = scan.nextDouble();

        //CHANGE THE AMOUNT TO PENNIES
        change = amount * 100;
        //CONVERT THE DOUBLE TO INT BY TYPE CASTING
        result = (int) change;
        //FIND THE QUARTERS
        quarter = result / 25;
        //UPDATE RESULT
        result = result - (quarter * 25);
        //FIND THE DIMES
        dime = result / 10;
        //UPDATE RESULT
        result = result - (dime * 10);
        //FIND THE NICKEL
        nickel = result / 5;
        //UPDATE RESULT
        result = result - (nickel * 5);
        //FIND THE PENNY
        penny = result / 1;
        
        //DISPLAY THE RESULT.
        System.out.println("");
        System.out.println(amount + " DOLLARS TRANSLATES TO: ");
        System.out.println("");

        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("|    QUARTERS   |     DIMES     |    NICKELS    |    PENNIES    |");
        System.out.println("+---------------+---------------+---------------+---------------+");
        System.out.println("|\t" + quarter + "\t|\t" + dime + "\t|\t" + nickel + "\t|\t" + penny + "\t|");

        System.out.println("+---------------+---------------+---------------+---------------+");

    }
}