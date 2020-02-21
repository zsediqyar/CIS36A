import java.util.*;

class CalcDemo {
    public static void main(String[] args) {


        Calc c = new Calc();
        int a = 3, b = 5, d = 7;
        System.out.println(c.powerN(a));
        System.out.println(c.powerN(a, b));
        //calling the variable arguments method VARARGS
        System.out.println(c.vaSum(1,2,3,4));

    }
}