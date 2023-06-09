package com.mycompany.Computations;

import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Deductions extends JPanel {
    
    private final JTextField totalDeductions_textField;
    private final JTextField tardiness_textField;
    private final JTextField taxWithheld_textField;
    private final JTextField gsis_textField;
    private final JTextField loanSSS_textField;
    private final JTextField peraSSS_textField;
    
    Deductions() {
        
        setLayout(null);
        TitledBorder deductions_border = BorderFactory.createTitledBorder("Deductions");
        deductions_border.setTitleColor(Color.BLUE);
        setBorder(deductions_border);
        setBackground(new Color(128, 128, 255));
        setPreferredSize(new Dimension(100, 157));
        
            // Labels
            JLabel deduction = new JLabel("Deduction");
                deduction.setBounds(10, 15, 100, 20);
            add(deduction);
                
            JLabel amount_2 = new JLabel("Amount");
                amount_2.setBounds(230, 15, 100, 20);
            add(amount_2);
            
            JLabel peraSSS = new JLabel("PERA/SSS");
                peraSSS.setBounds(10, 35, 100, 20);
            add(peraSSS);
            
            JLabel loanSSS = new JLabel("SSS LOAN");
                loanSSS.setBounds(10, 55, 100, 20);
            add(loanSSS);
            
            JLabel gsis = new JLabel("GSIS");
                gsis.setBounds(10, 75, 100, 20);
            add(gsis);
            
            JLabel taxWithheld = new JLabel("TAX WITHHELD");
                taxWithheld.setBounds(10, 95, 200, 20);
            add(taxWithheld);
            
            JLabel tardiness = new JLabel("TARDINESS");
                tardiness.setBounds(10, 115, 100, 20);
            add(tardiness);
            
            JLabel totalDeductions = new JLabel("TOTAL DEDUCTIONS");
                totalDeductions.setBounds(10, 135, 200, 20);
            add(totalDeductions);
            
            // Text fields
            peraSSS_textField = new JTextField("0");
                peraSSS_textField.setBounds(200, 35, 100, 15);
            add(peraSSS_textField);
            
            loanSSS_textField = new JTextField("0");
                loanSSS_textField.setBounds(200, 55, 100, 15);
            add(loanSSS_textField);
            
            gsis_textField = new JTextField("0");
                gsis_textField.setBounds(200, 75, 100, 15);
                gsis_textField.setEditable(false);
            add(gsis_textField);
            
            taxWithheld_textField = new JTextField("0");
                taxWithheld_textField.setBounds(200,95, 100, 15);
                taxWithheld_textField.setEditable(false);
            add(taxWithheld_textField);
            
            tardiness_textField = new JTextField("0");
                tardiness_textField.setBounds(200,115, 100, 15);
                tardiness_textField.setEditable(false);
            add(tardiness_textField);
            
            totalDeductions_textField = new JTextField("0");
                totalDeductions_textField.setBounds(200,135, 100, 15);
                totalDeductions_textField.setEditable(false);
            add(totalDeductions_textField);
    }
    public JTextField getPeraSSSTextField(){
        return peraSSS_textField;
    }
    public JTextField getLoanSSSTextField(){
        return loanSSS_textField;
    }
    public JTextField getGSISTextField(){
        return gsis_textField;
    }
    public JTextField getTaxWithheldTextField(){
        return taxWithheld_textField;
    }
    public JTextField getTardinessTextField(){
        return tardiness_textField;
    }
    public JTextField getTotalDeductionsTextField(){
        return totalDeductions_textField;
    }
    // clear all text fields
    public void clearDeductionsTextFields() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(JTextField.class)) {
                JTextField textField = (JTextField) field.get(this);
                textField.setText("0");
            }
        }
    }

}
