import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Buttons {
    static JFrame jframe;
    Buttons() {
        JFrame jframe = new JFrame("Buttons");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(600, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel jlabel = new JLabel("...");

        JButton b1 = new JButton("Click Here");
        JButton b2 = new JButton("Not Here");
        JButton b3 = new JButton("Not Here");
        JButton b4 = new JButton("Not Here");
     

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(jlabel);
        jframe.add(panel);

        jframe.setVisible(true);

    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Buttons();
            }
        });
    } 
}