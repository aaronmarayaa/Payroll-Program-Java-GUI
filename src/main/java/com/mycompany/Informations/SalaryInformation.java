package com.mycompany.Informations;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SalaryInformation extends JPanel {
    
    private JTextField grossPay_textField;
    private JTextField overtimePay_textField;
    private JTextField regularPay_textField;
    private JTextField hoursOvertime_textField;
    private JTextField hoursWorking_textField;
    private JTextField absent_textField;
    private JTextField late_textField;
    private JTextField salaryRate_textField;
    private JTextField salaryLevel_textField;
    private JButton compute_button;
    
    public SalaryInformation() {
            setLayout(null);
            
            TitledBorder salary_border = BorderFactory.createTitledBorder("Salary Information");
            salary_border.setTitleColor(Color.BLUE);
            setBorder(salary_border);
            setBackground(new Color(128, 128, 255));
            setPreferredSize(new Dimension(300, 100));
            
            //Labels
            JLabel salaryLevel = new JLabel("Salary Level:");
                salaryLevel.setBounds(10, 15, 100, 20);
            add(salaryLevel);
            
            JLabel salaryRate = new JLabel("Salary Rate:");
                salaryRate.setBounds(10, 40, 100, 20);
            add(salaryRate);
            
            JLabel late = new JLabel("Late:");
                late.setBounds(10, 65, 100, 20);
            add(late);
            
            JLabel absent = new JLabel("Absent:");
                absent.setBounds(100, 65, 100, 20);
            add(absent);
            
            JLabel hoursWorkings = new JLabel("Hours Working:");
                hoursWorkings.setBounds(250, 15, 100, 20);
            add(hoursWorkings);
            
            JLabel hoursOvertime = new JLabel("Hours Overtime:");
                hoursOvertime.setBounds(250, 40, 100, 20);
            add(hoursOvertime);
            
            JLabel regularPay = new JLabel("Regular Pay:");
                regularPay.setBounds(450,15, 100, 20);
            add(regularPay);
            
            JLabel overtimePay = new JLabel("Overtime Pay:");
                overtimePay.setBounds(450,40, 100, 20);
            add(overtimePay);
            
            JLabel grossPay = new JLabel("Gross Pay:");
                grossPay.setBounds(450,65, 100, 20);
            add(grossPay);
            
            //Text fields
            salaryLevel_textField = new JTextField();
                salaryLevel_textField.setBounds(100, 15, 45, 20);
            add(salaryLevel_textField);
            
            salaryRate_textField = new JTextField();
                salaryRate_textField.setBounds(100, 40, 100, 20);
                salaryRate_textField.setEditable(false);
            add(salaryRate_textField);
            
            late_textField = new JTextField();
                late_textField.setBounds(45, 65, 50, 20);
            add(late_textField);
            
            absent_textField = new JTextField();
                absent_textField.setBounds(150, 65, 50, 20);
            add(absent_textField);
            
            hoursWorking_textField = new JTextField();
                hoursWorking_textField.setBounds(350, 15, 50, 20);
            add(hoursWorking_textField);
            
            hoursOvertime_textField = new JTextField();
                hoursOvertime_textField.setBounds(350, 40, 50, 20);
            add(hoursOvertime_textField);
            
            regularPay_textField = new JTextField();
                regularPay_textField.setBounds(550, 15, 100, 20);
            add(regularPay_textField);
            
            overtimePay_textField = new JTextField();
                overtimePay_textField.setBounds(550, 40, 100, 20);
            add(overtimePay_textField);
            
            grossPay_textField = new JTextField();
                grossPay_textField.setBounds(550, 65, 100, 20);
            add(grossPay_textField);
            
            JButton ok_button = new JButton("Ok");
                ok_button.setBounds(150, 15, 50 ,20);
                ok_button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String level = salaryLevel_textField.getText();
                        if(level.equals("1"))
                            salaryRate_textField.setText("350.00");
                        else if(level.equals("2"))
                            salaryRate_textField.setText("400.00");
                        else if(level.equals("3"))
                            salaryRate_textField.setText("450.00");
                        else if(level.equals("4"))
                            salaryRate_textField.setText("550.00");
                        else if(level.equals("5"))
                            salaryRate_textField.setText("600.00");
                        else
                            salaryRate_textField.setText("0.00");
                    }
                });
            add(ok_button);
            
            compute_button = new JButton("Compute");
                compute_button.setBounds(300, 70, 100 ,20);
            add(compute_button);
    }
    public JButton getComputeButton(){
        return compute_button;
    }
    // get text fields
    public JTextField getSalaryLevelTextField(){
        return salaryLevel_textField;
    }
    public JTextField getSalaryRateTextField(){
        return salaryRate_textField;
    }
    public JTextField getLateTextField(){
        return late_textField;
    }
    public JTextField getAbsentTextField(){
        return absent_textField;
    }
    public JTextField getHoursWorkingTextField(){
        return hoursWorking_textField;
    }
    public JTextField getHoursOvertimeTextField(){
        return hoursOvertime_textField;
    }
    public JTextField getRegularPayTextField(){
        return regularPay_textField;
    }
    public JTextField getOvertimePayTextField(){
        return overtimePay_textField;
    }
    public JTextField getGrossPayTextField(){
        return grossPay_textField;
    }
    // clear all text fields
    public void clearSalaryTextFields() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(JTextField.class)) {
                JTextField textField = (JTextField) field.get(this);
                textField.setText("");
            }
        }
    }
}
