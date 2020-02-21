import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class TwoTFDemo implements ActionListener {
    JTextField jtf1;
    JTextField jtf2;
    JLabel jlab;

    TwoTFDemo() {
        //create a window frame
        JFrame jframe = new JFrame("A Two Text-field Example");
        //set the layout of the window
        jframe.setLayout(new FlowLayout());
        //set the size of the window
        jframe.setSize(400, 200);
        //set the X button to close the window
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);

        //add action commands
        jtf1.setActionCommand("One");
        jtf2.setActionCommand("Two");

        //add action listeners to the content pane
        jtf1.addActionListener(this);
        jtf2.addActionListener(this);

        //add text fields to jframe
        jframe.add(jtf1);
        jframe.add(jtf2);

        //add the label to the jframe
        jlab = new JLabel("");
        jframe.add(jlab);

        //make the jframe visible
        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("One")) {
            jlab.setText("Enter Pressed in TextField One: \t" + jtf1.getText());
        } else {
            jlab.setText("Enter Pressed in TextField Two: \t" + jtf2.getText());
        }
    }
    public static void main(String args []) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TwoTFDemo();
            }
        });
    }
}