package com.mycompany.systemcloser;


import java.util.Date;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maarcin
 */
public class CountDown implements Runnable {

    int seconds;
    int minutes;
    int hours;
    JLabel label;
    long value;
    public CountDown(JLabel label,long value) {
        
        this.label = label;
        this.value=value;
    }

    @Override
    public void run() {
        try {
            while(true){
                calcDifference(value);
                label.setText(hours+" "+minutes+" "+seconds);
            }
        } catch (Exception e) {

        }
    }

    private void calcDifference(long addedTime) {
        Date dateNow = new Date();
        Date dateEnd = new Date();
        dateEnd.setTime(dateNow.getTime() + addedTime * 1000 * 3600);
        long difference = dateEnd.getTime() - dateNow.getTime();

        seconds = (int) (difference / 1000) % 60;
        minutes = (int) ((difference / (1000 * 60)) % 60);
        hours = (int) ((difference / (1000 * 60 * 60)) % 24);
    }

}
