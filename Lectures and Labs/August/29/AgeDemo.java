import java.util.Scanner;

class AgeDemo {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        name = scan.nextLine();

        System.out.println("How old are you " + name + "?");
        age = scan.nextInt();

        if (age > 18 && age < 21) {
            System.out.println("You seem to be able to drive but not able buy liqour");
            System.out.println("Nvm! You have to wait " + (21 - age) + " more years " + name + "!");
        } else if (age > 21) {
            System.out.println("Great! You can buy liqour.");
        } else {
            System.out.println("GO BACK TO SCHOOL!!");
        }

    }
}