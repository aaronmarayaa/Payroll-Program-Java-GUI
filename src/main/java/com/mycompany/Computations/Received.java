package com.mycompany.Computations;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Received extends JPanel {
    
        JLabel employee_name;
        
    public Received() {
        setLayout(null);
        
        setBackground(new Color(128, 128, 255));
        setPreferredSize(new Dimension(100, 150));
        
            JLabel receivedBy = new JLabel("RECEIVED BY:");
                receivedBy.setBounds(10,15, 100,20);
            add(receivedBy);
            
            employee_name = new JLabel();
                employee_name.setBounds(120,60, 500,20);
            add(employee_name);
            
            JLabel separator = new JLabel("");
                separator.setBounds(70,90, 200,20);
                separator.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.BLACK));
            add(separator);
            
            JLabel signature = new JLabel("Signature");
                signature.setBounds(140,110, 100,20);
            add(signature);
    }
    // updates `employee_name` whenever `setEmployeeName()` method is called
    public void setEmployeeName(String nameOfEmployee){
        employee_name.setText(nameOfEmployee);
    }
}

