import java.io.*;

class CopyFile {
    public static void main(String args []) {
        int i;
        String fileName = "read.txt";
        String fileNameTwo = "output.txt";
        
        try ( 
            FileInputStream fin = new FileInputStream(fileName);
            FileOutputStream fout = new FileOutputStream(fileNameTwo)
            ) {
            } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        try {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                    fout.write(i);
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