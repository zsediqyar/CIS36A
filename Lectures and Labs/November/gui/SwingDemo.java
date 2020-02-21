// import javax.swing.*;        
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {
    SwingDemo() {
        //create a new jframe container
        JFrame jfrm = new JFrame("A Swing Application");

        //give the frame an initial size
        jfrm.setSize(300, 200);

        //terminate the program when user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a text-based label
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI");

        //add the label to the frame
        jfrm.add(jlab);

        //display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args []) {
        //create the frame on the even dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });

    }
}