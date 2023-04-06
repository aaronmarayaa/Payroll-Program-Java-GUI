package com.mycompany.Computations;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class PaymentComputationPanel extends JPanel {
            
    private static Received received;
    private static Deductions deductions;
    private static Summary summary;
    private static Earnings earnings;
    
    public PaymentComputationPanel() {

        setLayout(new GridLayout(2, 2, 5, 0));
        
        // earnings panel
        earnings = new Earnings();
        JPanel earnings_panel = new JPanel(new BorderLayout());
            earnings_panel.add(earnings, BorderLayout.NORTH);
        add(earnings_panel, BorderLayout.WEST);
        
        // deductions panel
        deductions = new Deductions();
        JPanel deductions_panel = new JPanel(new BorderLayout());
            deductions_panel.add(deductions, BorderLayout.NORTH);
        add(deductions_panel, BorderLayout.EAST);
        
        //summary panel
        summary = new Summary();
        JPanel summary_panel = new JPanel(new BorderLayout());
            summary_panel.add(summary,BorderLayout.SOUTH);
        add(summary_panel, BorderLayout.WEST);
                
        // received panel
        received = new Received();
        JPanel received_panel = new JPanel(new BorderLayout());
            received_panel.add(received, BorderLayout.SOUTH);
        add(received_panel, BorderLayout.EAST);
    }
    // gets panels instance
    public static final Received getReceivedPanel(){
        return received;
    }
    public static final Deductions getDeductionsPanel(){
        return deductions;
    }
    public static final Summary getSummaryPanel(){
        return summary;
    }
    public static final Earnings getEarnigsPanel(){
        return earnings;
    }
}
