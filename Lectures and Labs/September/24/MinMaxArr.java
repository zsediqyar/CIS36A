class MinMaxArr {
    public static void main (String[] args)
  {

    int [] grades = {70, 85, 92, 90, 55, 99, 75, 77, 56, 51};
    int min, max, total;
    double average;

    min = grades[0];
    max = grades[0];
    total = 0;
    average = 0;

    for(int i = 0; i < 10; i++) {
      if (grades[i] < min) min = grades[i];
      if (grades[i] > max) max = grades[i];
      total += grades[i]; 
      //average = total / (i + 1);
    }
    average = total / 10;
    System.out.println("MIN: " + min);
    System.out.println("MAX: " + max);
    System.out.println("TOTAL: " + total);
    System.out.println("AVERAGE: " + average);
  }
}