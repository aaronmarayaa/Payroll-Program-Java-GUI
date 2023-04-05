package com.mycompany.Computations;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class PaymentComputationPanel extends JPanel {
            
    private static Received received;
    
    public PaymentComputationPanel() {

        setLayout(new GridLayout(2, 2, 5, 0));
        
        // earnings panel
        Earnings earnings = new Earnings();
        JPanel earnings_panel = new JPanel(new BorderLayout());
            earnings_panel.add(earnings, BorderLayout.NORTH);
        add(earnings_panel, BorderLayout.WEST);
        
        // deductions panel
        Deductions deductions = new Deductions();
        JPanel deductions_panel = new JPanel(new BorderLayout());
            deductions_panel.add(deductions, BorderLayout.NORTH);
        add(deductions_panel, BorderLayout.EAST);
        
        //summary panel
        Summary summary = new Summary();
        JPanel summary_panel = new JPanel(new BorderLayout());
            summary_panel.add(summary,BorderLayout.SOUTH);
        add(summary_panel, BorderLayout.WEST);
                
        // received panel
        received = new Received();
        JPanel received_panel = new JPanel(new BorderLayout());
            received_panel.add(received, BorderLayout.SOUTH);
        add(received_panel, BorderLayout.EAST);
    }
    // gets received instance
    public static Received getReceivedPanel(){
        return received;
    }
}
