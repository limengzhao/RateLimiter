package com.light.limiter.rateLimiter;

import com.google.common.util.concurrent.RateLimiter;

public class AccessLimiter {
    
    private RateLimiter  rateLimiter=RateLimiter.create (4);
    
    
    
    /**
     * 从RateLimiter 获取许可，如果该许可可以在无延迟下的情况下立即获取得到的话
     * @return 
     */
    public boolean tryAcquire(){
        
        return rateLimiter.tryAcquire ();
    }
    
}
