package com.mycompany.Computations;

import com.mycompany.Informations.InformationPanel;

public class Calculations{
    public Calculations(){
                
        InformationPanel.getSalaryInformationPanel().getComputeButton().addActionListener(e -> {
                try {
                    double hourlyRate = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getSalaryRateTextField().getText()) / 8.0;
                    double regularPay_value = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getHoursWorkingTextField().getText()) * hourlyRate;
                    // set text to Regular pay text field in Salary information panel
                    InformationPanel.getSalaryInformationPanel().getRegularPayTextField().setText(String.format("%.2f", regularPay_value));
                    
                    double overtimePay_value = Double.parseDouble(InformationPanel.getSalaryInformationPanel().getHoursOvertimeTextField().getText()) * hourlyRate * 1.1;
                    // set text to Overtime pay text field in Salary Information panel
                    InformationPanel.getSalaryInformationPanel().getOvertimePayTextField().setText(String.format("%.2f", overtimePay_value));
                    
                    double grossPay_value = regularPay_value + overtimePay_value;
                    // set text to gross pay text field in Salary information panel
                    InformationPanel.getSalaryInformationPanel().getGrossPayTextField().setText(String.format("%.2f", grossPay_value));
                    // set text to gross pay php text field in Summary Panel
                    PaymentComputationPanel.getSummaryPanel().getGrossPayPhpTextField().setText(String.format("%.2f", grossPay_value));
                    
                    // set text to tax withheld text field in Deductions panel
                    PaymentComputationPanel.getDeductionsPanel().getTaxWithheldTextField().setText(String.format("%.2f", grossPay_value * 0.10));
                    
                    // set text to gsis text field in Deductions panel
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
                        // set text to Tardiness text field in Deductions panel
                        PaymentComputationPanel.getDeductionsPanel().getTardinessTextField().setText(String.format("%.2f", hourlyRate * late_arrival + absences));
                } catch(NumberFormatException a) {}
        });
        
        PaymentComputationPanel.getEarningsPanel().getUniformAllowanceTextField().addActionListener( e -> {
            try {
                double totalAllowance_value =
                    Double.parseDouble(PaymentComputationPanel.getEarningsPanel().getTransactionAllowanceTextField().getText()) +
                    Double.parseDouble(PaymentComputationPanel.getEarningsPanel().getIncentivesTextField().getText()) +
                    Double.parseDouble(PaymentComputationPanel.getEarningsPanel().getUniformAllowanceTextField().getText());
                
                // set text to Total Allowance text field
                PaymentComputationPanel.getEarningsPanel().getTotalAllowanceTextField().setText(String.format("%.2f", totalAllowance_value));
                PaymentComputationPanel.getSummaryPanel().getTotalAllowancePhpTextField().setText(String.format("%.2f", totalAllowance_value));
            } catch(NumberFormatException a) {}
        });
        
        PaymentComputationPanel.getDeductionsPanel().getLoanSSSTextField().addActionListener( e -> {
            try {
                double totalDeductions_value = 
                       Double.parseDouble(PaymentComputationPanel.getDeductionsPanel().getPeraSSSTextField().getText()) +
                       Double.parseDouble(PaymentComputationPanel.getDeductionsPanel().getLoanSSSTextField().getText()) +
                       Double.parseDouble(PaymentComputationPanel.getDeductionsPanel().getGSISTextField().getText()) +
                       Double.parseDouble(PaymentComputationPanel.getDeductionsPanel().getTaxWithheldTextField().getText()) +
                       Double.parseDouble(PaymentComputationPanel.getDeductionsPanel().getTardinessTextField().getText());
                
                // set text to Total Deductions text field
                PaymentComputationPanel.getDeductionsPanel().getTotalDeductionsTextField().setText(String.format("%.2f", totalDeductions_value));
                PaymentComputationPanel.getSummaryPanel().getTotalDeductionsPhpTextField().setText(String.format("%.2f", totalDeductions_value));
                
                double netPayPhp_value = 
                       Double.parseDouble(PaymentComputationPanel.getSummaryPanel().getGrossPayPhpTextField().getText()) +
                       Double.parseDouble(PaymentComputationPanel.getSummaryPanel().getTotalAllowancePhpTextField().getText()) -
                       Double.parseDouble(PaymentComputationPanel.getSummaryPanel().getTotalDeductionsPhpTextField().getText());
                
                // set text to Net pay php text field
                PaymentComputationPanel.getSummaryPanel().getNetPayPhpTextField().setText(String.format("%.2f", netPayPhp_value));
            } catch(NumberFormatException a) {}
        });
    }
}
