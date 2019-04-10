package com.light.limiter.control;

import com.light.limiter.rateLimiter.AccessLimiter;

public class LimiterControl {
    
    
    
    AccessLimiter al=new AccessLimiter();
    //判断是否获得令牌，获得令牌分发usp
    public boolean  Limiter(){
        if(al.tryAcquire ()){
            //sendMess(); //填写调用分发usp的方法
            return true;
        }else{
            return false;
        }
        
    }
    
}
