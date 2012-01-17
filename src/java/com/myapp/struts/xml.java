/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
/**
 *
 * @author BerkosDesk
 */
public class xml {
    
    
    
    
    static String xml(String onoma){
        
        
         SAXBuilder builder = new SAXBuilder();
	//  File xmlFile = new File("C:/Users/BerkosDesk/Documents/NetBeansProjects/TestEL/Basket.xml");
           //File xmlFile = new File("/webapps/Basket.xml");
         
         // File xmlFile = new File("/http://texwww.inf.uth.gr:8080/~adberkak/Basket.xml");
        //File xmlFile = new File("Basket.xml");
          Element  node1=null,node2=null,node3=null,node4=null,node5=null;
          try {
                
		Document document = (Document) builder.build("http://texwww.inf.uth.gr:8080/~adberkak/Basket2.xml");
                //Document document = (Document) builder.build("http://inf-server.inf.uth.gr/~adberkak/Basket2.xml");
                
		Element rootNode = document.getRootElement();
		List list = rootNode.getChildren("ITEM");
 
                node1 = (Element) list.get(0);
                node2 = (Element) list.get(1);
                node3 = (Element) list.get(2);
                node4 = (Element) list.get(3);
                node5 = (Element) list.get(4);
		// Price=node2.getChildText("Price");
                
                for (int i = 0; i < list.size(); i++) {
 
		   Element node = (Element) list.get(i);
 
		 //  System.out.println("Product : " + node.getChildText("name"));
		//   System.out.println("Cafe: " + node.getChildText("Price"));

 
		}
 
	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
         
          if(onoma.equals("keyboard"))
                return node2.getChildText("Price");
          else if (onoma.equals("mouse"))
                return node1.getChildText("Price");
          else if(onoma.equals("monitor"))
              return node3.getChildText("Price");
          else if(onoma.equals("printer"))
              return node4.getChildText("Price");
          else if(onoma.equals("scanner"))
              return node5.getChildText("Price");
          
          
          else return "kati pige strava";
    }
    
    
}
