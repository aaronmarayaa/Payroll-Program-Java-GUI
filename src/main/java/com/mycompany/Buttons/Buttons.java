package com.mycompany.Buttons;

import com.mycompany.Computations.PaymentComputationPanel;
import com.mycompany.Informations.InformationPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons extends JPanel{
    
    public Buttons(JFrame frame) {
        
        JButton print = new JButton("Print");
            print.addActionListener( e -> {
                JFrame printFrame = new JFrame();
                
                JPanel printPanel  = new JPanel();
                
                    printPanel.setLayout(null);
                    
                        // Employee Name: `employeeName`
                        JLabel nameText = new JLabel("Employee name: ");
                            nameText.setBounds(10, 15, 200, 20);
                        printPanel.add(nameText);
                        JLabel employeeName = new JLabel(InformationPanel.getEmployeeInformationPanel().getEmployeeNameTextField().getText());
                            employeeName.setBounds(150, 15, 500, 20);
                        printPanel.add(employeeName);
                        
                        // Address: `address`
                        JLabel addressText = new JLabel("Address: ");
                            addressText.setBounds(10, 40, 200, 20);
                        printPanel.add(addressText);
                        JLabel address = new JLabel(InformationPanel.getEmployeeInformationPanel().getAddressTextField().getText());
                            address.setBounds(150, 40, 200, 20);
                        printPanel.add(address);
                        
                        // Position = `position`
                        JLabel positionText = new JLabel("Position: ");
                            positionText.setBounds(10, 65, 200, 20);
                        printPanel.add(positionText);
                        JLabel position = new JLabel(InformationPanel.getEmployeeInformationPanel().getComboBoxItem());
                            position.setBounds(150, 65, 200, 20);
                        printPanel.add(position);
                        
                        // Date : `dateAndTime`
                        JLabel dateAndTimeText = new JLabel("Date: ");
                            dateAndTimeText.setBounds(10, 90, 200, 20);
                        printPanel.add(dateAndTimeText);
                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, hh:mm:ss a");
                        String formatted = now.format(formatter);
                        JLabel dateAndTime = new JLabel(formatted);
                            dateAndTime.setBounds(150, 90, 200, 20);
                        printPanel.add(dateAndTime);
                        
                        // Gross Pay Php: `grossPay`
                        JLabel grossPayText = new JLabel("Gross Pay Php: ");
                            grossPayText.setBounds(10, 165, 200, 20);
                        printPanel.add(grossPayText);
                        JLabel grossPay = new JLabel(PaymentComputationPanel.getSummaryPanel().getGrossPayPhpTextField().getText());
                            grossPay.setBounds(150, 165, 200, 20);
                        printPanel.add(grossPay);
                        
                        // Total Allowance Php: `totalAllowance`
                        JLabel totalAllowanceText = new JLabel("Total Allowance Php: ");
                            totalAllowanceText.setBounds(10, 190, 200, 20);
                        printPanel.add(totalAllowanceText);
                        JLabel totalAllowance = new JLabel(PaymentComputationPanel.getSummaryPanel().getTotalAllowancePhpTextField().getText());
                            totalAllowance.setBounds(150, 190, 200, 20);
                        printPanel.add(totalAllowance);
                        
                        // Total Deduction Php: `totalDeduction`
                        JLabel totalDeductionsText = new JLabel("Total Deductions Php: ");
                            totalDeductionsText.setBounds(10, 215, 500, 20);
                        printPanel.add(totalDeductionsText);
                        JLabel totalDeductions = new JLabel(PaymentComputationPanel.getSummaryPanel().getTotalDeductionsPhpTextField().getText());
                            totalDeductions.setBounds(150, 215, 500, 20);
                        printPanel.add(totalDeductions);
                        
                        JLabel line = new JLabel("========================");
                            line.setBounds(10, 245, 500, 20);
                        printPanel.add(line);
                        
                        // Net Pay Php: `netPay`
                        JLabel netPayText = new JLabel("Net Pay Php: ");
                            netPayText.setBounds(10, 265, 500, 20);
                        printPanel.add(netPayText);
                        JLabel netPay = new JLabel(PaymentComputationPanel.getSummaryPanel().getNetPayPhpTextField().getText());
                            netPay.setBounds(150, 265, 500, 20);
                        printPanel.add(netPay);
                        
                printFrame.add(printPanel);
                printFrame.setResizable(false);
                printFrame.setVisible(true);
                printFrame.setSize(500, 350);
                printFrame.setLocationRelativeTo(null);
            });
        add(print);
        
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
