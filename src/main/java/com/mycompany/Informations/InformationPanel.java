package com.mycompany.Informations;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class InformationPanel extends JPanel {
    
    private static SalaryInformation salaryInformation;
    private static EmployeeInformation employeeInformation;
    
    public InformationPanel() {
        setLayout(new BorderLayout());
        
        TitleDatePanel titleDatePanel = new TitleDatePanel();
        add(titleDatePanel, BorderLayout.NORTH);
        
        employeeInformation = new EmployeeInformation();
        JPanel employeeInfo_panel = new JPanel(new BorderLayout());
            employeeInfo_panel.add(employeeInformation);
        add(employeeInfo_panel, BorderLayout.CENTER);
        
            salaryInformation = new SalaryInformation();
            JPanel salaryInfo_panel = new JPanel(new BorderLayout());
                salaryInfo_panel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
                salaryInfo_panel.add(salaryInformation);
            add(salaryInfo_panel, BorderLayout.SOUTH);
        }
    // get `salaryInformation` making it accessable in `Computation` Panel
    public static final SalaryInformation getSalaryInformation() {
        return salaryInformation;
    }
    public static final EmployeeInformation getEmployeeInformationPanel(){
        return employeeInformation;
    }
}
