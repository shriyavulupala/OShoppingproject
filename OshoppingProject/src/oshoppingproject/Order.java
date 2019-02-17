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
    String paymethod;
    float amount;
    Date date = parseDate("2019-02-17");
    public Order(String paymethod,float amount)
    {
        this.paymethod=paymethod;
        this.amount=amount;
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
      public void confirm()
    {
        System.out.println("Date is: "+date+"\npaydetails"+paymethod);
    }

     public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
     } 
     catch (ParseException e) {
         return null;
     }
     }
}