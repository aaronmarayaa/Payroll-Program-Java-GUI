package com.mycompany.Computations;

import com.mycompany.Informations.InformationPanel;
import com.mycompany.Informations.SalaryInformation;

public class Calculations{
    public Calculations(){
                
        InformationPanel.getSalaryInformationPanel().getComputeButton().addActionListener(e -> {
                try{
                    double hourlyRate = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getSalaryRateTextField().getText()) / 8.0;
                    double regularPay_value = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getHoursWorkingTextField().getText()) * hourlyRate;
                    InformationPanel.getSalaryInformationPanel().getRegularPayTextField().setText(String.format("%.2f", regularPay_value));
                    
                    double overtimePay_value = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getHoursOvertimeTextField().getText()) * hourlyRate * 1.1;
                    InformationPanel.getSalaryInformationPanel().getOvertimePayTextField().setText(String.format("%.2f", overtimePay_value));
                    
                    double grossPay_value = regularPay_value + overtimePay_value;
                    InformationPanel.getSalaryInformationPanel().getGrossPayTextField().setText(String.format("%.2f", grossPay_value));
                    PaymentComputationPanel.getSummaryPanel().getGrossPayPhpTextField().setText(String.format("%.2f", grossPay_value));
                    
                    PaymentComputationPanel.getDeductionsPanel().getTaxWithheldTextField().setText(String.format("%.2f", grossPay_value * 0.10));
                    
                    String level = InformationPanel.getSalaryInformationPanel().getSalaryLevelTextField().getText();
                        if(level.equals("1"))
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText(String.format("%.2f", Double.parseDouble(InformationPanel.getSalaryInformationPanel().getRegularPayTextField().getText()) * 0.01 ));
                        else if(level.equals("2"))
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText(String.format("%.2f", Double.parseDouble(InformationPanel.getSalaryInformationPanel().getRegularPayTextField().getText()) * 0.015 ));
                        else if(level.equals("3"))
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText(String.format("%.2f", Double.parseDouble(InformationPanel.getSalaryInformationPanel().getRegularPayTextField().getText()) * 0.02 ));
                        else if(level.equals("4"))
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText(String.format("%.2f", Double.parseDouble(InformationPanel.getSalaryInformationPanel().getRegularPayTextField().getText()) * 0.03 ));
                        else if(level.equals("5"))
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText(String.format("%.2f", Double.parseDouble(InformationPanel.getSalaryInformationPanel().getRegularPayTextField().getText()) * 0.04 ));
                        else
                            PaymentComputationPanel.getDeductionsPanel().getGSISTextField().setText("0.00");
                        
                        double late_arrival = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getLateTextField().getText()) / 60.0;
                        double absences = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getAbsentTextField().getText()) * Double.parseDouble(InformationPanel.getSalaryInformationPanel().getSalaryRateTextField().getText());
                        PaymentComputationPanel.getDeductionsPanel().getTardinessTextField().setText(String.format("%.2f", hourlyRate * late_arrival + absences));
                } catch(NumberFormatException a){
                    
                }
        });
    }
}
