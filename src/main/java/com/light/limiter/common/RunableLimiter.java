package com.light.limiter.common;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.light.limiter.control.LimiterControl;



public class RunableLimiter {
    
    ExecutorService  executorService=Executors.newCachedThreadPool ();
    
    private static boolean Running=false;//�ж��߳��Ƿ�����
    
    private static boolean token=false;//�ж��Ƿ��Ѿ���ȡ�ĵ�����
    
//    private ConcurrentMap<K, V>
    
    
    /**
     * �����߳�
     */
    public void start(){
        //        executorService.submit (new Runnable() {
        //            public void run() {
        //                LimiterControl lc=new LimiterControl();
        //                token=lc.Limiter ();
        //            }
        //        });
        
        executorService.execute (new Runnable() {
            public void run() {
                LimiterControl lc=new LimiterControl();
                token=lc.Limiter ();
            }
        });
        
    }
    
    
    
    
    
    
    //�����Ƿ���������
    public boolean getToken(){
        
        return token;
    }
    //ֹͣ�߳�
    public void destroy(){
        executorService.shutdown ();
        Running=false;
    }
    
}
