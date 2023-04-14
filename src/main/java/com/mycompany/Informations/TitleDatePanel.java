package com.mycompany.Informations;

import java.awt.BorderLayout;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TitleDatePanel extends JPanel {
    TitleDatePanel() {
        setLayout(new BorderLayout());
        
        JLabel payroll = new JLabel("PAYROLL PROGRAM");
            payroll.setFont(new Font("Oswald", Font.BOLD, 23));
            payroll.setVerticalAlignment(SwingConstants.TOP);
        add(payroll, BorderLayout.WEST);
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, hh:mm:ss a");
        String formatted = now.format(formatter);
        JLabel dateTime = new JLabel("Date: " + formatted);
            dateTime.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
        add(dateTime, BorderLayout.EAST);   
    }
}
