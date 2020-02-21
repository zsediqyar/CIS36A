class E19 {
    public static void main (String[] args)
      throws java.io.IOException
    {
      int nums = 0;
      char vowels [] = {'a', 'e', 'i', 'o', 'u'};
      int vowelCount = 0;
      int consonants = 0;
      char input;


    do {
      System.out.println("Enter any key from the keyboard: ");
      input = (char) System.in.read();

      for (int i = 0; i < vowels.length; i++) {
        if(input == vowels[i]) {
          vowelCount++;
        }
        else if (input != vowels[i]) {
          consonants++;
        }
        else if (input != consonants || input != vowelCount) {
          nums++;
        }
       }      
    } while(input != '\n');
        
        System.out.println("# Of Vowels: " + vowelCount);
        System.out.println("# Of Consonants: " + consonants);
        System.out.println("# Of Integers: " + nums);

    }
}