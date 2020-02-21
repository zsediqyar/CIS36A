class Guess {
    public static void main (String[] args) throws java.io.IOException 
    {
        char ch, answer = 'R', ignore;

        do {
          System.out.println("I'm thinking of a character between A to Z");
          System.out.println("Can you guess it? ");
          ch = (char) System.in.read();  

          do {
            ignore = (char) System.in.read();
          } while(ignore != '\n');
          
          if(ch == answer) {
            System.out.println("** RIGHT **");
          } else {
            System.out.println("...Sorry, you are ");
            if(ch < answer) System.out.println("too low");
            else System.out.println("too high");
            System.out.println("Try again!!");
          }

        } while (ch != answer);
    }
}