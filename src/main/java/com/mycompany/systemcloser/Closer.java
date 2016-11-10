/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systemcloser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Maarcin
 */

public class Closer extends JPanel{
    private Date date;
    
    JButton button;
    public Closer (JButton button)
    {
        this.button=button;
        button.addActionListener(null);
        
    }
    public void closeButton(ActionListener listener)
    {
        button.addActionListener(listener);
    }
    public void ActionPerformed (ActionEvent ae)
    {
        System.out.println(date);
    }
    

    
    
    
    
    
}
