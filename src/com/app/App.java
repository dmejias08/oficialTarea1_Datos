package com.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public JTextArea response;
    public JButton btnSend;
    public JTextField textTax;
    public JTextField textWeight;
    public JTextField textPrice;
    public JLabel labelPrice;
    public JLabel labelWeight;
    public JLabel labelTax;
    public javax.swing.JPanel JPanel;
    public String price;
    public String tax;
    public  String weight;

    public App() {
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                 price = textPrice.getText();
                 tax = textTax.getText();
                 weight = textWeight.getText();

                System.out.println(price +""+ tax +""+ weight);


                textPrice.setText(null);
                textWeight.setText(null);
                textTax.setText(null);


            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void frame(){
        JFrame frame = new JFrame("Client");
        frame.setContentPane(new App().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
