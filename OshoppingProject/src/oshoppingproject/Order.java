/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895730
 */
public class Order {
        float amount;
    String paymethod;
    private String ID;
    Date date = parseDate("2019-02-17");
    public Order(float amount,String paymethod, String ID)
    {
       
  this.amount=amount;
  this.paymethod=paymethod;
  this.ID=ID;
    
    }
    public void setDate(Date d)
    {
        this.date=d;
    }
    public Date getDate()
    {
        return date;
    }
    public void setpaymethod(String p)
    {
        this.paymethod=p;
    }
    public String getpaymethod()
    {
        return paymethod;
    }
    public void setamount(float a)
    {
        this.amount=a;
    }
    public float getamount()
    {
        return amount;
    }
      public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
      
     public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
     } 
     catch (ParseException e) {
         return null;
     }
     }
     public void display()
    {
    System.out.println("Payment: " +paymethod +"\n Amount: "+amount);
    }
public static String Ordertest(float amount,String paymethod,String ID)
{
    return amount+" "+paymethod+" "+ID;
}
    /**
     * @return the ID
     */
  
}