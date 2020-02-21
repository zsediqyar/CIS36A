import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ImageIconDemo {
    ImageIconDemo() {
        JFrame jframe = new JFrame("An Image Icon Example");
        jframe.setSize(230, 150);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon goIcon = new ImageIcon("jsd.png");
        JLabel labelGo = new JLabel("  Go  ",  goIcon, SwingConstants.LEFT);

        jframe.add(labelGo, BorderLayout.NORTH);

        jframe.setVisible(true);
    }

    public static void main (String args []) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageIconDemo();
            }
        });
    }
}