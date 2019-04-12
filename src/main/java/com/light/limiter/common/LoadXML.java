package com.light.limiter.common;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class LoadXML {
    
    private static Map<String,Map<String,String>> map=new HashMap<String,Map<String,String>> ();
    
    /**
     * dom4j½âÎöXMLÎÄ¼þ
     */
    public void  loadXML(){
        SAXReader reader = new SAXReader();
        File file=new File ("src/main/resources/book.xml");
        try {
            Document document=reader.read (file);
            Element root = document.getRootElement();
            System.out.println (root.getName ());
            Iterator itElRoot=root.attributeIterator ();
            while(itElRoot.hasNext ()){
                Attribute abt=(Attribute) itElRoot.next ();
                System.out.println (abt.getName ()+abt.getValue ());
                
            }
            Iterator it=root.elementIterator ();
            System.out.println (root.getName ()+root.attributes ().size ());
             while (it.hasNext ()) {
                 Element el= (Element) it.next ();
                 Iterator itEl=el.attributeIterator ();
                 while (itEl.hasNext ()) {
                     Attribute ab= (Attribute) itEl.next ();
                     System.out.println (ab.getName ()+ab.getValue ());
                }
                
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        new LoadXML().loadXML();
    }
    
    
}
