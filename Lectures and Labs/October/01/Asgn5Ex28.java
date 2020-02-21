import java.util.Scanner;
class Asgn5Ex28 {
    public static void main (String args []) {

    Scanner scan = new Scanner(System.in);    
    String word;
    String reversed = "";
    
    System.out.println("ENTER A WORD TO CHECK FOR PALINDROME");
    word = scan.nextLine();

    int length = word.length();

    for(int i = length - 1; i >= 0; i--)    reversed += word.charAt(i);

    if(word.compareTo(reversed) == 0)       System.out.println("YES, IT'S A PALINDROME");
    else                                    System.out.println("NO, IT'S NOT A PALINDROME");

    }
}