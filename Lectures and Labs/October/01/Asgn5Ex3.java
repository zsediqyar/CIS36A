import java.lang.Math; 

class Asgn5Ex3 {
    public static void main (String args []) {
        
        double aveArray[] = new double[10];
        double average = 0;
        double sum = 0;

        for(int i = 0; i < 10; i++) {
          aveArray[i] = Math.random() * 50;

          for(int j = 0; j < aveArray.length; j++) {
            sum =+ aveArray[j];
            average = sum / aveArray.length;
          }
        }
        System.out.println("--------------------------------------------");
        System.out.println("SUM OF ARRAY: \t\t" + sum);
        System.out.println("AVERAGE OF ARRAY: \t" + average);
        System.out.println("--------------------------------------------");
    }
}