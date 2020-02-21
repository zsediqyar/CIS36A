class CheckNum {
    //NO ISTANCE VARIABLES. THIS CLASS DOES NOT STORE ANY DATA

    //RETURN TRUE IF X IS EVEN
    boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }

    boolean isOdd(int x) {
        if (x % 2 != 0) return true;
        else return false;
    }

    boolean isFactor(int a, int b) {
        return b % a == 0;
    }

}

class CheckNumDemo {    
    public static void main (String args []) {

        CheckNum numEven = new CheckNum();
        System.out.println(numEven.isEven(6));

        CheckNum numOdd = new CheckNum(); 
        System.out.println(numOdd.isOdd(6));

    }
}