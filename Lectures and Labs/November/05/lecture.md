# Exception
Exception is a form of error that Java program has to deal with. What it does is that it prevents the program from crashing, and it continues to execute the code without interruption. 

## Example
```
int [] nums = new int[4];

        try {
            nums[2] = 5;
            nums[7] = 10;
            nums[3] = 15;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
```
In the above example the **nums[7]** is clearly out of bount as the array index is only 0-3. So in a normal state the program would crash in that line, but in this program where we are handling the exception, it goes on with the code without crashing the program, yet it catches the error. 


# Uncaught Exceptions
Uncaught exception are the wrong exception params. For example we expect one exception to be caught but we pass a wrong/different exception to the program. Which not only doesn't catch the exception, but also crashes the program.

# Manually Throwing an Exception
**throw exceptionObject**
This is used when we manually want the program to throw an exception and expect a higher class down the program to catch it. 

# Finally
A *Finally* block is always executed after a try/catch block is exited. 