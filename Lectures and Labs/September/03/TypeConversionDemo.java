class TypeConversionDemo {
    public static void main (String[] args) {
        int     var1 = 1234567;
        double  var2 = var1;

        System.out.println(var2);


        int var3;
        double var4 = 654321.2;

        var3 = (int) var4;
        System.out.println(var3);

        int a = 'a';
        System.out.println("Int a is: " + a);

        
    }
}