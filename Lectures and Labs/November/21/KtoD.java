import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KtoD {
    public static void main (String args []) {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter test ('stop' to quit).");
        try (FileWriter fw = new FileWriter("text1.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) {
                    break;
                } else {
                    str = str + "\r\n";
                    fw.write(str);
                }
            } while (str.compareTo("start") != 0);
        } catch(IOException e) {
            System.out.println("I/O Error");
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader("text1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException e) {
            System.out.println("I/O Error");
        }




    }
}