public class Asgn5Ex16 {
    public static void main(String[] args) 
    {
     
    int first = 0,next = 1;
    int fibNums[] = new int [30];
    
    for (int i = 0; i < 30; i++) {
        int sum = first + next;
        first = next;
        next = sum;
        fibNums[i] = sum;
      }
    System.out.println(" ");
    System.out.println("THE ARRAY FILLED WITH FIBONACCI NUMBERS");
        
    for(int i = 0; i < 30; i++) {
        System.out.print(fibNums[i] + " ");
    }
    System.out.println(" ");
    System.out.println(" ");
  } 
}