/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systemcloser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Maarcin
 */

public class Closer extends JPanel{
    private Date date;
    
    JButton button;

    public Closer() {
    }
   
    public Closer (JButton button)
    {
        this.button=button;
        button.addActionListener(null);
        
    }
    public void closeButton(ActionListener listener)
    {
        button.addActionListener(listener);
        button.setText("234");
    }
   
    public void ActionPerformed (ActionEvent ae)
    {
        System.out.println(date);
    }
    public String showTime(){
       SimpleDateFormat sdate = new SimpleDateFormat("HH:mm:ss");
       String dateString = sdate.format(new Date());
       return dateString;
    }
    

    
    
    
    
    
}
