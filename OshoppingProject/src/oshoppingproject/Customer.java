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
    
   
    int custid;
     String paymethod;
    private String ID;
    
   
    public Customer(int custid,String paymethod,String ID)
    {
        super("pavani", "movva", "address","ID");
        this.custid=custid;
        this.paymethod=paymethod;
        this.ID=ID;
        
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
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
      public void display()
    {
    System.out.println("Customer ID: "+custid+"\n Payment: "+paymethod);
    }

    /**
     * @return the ID
     */
    
}
