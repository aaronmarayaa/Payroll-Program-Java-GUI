package com.mycompany.Computations;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Summary extends JPanel {
    
    private final JTextField grossPayPhp_textField;
    private final JTextField totalAllowancePhp_textField;
    private final JTextField totalDeductionsPhp_textField;
    private final JTextField netPayPhp_textField;
    
    public Summary() {

        setLayout(null);    
        TitledBorder summary_border = BorderFactory.createTitledBorder("Summary");
        summary_border.setTitleColor(Color.BLUE);
        setBorder(summary_border);
        setBackground(new Color(128, 128, 255));
        setPreferredSize(new Dimension(100, 150));
            
            // Labels
            JLabel grossPayPhp = new JLabel("GROSS PAY:                          PHP");
                grossPayPhp.setBounds(10, 40, 300, 20);
            add(grossPayPhp);
            
            JLabel totalAllowancePhp = new JLabel("TOTAL ALLOWANCE:          PHP");
                totalAllowancePhp.setBounds(10, 65, 300, 20);
            add(totalAllowancePhp);
            
            JLabel totalDeductionsPhp = new JLabel("TOTAL DEDUCTIONS:          PHP");
                totalDeductionsPhp.setBounds(10, 90, 300, 20);
            add(totalDeductionsPhp);
            
            JLabel netPayPhp = new JLabel("NET PAY:            PHP");
                netPayPhp.setBounds(70, 115, 300, 20);
                netPayPhp.setForeground(new Color(128, 26, 255));
            add(netPayPhp);
            
            //Text Fields
            grossPayPhp_textField = new JTextField("0");
                grossPayPhp_textField.setBounds(200, 40, 100, 20);
                grossPayPhp_textField.setEditable(false);
            add(grossPayPhp_textField);
                
            totalAllowancePhp_textField = new JTextField("0");
                totalAllowancePhp_textField.setBounds(200, 65, 100, 20);
                totalAllowancePhp_textField.setEditable(false);
            add(totalAllowancePhp_textField);
                
            totalDeductionsPhp_textField = new JTextField("0");
                totalDeductionsPhp_textField.setBounds(200, 90, 100, 20);
                totalDeductionsPhp_textField.setEditable(false);
            add(totalDeductionsPhp_textField);
                
            netPayPhp_textField = new JTextField("0");
                netPayPhp_textField.setBounds(200, 115, 100, 20);
                netPayPhp_textField.setEditable(false);
            add(netPayPhp_textField);
                
    }
    public JTextField getGrossPayPhpTextField(){
        return grossPayPhp_textField;
    }
    public JTextField getTotalAllowancePhpTextField(){
        return totalAllowancePhp_textField;
    }
    public JTextField getTotalDeductionsPhpTextField(){
        return totalDeductionsPhp_textField;
    }
    public JTextField getNetPayPhpTextField(){
        return netPayPhp_textField;
    }
    // clear all text fields
    public void clearSummaryTextFields() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(JTextField.class)) {
                JTextField textField = (JTextField) field.get(this);
                textField.setText("0");
            }
        }
    }
    
}
