package com.mycompany.Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Buttons extends JPanel{
    
    private ArrayList<JTextField> textFields;

    public Buttons(JFrame frame) {
        add(new JButton("Print"));
        
        JButton clear = new JButton("Clear");
        add(clear);
            
        JButton exit = new JButton("Exit");
            exit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    frame.dispose();
                }
            });
            add(exit);
            
    }
    public void clearTextFields() {
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }
}
