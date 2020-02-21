import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class StopWatch implements ActionListener{
    JLabel jlab;
    long start;

    StopWatch() {
        JFrame jframe = new JFrame("A simple Stop Watch");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(230, 90);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");

        btnStart.addActionListener(this);
        btnStop.addActionListener(this);

        jframe.add(btnStart);
        jframe.add(btnStop);

        jlab = new JLabel("Press Start to Begin Timer");
        jframe.add(jlab);
        jframe.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal = Calendar.getInstance();
        if(e.getActionCommand().equals("start")) {
            start = cal.getTimeInMillis();
            jlab.setText("Stop Watch Is Running");
        } else {
            jlab.setText("Elapsed Time is: " + (double) (cal.getTimeInMillis() - start) / 1000);
        }
    }

    public static void main (String args []){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StopWatch();
            }
        });
    }
}