class SwapperDemo {
    public static void main (String args []) {
  
        Swapper swaped = new Swapper(20, 30);
        System.out.println("BEFORE SWAPPING");
        System.out.println("----------------");
        int x = swaped.getX();
        int y = swaped.getY();
        System.out.println("Value of X: " + x + "\nValue of Y: " + y);
        System.out.println("");
        System.out.println("AFTER SWAPPING");
        System.out.println("----------------");
        swaped.swap(x, y);
    }  
}