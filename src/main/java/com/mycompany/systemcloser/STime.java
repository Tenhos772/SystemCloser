/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.systemcloser;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Maarcin
 */
public class STime implements Runnable {

    private JTextField currentTime;

    public STime(JTextField currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public void run() {
        try {
            while(true){
            SimpleDateFormat sdate = new SimpleDateFormat("HH:mm:ss");
            String dateString = sdate.format(new Date());
            currentTime.setText(dateString);

            Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

}
