class PrintAlphabet {
    public static void main (String[] args) {
        char ch = 'A';
        while (ch <= 'z'){
          if(ch <= 'Z' || ch >= 'a')
          System.out.println(ch);
          ch++;
        }
    }
}