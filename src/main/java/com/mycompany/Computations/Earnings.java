package com.mycompany.Computations;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Earnings extends JPanel {
    
    private final JTextField transactionAllowance_textField;
    private final JTextField incentives_textField;
    private final JTextField uniformAllowance_textField;
    private final JTextField totalAllowance_textField;
    
    Earnings() {

        setLayout(null);
        TitledBorder earnings_border = BorderFactory.createTitledBorder("Earnings");
        earnings_border.setTitleColor(Color.BLUE);
        setBorder(earnings_border);
        setBackground(new Color(128, 128, 255));
        setPreferredSize(new Dimension(100, 157));
            
            // Labels
            JLabel allowance = new JLabel("Allowances");
                allowance.setBounds(10, 15, 100, 20);
            add(allowance);
                
            JLabel amount = new JLabel("Amount");
                amount.setBounds(230, 15, 100, 20);
            add(amount);
                
            JLabel transactionAllowance = new JLabel("TRANSACTION ALLOWANCE");
                transactionAllowance.setBounds(10, 40, 200, 20);
            add(transactionAllowance);
                
            JLabel incentives = new JLabel("INCENTIVES");
                incentives.setBounds(10, 65, 100, 20);
            add(incentives);
                
            JLabel uniformAllowance = new JLabel("UNIFORM ALLOWANCE");
                uniformAllowance.setBounds(10, 90, 200, 20);
            add(uniformAllowance);
                
            JLabel totalAllowance = new JLabel("TOTAL ALLOWANCE");
                totalAllowance.setBounds(50, 115, 200, 20);
            add(totalAllowance);
            
            // TEXT FIELDS
            transactionAllowance_textField = new JTextField("0");
                transactionAllowance_textField.setBounds(200, 40, 100, 20);
            add(transactionAllowance_textField);
                
            incentives_textField = new JTextField("0");
                incentives_textField.setBounds(200, 65, 100, 20);
            add(incentives_textField);
                
            uniformAllowance_textField = new JTextField("0");
                uniformAllowance_textField.setBounds(200, 90, 100, 20);
            add(uniformAllowance_textField);
                
            totalAllowance_textField = new JTextField("0");
                totalAllowance_textField.setBounds(200, 115, 100, 20);
                totalAllowance_textField.setEditable(false);
            add(totalAllowance_textField);
    }
    public JTextField getTransactionAllowanceTextField(){
        return transactionAllowance_textField;
    }
    public JTextField getIncentivesTextField(){
        return incentives_textField;
    }
    public JTextField getUniformAllowanceTextField(){
        return uniformAllowance_textField;
    }
    public JTextField getTotalAllowanceTextField(){
        return totalAllowance_textField;
    }
    // clear all text fields
    public void clearEarningsTextFields() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(JTextField.class)) {
                JTextField textField = (JTextField) field.get(this);
                textField.setText("0");
            }
        }
    }

}
