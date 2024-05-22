package com.dolping.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class KmCalc { //Km_80
    private JButton button1;
    private JPanel panelMain;

    public KmCalc() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello Guapo");
            }
        });
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Cal");
        frame.setContentPane(new KmCalc().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}