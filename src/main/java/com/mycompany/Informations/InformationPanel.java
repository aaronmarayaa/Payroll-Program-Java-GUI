package com.mycompany.Informations;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class InformationPanel extends JPanel {
    public InformationPanel() {
        setLayout(new BorderLayout());
        
        TitleDatePanel titleDatePanel = new TitleDatePanel();
        add(titleDatePanel, BorderLayout.NORTH);
        
        EmployeeInformation employeeInfo = new EmployeeInformation();
        JPanel employeeInfo_panel = new JPanel(new BorderLayout());
            employeeInfo_panel.add(employeeInfo);
        add(employeeInfo_panel, BorderLayout.CENTER);
        
        SalaryInformation salaryInfo = new SalaryInformation();
        JPanel salaryInfo_panel = new JPanel(new BorderLayout());
            salaryInfo_panel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
            salaryInfo_panel.add(salaryInfo);
        add(salaryInfo_panel, BorderLayout.SOUTH);
    }
}
