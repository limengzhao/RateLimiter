package com.light.limiter.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.light.limiter.utils.BatchEnum;

public class MyTest {
    
    public static void main(String[] args) {
        
//        int initDelayed=1;//��ʼ����ʱ ��λ��
//        int period=3;//ִ�м��ʱ�� ��λ��
//        ScheduledExecutorService  executorService=Executors.newScheduledThreadPool(10);
//        SimpleDateFormat  sf=new SimpleDateFormat ("yyyy-mm-dd HH:mm:ss");
//        System.out.println ("jobName1��ʼִ��ʱ�䣺"+sf.format (new Date ()));
//        executorService.scheduleAtFixedRate (new MyScheduledExcutor("jobName1") , initDelayed , period , TimeUnit.MINUTES);
////        System.out.println ("jobName2��ʼִ��ʱ�䣺"+sf.format (new Date ()));
////        executorService.scheduleWithFixedDelay (new MyScheduledExcutor("jobName2") , initDelayed , period , TimeUnit.SECONDS);
//        
//        
//        ScheduledExecutorService ses=Executors.newScheduledThreadPool (10);
        
//        System.out.println (BatchEnum.BATCH_CLASS_ORG.getCode ());
        Calendar  c = Calendar.getInstance();
        c.set (Calendar.DAY_OF_MONTH,(Calendar.DAY_OF_MONTH)+7);
        System.out.println (c.get(Calendar.DATE));

    }
    
}
