import java.io.*;

class ShowFile {
    public static void main(String args []) {
        int i;
        FileInputStream fin = null;
        String fileName = "read.txt";
        
        try {
            fin = new FileInputStream(fileName);
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        try {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading the file");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Cannot close the file");
        }
    }
}