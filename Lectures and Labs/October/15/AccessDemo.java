class MyClass {
    private int alpha;
    public int beta;
    int gama;

    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main (String args[]) {
        MyClass obj = new MyClass();

        // obj.alpha = 5;
        obj.setAlpha(5);
        obj.beta = 10;
        obj.gama = 15;
        System.out.println("Alpha: " + obj.getAlpha() + " Beta: " + obj.beta + " Gama: " + obj.gama);

    }

}