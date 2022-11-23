import java.util.Date;

import java.awt.*;
import javax.swing.*;

public class Main {
    //get the current date and time on local machine and update every second
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        JLabel label = new JLabel();
        frame.add(label);
        while (true) {
            Date date = new Date();
            label.setText(date.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    } //end of main

} //end of class