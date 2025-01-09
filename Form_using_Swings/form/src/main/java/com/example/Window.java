package com.example;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {

    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);

    public Window()
    {
        super.setTitle("Form Using Java Jrame");
        super.setSize(400, 400);
        super.setLocation(600, 50);
       
        this.createGUI();

        super.setVisible(true);
    }

    public void createGUI(){

        this.setLayout(new BorderLayout());
        heading=new JLabel("First Form...");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading, BorderLayout.NORTH);
    }
}
