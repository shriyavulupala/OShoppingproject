/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

/**
 *
 * @author 1895730
 */
public class Customer extends Person {
    
   
  private  int custid;
    private String paymethod;
    
   
    public Customer(int custid,String paymethod)
    {
        super("pavani", "movva", "address");
        this.custid=custid;
        this.paymethod=paymethod;
    }
    public void setcustid(int custid)
    {
        this.custid=custid;
    }
    public void setpaymethod(String paymethod)
    {
        this.paymethod=paymethod;
    }
    public int getcustid()
    {
        return custid;
       
    }
    public String getpaymethod()
    {
        return paymethod;
    }
}
