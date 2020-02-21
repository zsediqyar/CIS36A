class LoopDemo {
    public static void main(String[] args) {

        
        for(int i = 0, k = 10; i < 10 && k > 0; i++, k--) {
            System.out.println("i: " + i + " k: " + k);
        }


        int sum = 0;
        for(int j = 1; j < 5; sum += j++)
            System.out.println("Sum: " + sum);

        
        for(int i = 0; i < 100; i++) {
            System.out.println(i + "\t");
            if(i % 10 == 0) 
                System.out.println("");
        }


        for(int i = 1; i < 10; i++) {
            System.out.println(i + " outer loop pass: ");
                for(int j = 1; j <= i; j++) 
                    System.out.println(i * j + " ");
        }   System.out.println("");

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
    }
}