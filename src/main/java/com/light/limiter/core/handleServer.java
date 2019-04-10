package com.light.limiter.core;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class handleServer extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    private static boolean SUPPORT_CORS=true;
    
    
    /**
     * 
     */

    public void handleServerUtils(HttpServletRequest request,HttpServletResponse response){
        Map<String, Object> headers = null;
        Map<String, Object> data = null;
        String dataString="";
        if(SUPPORT_CORS){
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "GET,POST,JSON");
            response.setHeader("Access-Control-Allow-Headers", "x-request-with,content-type,x-forward-for,accept");
        }
        Cookie[] cookie=request.getCookies ();
        if(cookie!=null&&cookie.length>1){
            Cookie ck=new Cookie ("lastAccessTime" ,System.currentTimeMillis ()+"");
            ck.setHttpOnly (true);
            ck.setMaxAge (-1);
            ck.setSecure (false);//为true意味着指示浏览器仅通过 HTTPS 连接传回 cookie
            response.addCookie (ck);
        }
        try {
            request.setCharacterEncoding ("UTF-8");
            
            if(request.getInputStream ()!=null){
                InputStream os=request.getInputStream ();
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                int line;
                while ((line=os.read ())!=-1) {
                    baos.write (line);
                }
                dataString= baos.toString ("UTF-8");
            }
            response.setCharacterEncoding ("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
