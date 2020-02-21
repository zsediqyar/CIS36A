/*
    SCANNER is a class which is part of the Java's UTIL library. 
    It is a buffer that reads the user input. 
*/
import java.util.Scanner;

class ScannerDemo {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name: \t");
        String name = scan.nextLine();

        System.out.print("Enter Age: \t");
        int age = scan.nextInt();

        System.out.print("Enter Salary: \t");
        double salary = scan.nextDouble();

        System.out.println("----------------------");
        System.out.println("Name: \t\t" + name);
        System.out.println("Age: \t\t" + age);
        System.out.println("Salary: \t" + salary);
        System.out.println("----------------------");

    }
}