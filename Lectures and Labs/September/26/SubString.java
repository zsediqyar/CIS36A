class SubString {
    public static void main(String[] args) {
      
      String orgStr = "Laney College is located in downtown Oakland";

      String schoolN = orgStr.substring(0, 13);
      System.out.print(schoolN);

      System.out.print("\nLimit the display to: \t" + orgStr.substring(0,20) + "...");
    }
}