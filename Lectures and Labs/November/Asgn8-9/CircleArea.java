class TwoDShape {
    private
    static double PI = 3.14;
    static double input;
    public
    void setInput(double in)    { input = in; }
    double getInput ()          { return input; }
    double getPi()              { return PI; }
    static double Area()        { return PI * (input * input); }
  }
  class Circle extends TwoDShape {
    Circle() {
      Area();
    }
  }
  
  class CircleArea {
    public static void main(String[] args) {
    
    Circle circle   = new Circle();
    TwoDShape twoD  = new TwoDShape();
    double r        = 5;
    twoD.setInput(r);
    double area     = circle.Area();
    System.out.println("Area of a Circle with Radius " + r + " Is :\t " + area); 
  
    }
  }