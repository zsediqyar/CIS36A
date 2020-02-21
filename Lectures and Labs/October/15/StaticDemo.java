class Stat {
    static int x = 6; //static variables contain the same value in all objects. If they are changed one, it will affect all the object instances of the class
    int y;
}

public class StaticDemo {
    public static void main (String [] args) {

        Stat obj1 = new Stat();
        Stat obj2 = new Stat();

        obj1.y = 10;
        obj2.y = 12;
        obj1.x = 99;
        System.out.println("obj1 x and y " + obj1.x + ", " + obj1.y);
        System.out.println("obj2 x and y " + obj2.x + ", " + obj2.y);

    }
}