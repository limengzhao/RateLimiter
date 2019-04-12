package com.light.limiter.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyScheduledExcutor implements Runnable {
        
    SimpleDateFormat  sf=new SimpleDateFormat ("yyyy-mm-dd HH:mm:ss");
    
    private String jobName;
    
    MyScheduledExcutor(){
        
    }
    MyScheduledExcutor(String jobName){
        this.jobName=jobName;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println ("JobName===== "+jobName+"Ê±¼ä´Á"+sf.format (new Date ()));
        }
    }
    
}



