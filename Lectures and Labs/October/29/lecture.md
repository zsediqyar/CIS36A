# Abstract Classes
A defined method which is empty and the subclass handles the implementation. The class shall be defined as Abstract class. 

The definition of the class can be by adding the keyword 'ABSTRACT' in front of the class/method. 

## Example:
```
abstract class Super {
    int x;
    int getX() { return x; }
    abstract void setX(int newX); // no body
}

class Sub extends Super {
    void setX(int newX) { x = newX; }
}
```
An **ABSTRACT** class can be defined without any specific calculation. All the sub classes that inherit this method from this class, will be able to use the mehod their own way. 

# The Keyword "FINAL"
If the keyword FINAL is used in a class or method, the class/method cannot be inherited. Meaning, no subclass can be extended from the main class if it has the keyword **FINAL**

## Example:
```
final class MyClass {
    final int x = 3;
    public static final double PI = 3.14159;

    final double getPI () { return PI; }
}
```

# Object Class
Object class is the super class of all classes in **Java**. Therefore every other object/class inherits the methods of the super object class.

Some of the important methods, are:
- Object clone() -> Creates a copy of the object

# Polymorphism
When an object or a method takes different roles, that is called Polymorphism. For example, when a method is used multiple times but with different parameters and arguments. 

```
class Numbers {
    int sum(int a, int b) {
        return a + b;
    }
    double sum (double a, double b. int c) {
        return a + b + c;
    }
}
```
As can be seen above, the method **SUM** is used two times but with different return types and params. Method overloading can also be called Polymorphism. 


# Interfaces
An interface defines a set of methods that will be implemented by a class. An **Interface** is like an abstract method, that can only be defined and then each other class/object should change it accordingly. The methods in an Interface are all public. 

## Example:
Creating the interface
```
public interface Series {
    int   getNext();   //return next number in series
    void  reset();     //restart
    void  setStart(int st);  //set restarting value
}
```
Modifying the interface
```
public class ByTwos implements Series {
    int start, val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int st) {
        start = st;
        val = st;
    }
 }
 ```
 Using the interface by calling the methods
 ```
 public class SeriesDemo {
    public static void main(String args []) {
        ByTwos sr = new ByTwos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next Value is: " + sr.getNext());
        }
    }
}
```

## Constants in Interfaces
Interfaces can also include data members, but they are implicitly public final static variables and musts be initialized.

**Interfaces Can be Nested**
**Interfaces Can be Extended**

## Another Example with Constants
Main Interface 
```
public interface IConst {
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}
```
Usage and Implementation of Interface
```
public class IConstDemo implements IConst {
    public static void main (String args []) {
        int [] nums = new int[MAX];
        for (int i = MAX; i < MAX + 1; i++) {
            if(i >= MAX) {
                System.out.println(ERRORMSG);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
```

# Package
A Package is just like a folder. Package is a group of related classes and interfaces. Packages are used to better organize files for an application. 
**packages are are always lowercase named**
**packages shall be at the top of the java file**
**packages can be nested**
**packages can be imported in the file**
Syntax
```
import pkg.classname;
```
