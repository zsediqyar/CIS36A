class Outer {
    int x = 5;

    class Inner {
        int y = 10;
        void changeX() { x = 3;}
    }

    void adjust() {
        Inner inn = new Inner();
        inn.changeX();
        
    }
}

class InnerDemo {
    public static void main (String[] args) {
        Outer ot = new Outer();
        
    }
}