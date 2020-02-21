import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class ButtonDemo implements ActionListener {
    JLabel jlab;
    ButtonDemo() {
        JFrame jframe = new JFrame("A Button Example");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(220, 90);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make two buttons
        JButton jbtnFirst = new JButton("First Button");
        JButton jbtnSecond = new JButton("Second Button");

        //add action listeners
        jbtnFirst.addActionListener(this);
        jbtnSecond.addActionListener(this);

        //add the button to the content pane
        jframe.add(jbtnFirst);
        jframe.add(jbtnSecond);

        jlab = new JLabel("Press a Button");
        jframe.add(jlab);

        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("First")) {
            jlab.setText("First Button Was Pressed");
        } else {
            jlab.setText("Second Button Was Pressed");
        }
    }


    public static void main (String args []) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}