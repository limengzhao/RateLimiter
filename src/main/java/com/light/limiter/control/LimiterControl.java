package com.light.limiter.control;

import com.light.limiter.rateLimiter.AccessLimiter;

public class LimiterControl {
    
    
    
    AccessLimiter al=new AccessLimiter();
    //�ж��Ƿ������ƣ�������Ʒַ�usp
    public boolean  Limiter(){
        if(al.tryAcquire ()){
            //sendMess(); //��д���÷ַ�usp�ķ���
            return true;
        }else{
            return false;
        }
        
    }
    
}
