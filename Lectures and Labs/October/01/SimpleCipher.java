class SimpleCipher {
    public static void main (String [] args) {

        String msg = "This is a test";
        String encMsg = "";
        String decMsg = "";
        int key = 88;

        System.out.println("Original Message: " + msg);
        for (int i = 0; i < msg.length(); i++) {
          encMsg += (char) (msg.charAt(i) ^ key); 
        }
        System.out.println("Encoded Message: " + encMsg);

        for (int i = 0; i < msg.length(); i++) {
          decMsg += (char) (encMsg.charAt(i) ^ key);
        }
        System.out.println("Decoded Message: " + decMsg);
    }
}