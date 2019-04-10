package com.light.limiter.rateLimiter;

import com.google.common.util.concurrent.RateLimiter;

public class AccessLimiter {
    
    private RateLimiter  rateLimiter=RateLimiter.create (4);
    
    
    
    /**
     * ��RateLimiter ��ȡ��ɣ��������ɿ��������ӳ��µ������������ȡ�õ��Ļ�
     * @return 
     */
    public boolean tryAcquire(){
        
        return rateLimiter.tryAcquire ();
    }
    
}
