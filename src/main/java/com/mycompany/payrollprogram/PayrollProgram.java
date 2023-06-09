package com.mycompany.payrollprogram;

import com.mycompany.Buttons.Buttons;
import com.mycompany.Computations.PaymentComputationPanel;
import com.mycompany.Informations.InformationPanel;
import java.awt.BorderLayout;
import javax.swing.*;

public class PayrollProgram extends JFrame{
    
    private JFrame frame;
    
    PayrollProgram(){
        frame = this;
        // `this` refers to PayrollProgram(), that passed to Buttons().
        // That's why when you press exit button, you dispose this PayrollProgram().
        
        JMenuBar menu = new JMenuBar();
            JMenu file = new JMenu("File");
            JMenu edit = new JMenu("Edit");
        menu.add(file);
        menu.add(edit);
        
        setJMenuBar(menu);
        setLayout(new BorderLayout());
        
        InformationPanel informationPanel = new InformationPanel();
        add(informationPanel, BorderLayout.NORTH);
        
        PaymentComputationPanel paymentComputationPanel = new PaymentComputationPanel();
        add(paymentComputationPanel, BorderLayout.CENTER);
        
        Buttons buttons = new Buttons(frame);
        add(buttons, BorderLayout.SOUTH);
        
        setTitle("Payroll Program");
        setSize(720, 620);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        PayrollProgram a = new PayrollProgram();
    }
}
