//method overload example
class Calc {
    // START -> stupid proof concept - avoid any app crash in case someone enters invalid arguments
    int sum() {
        return 0;
    }
    int sum(int a) {
        return a;
    }
    // END -> stupid proof concept - avoid any app crash in case someone enters invalid arguments
    
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalcDemo {
    public static void main(String [] args) {

        Calc  c = new Calc();
        int a = 3;
        int b = 5;
        int d = 7;
        System.out.println("3 + 5 => " + c.sum(a,b));
        System.out.println("3 + 5 + 7 => " + c.sum(a,b,d));

    }
}