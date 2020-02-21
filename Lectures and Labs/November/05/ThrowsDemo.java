import java.io.IOException;

class ThrowsDemo {
    public static char prompt(String str) throws IOException
    {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }


    public static void main (String args []) {
        char ch;
        try {
            ch = prompt("Enter a Letter");
        } catch (java.io.IOException e) {
            System.out.println("I/O Exception");
            ch = 'X';
        }

        System.out.println("You Pressed: " + ch);
    }
}
