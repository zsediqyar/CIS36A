class Person {
    private String name; 
    private int dob;
    Person(String n, int d) {
      name = n;
      dob = d;
    }
    public
      String getName()          { return name; }
      int getDob()              { return dob; }
  }
  class CollegeGraduate {
    private double GPA;
    private int year;
    CollegeGraduate(double g, int y) {
      GPA = g;
      year = y;
    }
    public
      double getGPA() { return GPA; }
      int getYear() { return year; }
  }
  class PersonDemo {
    public static void main(String[] args) {
    
    Person person               = new Person("Alex", 1995);
    CollegeGraduate graduation  = new CollegeGraduate(3.5, 2020);
  
    String name   = person.getName();
    int dob       = person.getDob();
    double gpa    = graduation.getGPA();
    int year      = graduation.getYear();
    System.out.println();System.out.println();
    System.out.println(name + " was born on " + dob + ", and graduated from college in " + year + " with a GPA of " + gpa);
    System.out.println();System.out.println();
    }
  }