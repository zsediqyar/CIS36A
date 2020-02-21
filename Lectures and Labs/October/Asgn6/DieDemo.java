import java.util.*;

class DieDemo {
    public static void main(String args []) {

        Die dice = new Die();

        dice.roll();
        int side1 = dice.getSideUp();
        dice.roll();
        int side2 = dice.getSideUp();

        System.out.println("Side One: " + side1);
        System.out.println("Side Two: " + side2);
        System.out.println("--------------------------");
        System.out.println("Sum of Both Sides: " + (side1 + side2));
        System.out.println("--------------------------");

    }
}