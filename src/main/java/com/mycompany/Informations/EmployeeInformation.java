package com.mycompany.Informations;

import com.mycompany.Computations.PaymentComputationPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.Field;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class EmployeeInformation extends JPanel {
    
    private final JTextField employeeName_textField;
    private final JTextField address_textField;
    private final JComboBox<String> positions_option;
        
    public EmployeeInformation() {
                        
        setLayout(null);
        TitledBorder employee_border = BorderFactory.createTitledBorder("Employee Information");
        employee_border.setTitleColor(Color.BLUE);
        setBorder(employee_border);
        setBackground(new Color(128, 128, 255));
        setPreferredSize(new Dimension(300, 75));
            
            //Labels
            JLabel month = new JLabel("Month:");
                month.setBounds(10, 15, 100, 20);
            add(month);
            
            JLabel position = new JLabel("Position:");
                position.setBounds(10, 40, 100, 20);
            add(position);
            
            JLabel employeeName = new JLabel("Employee name:");
                employeeName.setBounds(300, 15, 100, 20);
            add(employeeName);
            
            JLabel address = new JLabel("Address:");
                address.setBounds(300, 40, 100, 20);
            add(address);
            
            //Text fields
            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
            JComboBox<String> months_option = new JComboBox<>(months);
                months_option.setBounds(70, 15, 150, 20);
            add(months_option);
            
            String[] positions = {"Merchandiser", "Bagger", "Cashier"};
            positions_option = new JComboBox<>(positions);
                positions_option.setBounds(70, 40, 150, 20);
            add(positions_option);
            
            employeeName_textField = new JTextField();
                employeeName_textField.setBounds(400, 15, 200, 20);
                employeeName_textField.addActionListener(e ->{
                    // Get the text from the employeeName_textField
                    String nameOfEmployee = employeeName_textField.getText();
                    
                    // calls Received panel as a representation of `.getReceivedPanel()`
                    // then call the method `.setEmployeeNameText();` and pass `employeeName`
                    PaymentComputationPanel.getReceivedPanel().setEmployeeName(nameOfEmployee);
                });
            add(employeeName_textField);
            
            address_textField = new JTextField();
                address_textField.setBounds(400, 40, 200, 20);
            add(address_textField);
    }
    public JTextField getEmployeeNameTextField(){
        return employeeName_textField;
    }
    public JTextField getAddressTextField(){
        return address_textField;
    }
    public String getComboBoxItem(){
            String selectedItem = (String) positions_option.getSelectedItem();
        return selectedItem;
    }
    // clear all text fields
    public void clearEmployeePanelTextFields() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(JTextField.class)) {
                JTextField textField = (JTextField) field.get(this);
                textField.setText("");
            }
        }
    }
    
}
