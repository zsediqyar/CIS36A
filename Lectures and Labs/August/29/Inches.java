class Inches {
    public static void main (String[] args) {
        
        long inchesPerMile;
        long cubicInches;

        inchesPerMile = 5280 * 12;
        System.out.println("");
        System.out.println("Inches per mile: " + inchesPerMile);

        System.out.println("---------------------------------------");

        cubicInches = inchesPerMile * inchesPerMile * inchesPerMile;
        System.out.println("Cubic inches per mile: " + cubicInches);
        System.out.println("");

    }
}