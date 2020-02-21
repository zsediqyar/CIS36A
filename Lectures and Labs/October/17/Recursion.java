/*
recursion is basically a function calling itself x number of times until the stack is full. 
A recursion also needs a base case where it can default to that
A recursion is a function calling itself inside itself
*/
class Recursion {
    static int fact(int n) {
        int result;
        if(n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;
        }
        return result;
    }

    static int sumN(int n) {
        if(n == 0) {
            return 0;
        } else {
            return n + sumN(n-1);
        }
    }
    static void printArray(int array[]) {
        printArrayAux(array, 0);
    }
    static void printArrayAux(int [] array, int index) {
        if(index == array.length) {
            return;
        }
        else {
            System.out.println(array[index]);
            printArrayAux(array[index + 1]);
        } 
    }
    public static void main(String [] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int four = fact(4);
    int five = fact(5);
    int sum = sumN(5);
    System.out.println("Factorial of 5 is: " + five);
    System.out.println("Factorial of 4 is: " + four);
    System.out.println("Sum of 5 ints is : " + sum);
    System.out.println(printArray(arr));

    }
}