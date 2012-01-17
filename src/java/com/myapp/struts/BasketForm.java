/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author BerkosDesk
 */
public class BasketForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private String email;
    private String error;

    private  Double priceMouse =new Double( xml.xml("mouse") ) ;
    private  Double priceKey =new Double( xml.xml("keyboard") ) ;
    private  Double priceMonitor =new Double( xml.xml("monitor") ) ;
    private  Double pricePrinter =new Double( xml.xml("printer") ) ;
    private  Double priceScanner =new Double( xml.xml("scanner") ) ;
    private double tMouse;
    private int qMouse;
    private double tKey;
    private int qKey;
    private double tMonitor;
    private int qMonitor;
    private double tPrinter;
    private int qPrinter;
    private double tScanner;
    private int qScanner;
    private double total;
    
    public Double getPriceKey() {
        return priceKey;
    }

    public void setPriceKey(Double priceKey) {
        this.priceKey = priceKey;
    }

    public Double getPriceMonitor() {
        return priceMonitor;
    }

    public void setPriceMonitor(Double priceMonitor) {
        this.priceMonitor = priceMonitor;
    }

    public Double getPriceMouse() {
        return priceMouse;
    }

    public void setPriceMouse(Double priceMouse) {
        this.priceMouse = priceMouse;
    }

    public Double getPricePrinter() {
        return pricePrinter;
    }

    public void setPricePrinter(Double pricePrinter) {
        this.pricePrinter = pricePrinter;
    }

    public Double getPriceScanner() {
        return priceScanner;
    }

    public void setPriceScanner(Double priceScanner) {
        this.priceScanner = priceScanner;
    }

    public int getqKey() {
        return qKey;
    }

    public void setqKey(int qKey) {
        this.qKey = qKey;
    }

    public int getqMonitor() {
        return qMonitor;
    }

    public void setqMonitor(int qMonitor) {
        this.qMonitor = qMonitor;
    }

    public int getqMouse() {
        return qMouse;
    }

    public void setqMouse(int qMouse) {
        this.qMouse = qMouse;
    }

    public int getqPrinter() {
        return qPrinter;
    }

    public void setqPrinter(int qPrinter) {
        this.qPrinter = qPrinter;
    }

    public int getqScanner() {
        return qScanner;
    }

    public void setqScanner(int qScanner) {
        this.qScanner = qScanner;
    }

    public double gettKey() {
        tKey=qKey*priceKey;
        return tKey;
    }

    public void settKey(double tKey) {
        this.tKey = tKey;
    }

    public double gettMonitor() {
        tMonitor=qMonitor*priceMonitor;
        return tMonitor;
    }

    public void settMonitor(double tMonitor) {
        this.tMonitor = tMonitor;
    }

    public double gettMouse() {
        tMouse=qMouse*priceMouse;
        return tMouse;
    }

    public void settMouse(double tMouse) {
        this.tMouse = tMouse;
    }

    public double gettPrinter() {
        tPrinter=qPrinter*pricePrinter;
        return tPrinter;
    }

    public void settPrinter(double tPrinter) {
        this.tPrinter = tPrinter;
    }

    public double gettScanner() {
        tScanner=qScanner*priceScanner;
        return tScanner;
    }

    public void settScanner(double tScanner) {
        this.tScanner = tScanner;
    }

    public double getTotal() {
        total=qKey*priceKey +qScanner*priceScanner +qPrinter*pricePrinter+qMouse*priceMouse + qMonitor*priceMonitor;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    
    
    
 
   
    
    public String getError() {
        return error;
    }
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // error message


    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public void setError() {
     this.error =  "<span style='color:blue'>ορισατε αρνητικη τιμη για καποια ποσοτητα του προιοντος</span>";
}
    
    

    /**
     *
     */
    public BasketForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
