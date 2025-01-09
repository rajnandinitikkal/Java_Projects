package com.example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window extends JFrame {

    private JLabel heading;
    Font font = new Font("", Font.BOLD, 30);
    
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JPasswordField passwordField;
    private JButton button1,button2;
        private Component nameTextField;
    
        public Window()
        {
            super.setTitle("Form Using Java Jrame");
            super.setSize(500, 400);
            super.setLocation(600, 50);
           
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.createGUI();
    
            super.setVisible(true);
        }
    
        public void createGUI(){
    
            this.setLayout(new BorderLayout());
            heading=new JLabel("First Form...");
            heading.setFont(font);
            heading.setHorizontalAlignment(JLabel.CENTER);
            this.add(heading, BorderLayout.NORTH);
    
            //  working with jpanel
    
            mainPanel = new JPanel();
    
            // setting layout on main panel
            mainPanel.setLayout(new GridLayout(3,2));
    
            nameLabel = new JLabel("Enter Name: ");
            nameLabel.setFont(font);
    
            passwordLabel = new JLabel("Enter Password: ");
            passwordLabel.setFont(font);

            passwordField = new JPasswordField();
            passwordField.setFont(font);
    
            nameTextField = new JTextField();
            nameTextField.setFont(font);
    
            button1 = new JButton("Submit");
            button1.setFont(font);
            button2 = new JButton("Reset");
            button2.setFont(font);
    
            mainPanel.add(nameLabel);
            mainPanel.add(passwordField);
            mainPanel.add(nameTextField);
            mainPanel.add(button1);
            mainPanel.add(button2);

        this.add(mainPanel,BorderLayout.CENTER);


    }
}
