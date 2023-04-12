package com.mycompany.Buttons;

import com.mycompany.Computations.PaymentComputationPanel;
import com.mycompany.Informations.InformationPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons extends JPanel{
    
    public Buttons(JFrame frame) {
        
        add(new JButton("Print"));
        
        // Clear button
        JButton clear = new JButton("Clear");
            clear.addActionListener( e -> {
                try {
                    PaymentComputationPanel.getSummaryPanel().clearSummaryTextFields();
                    PaymentComputationPanel.getDeductionsPanel().clearDeductionsTextFields();
                    PaymentComputationPanel.getEarningsPanel().clearEarningsTextFields();
                    PaymentComputationPanel.getReceivedPanel().clearEmployeeName();
                    InformationPanel.getSalaryInformationPanel().clearSalaryTextFields();
                    InformationPanel.getEmployeeInformationPanel().clearEmployeePanelTextFields();
                } catch (IllegalAccessException ex) {
                
                }
            });
        add(clear);

        // Exit button 
        JButton exit = new JButton("Exit");
            exit.addActionListener( e -> {
                    frame.dispose();
            });
        add(exit);
            
    }
}
