/*
STRINGS ARE OBJECTS OF CLASS STRING AND THEREFORE THEY HAVE METHODS
*/

class Strings {
    public static void main(String[] args) {
      String str1 = "Java is the most powerful PL.";
      String str2 = new String(str1);
      String str3 = "Strings are objects.";

      System.out.println("Length of str1: " + str1.length());
      for(int i = 0; i < str1.length(); i++) {
        System.out.print(str1.charAt(i) + " ");
      }
      if(str1.equals(str2)){
        System.out.println("\nstr1 equals str2");
      } 
      //COMPARISON 'COMPARETO' COMPARES ONLY THE FIRST CHARACTER OF THE STRING
      if(str1.compareTo(str3) > 0){
        System.out.println("\nstr1 is greater than str3");
      } else {
        System.out.println("\nstr1 is NOT greater than str3");
      }
      
      //INDEX OF 
      String str4 = "One Two Three Four";
      int index = str4.indexOf("Two");
      System.out.println("Index of Two is: " + index);

      String [] names = {"Li", "Law", "Paul", "Eddie", "Tiger"};

      System.out.println(names[1]);
      for(String s: names) {
        System.out.println(s);
      }
      //printing first letter of each string item
      for(int i = 0; i < names.length; i++) {
        System.out.print(names[i].charAt(0) + " ");
      }
      System.out.println("");

      //printing last letter of each string item
      for(String s: names) {
        System.out.print(s.charAt(s.length() - 1) + " ");
      }

    }
}