<%-- 
    Document   : basket.jsp
    Created on : 6 Ιαν 2012, 1:22:20 μμ
    Author     : BerkosDesk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="grafika2.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Shopping Cart by Antonis</title>
    </head>
    <body>
        <h1>Welcome to Stockhouse!</h1>
        <h3>Shopping Cart by Antonis</h3>
        

        <%--
        
        
        ayta ta vazo se sxolia giati me to na epilekso sto struts-config na krataei kathe Javabean  ana session anti gia request pou
        eixe etsi me ayton ton tropo den xreiazete ta cookies kathos to struts krataei session gia kathe synedria ksexorista
        
         <logic:present cookie="JSESSIONID">
                <logic:present cookie="mouse">
                    <bean:define id="oldmouse" value='${cookie.mouse.value}'/>
                </logic:present>
                 <logic:present cookie="key">
                    <bean:define id="oldkey" value='${cookie.key.value}'/>
                </logic:present>
                 <logic:present cookie="monitor">
                    <bean:define id="oldmonitor" value='${cookie.monitor.value}'/>
                </logic:present>
                 <logic:present cookie="printer">
                    <bean:define id="oldprinter" value='${cookie.printer.value}'/>
                </logic:present>
                 <logic:present cookie="scanner">
                    <bean:define id="oldscanner" value='${cookie.scanner.value}'/>
                </logic:present>

                </logic:present>
         

        --%>
        

        
    
        
        <html:form action="/basket">
            <bean:write name="BasketForm" property="error" filter="false"/>

             <table cellpadding="3" size="5">
<tbody>
<tr>
<td align="LEFT"><strong>Item</strong></td>
<td align="RIGHT"><strong>Price</strong></td>
<td align="RIGHT"><strong>-->    Set New Quantity    <--</strong></td>
<td align="RIGHT"><strong>Current Quantity</strong></td>
<td align="RIGHT"><strong>Total</strong></td>
</tr>
<tr>
<td align="LEFT">Mouse</td>
<td align="RIGHT">$ <bean:write name="BasketForm" property="priceMouse" /></td>
<td align="RIGHT"><html:text property="qMouse" /> </td>
<td align="RIGHT"><bean:write name="BasketForm" property="qMouse"  /></td>

<td align="RIGHT">$ ${BasketForm.tMouse}</td>
</tr>
<tr>
<td align="LEFT">Keyboard</td>
<td align="RIGHT">$ <bean:write name="BasketForm" property="priceKey"  /></td>
<td align="RIGHT"><html:text  property="qKey"   /></td>
<td align="RIGHT"><bean:write name="BasketForm" property="qKey"  /></td>

<td align="RIGHT">$ ${BasketForm.tKey}</td>
</tr>
<tr>
<td align="LEFT">Monitor</td>
<td align="RIGHT">$ <bean:write name="BasketForm" property="priceMonitor" /></td>
<td align="RIGHT"><html:text property="qMonitor" /></td>
<td align="RIGHT"><bean:write name="BasketForm" property="qMonitor"  /></td>

<td align="RIGHT">$ ${BasketForm.tMonitor}</td>
</tr>
<tr>
<td align="LEFT">Printer</td>
<td align="RIGHT">$ <bean:write name="BasketForm" property="pricePrinter" /></td>
<td align="RIGHT"><html:text property="qPrinter" /></td>
<td align="RIGHT"><bean:write name="BasketForm" property="qPrinter"  /></td>

<td align="RIGHT">$ ${BasketForm.tPrinter}</td>

</tr>
<tr>
<td align="LEFT">Scanner</td>
<td align="RIGHT">$ <bean:write name="BasketForm" property="priceScanner" /></td>
<td align="RIGHT"><html:text property="qScanner" /></td>
<td align="RIGHT"><bean:write name="BasketForm" property="qScanner"  /></td>

<td align="RIGHT">$ ${BasketForm.tScanner}</td>

</tr>

<tr>
<td align="LEFT">Total</td>
<td align="RIGHT"></td>
<td align="RIGHT"></td>
<td align="RIGHT"></td>

<td align="RIGHT">$ ${BasketForm.total}</td>
</tr>
</tbody>
</table>
<input type="submit" value="Πληρωμη!"  />

                        
        </html:form>
       
         <p></p>
         <%--
<INPUT TYPE="BUTTON" VALUE="SRC" ONCLICK="window.location.href='http://dl.dropbox.com/u/12925667/project4_WWW_Berkakis.rar'" >  
<INPUT TYPE="BUTTON" VALUE="?" ONCLICK="window.location.href='doc1.html' ">  
<INPUT TYPE="BUTTON" VALUE="GitHub " ONCLICK="window.location.href='https://github.com/berkos/Shopping-Cart-using-Struts' ">  
         --%>
         
    </body>
</html>


