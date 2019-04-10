package com.light.limiter.common;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.light.limiter.control.LimiterControl;



public class RunableLimiter {
    
    ExecutorService  executorService=Executors.newCachedThreadPool ();
    
    private static boolean Running=false;//判断线程是否运行
    
    private static boolean token=false;//判断是否已经获取的到令牌
    
//    private ConcurrentMap<K, V>
    
    
    /**
     * 启动线程
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
    
    
    
    
    
    
    //返回是否获得李令牌
    public boolean getToken(){
        
        return token;
    }
    //停止线程
    public void destroy(){
        executorService.shutdown ();
        Running=false;
    }
    
}
