/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author BerkosDesk
 */
public class BasketAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private final static String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        
// extract user data
    BasketForm formBean = (BasketForm) form;
    //String name = formBean.getName();
    //String email = formBean.getEmail();
    // perform validation
   
    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * TA COOKIES TA EVALA SE SXOLIA GIATI TELIKA TO PROGRAMMA DOULEYEI ME TO NA KRATAEI TA SESSION
     * OPIOS THELEI MPOREI NA TO TREKSEI ME COOKIES AN APLA VGALA AYTA TA SXOLIA , TA SXOLIA APO TO JSP.
     * KAI STO STRUTS-CONFIG NA EPILEKSEI STO SCOPE REQUEST ANTI GIA SESSION
    
    System.out.println("hellooo");
    boolean flag=false;
    boolean flag1=false;
    Cookie[] cookies = request.getCookies();
    
    
  //  if(formBean.getqKey()!=0)     {          
    
        if ( cookies != null ) {
                       flag=true;
                    for (int i = 0; i < cookies.length; i++) {
                        Cookie cookie = cookies[i];
                        if (cookie.getName().equals("mouse")) {
                          //if(formBean.getqKey()!=0){ 
                            cookie.setValue(Integer.toString(formBean.getqMouse())) ;
                                       System.out.println("mouse"  + Integer.toString(formBean.getqMouse()));
                        
                       
                         }
                        else if (cookie.getName().equals("key")) {
                          //if(formBean.getqKey()!=0){ 
                            cookie.setValue(Integer.toString(formBean.getqKey())) ;
                                       System.out.println("keyboard"  + Integer.toString(formBean.getqKey()));
                    
                           
                         }
                        else if (cookie.getName().equals("monitor")) {
                          //if(formBean.getqKey()!=0){ 
                            cookie.setValue(Integer.toString(formBean.getqMonitor())) ;
                                       System.out.println("Monitor"  + Integer.toString(formBean.getqMonitor()));
                      
                           
                         }
                        else if (cookie.getName().equals("printer")) {
                          //if(formBean.getqKey()!=0){ 
                            cookie.setValue(Integer.toString(formBean.getqPrinter())) ;
                                       System.out.println("printer"  + Integer.toString(formBean.getqPrinter()));
                        
                        
                         }
                        else if (cookie.getName().equals("scanner")) {
                          //if(formBean.getqKey()!=0){ 
                            cookie.setValue(Integer.toString(formBean.getqScanner())) ;
                                       System.out.println("Scanner"  + Integer.toString(formBean.getqScanner()));
                        
                          // flag1=true;
                         }
                      
                        
                               }
                    if(!flag1){
                    System.out.println("ftiaxnoume neo cookie esoteriko");
                Cookie cookiee=new Cookie("mouse",Integer.toString(formBean.getqMouse()));
                cookiee.setMaxAge(30*60);
                response.addCookie(cookiee);
                Cookie cookie1=new Cookie("key",Integer.toString(formBean.getqKey()));
                cookie1.setMaxAge(30*60);
                response.addCookie(cookie1);
                Cookie cookie2=new Cookie("monitor",Integer.toString(formBean.getqMonitor()));
                cookie2.setMaxAge(30*60);
                response.addCookie(cookie2);
                Cookie cookie3=new Cookie("printer",Integer.toString(formBean.getqPrinter()));
                cookie3.setMaxAge(30*60);
                response.addCookie(cookie3);
                Cookie cookie4=new Cookie("scanner",Integer.toString(formBean.getqScanner()));
                cookie4.setMaxAge(30*60);
                response.addCookie(cookie4);
                    }
                    }
                   else{
                       
                   System.out.println("ftiaxnoume neo cookie");
                Cookie cookie=new Cookie("mouse",Integer.toString(formBean.getqMouse()));
                cookie.setMaxAge(30*60);
                response.addCookie(cookie);  
                Cookie cookie1=new Cookie("key",Integer.toString(formBean.getqKey()));
                cookie1.setMaxAge(30*60);
                response.addCookie(cookie1);
                Cookie cookie2=new Cookie("monitor",Integer.toString(formBean.getqMonitor()));
                cookie2.setMaxAge(30*60);
                response.addCookie(cookie2);
                Cookie cookie3=new Cookie("printer",Integer.toString(formBean.getqPrinter()));
                cookie3.setMaxAge(30*60);
                response.addCookie(cookie3);
                Cookie cookie4=new Cookie("scanner",Integer.toString(formBean.getqScanner()));
                cookie4.setMaxAge(30*60);
                response.addCookie(cookie4);
        
        
        }
    
  //  }
    */
    if (  formBean.getqKey() <0 ||  formBean.getqMonitor() <0  || 
            formBean.getqMouse() <0 ||formBean.getqScanner() <0 ||formBean.getqPrinter() <0   ) 
    
    {  
            formBean.setError();
        return mapping.findForward(FAILURE);
    }
    
    
    
    
    

    return mapping.findForward(SUCCESS);
}
}
