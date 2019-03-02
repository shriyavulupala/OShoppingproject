/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

/**
 *
 * @author 1894475
 */
public class Person  
{
    String Lname, Fname,address;
    int phone;
    
    public Person(String Lname, String Fname, String address)
    {
        this.Lname=Lname;
        this.Fname=Fname;
        this.address=address;
        
    }

    public void setFname(String Fname)
    {
        
        this.Fname = Fname;
        
    }
    
    
    public void setLname(String Fname)
    {
        
        this.Lname = Lname;
        
    }
    
    
    public void setAddress(String address)
    {
        
        this.address = address;
        
    }
    
    public String getAddress()
    {
        return address;
     }
    
    
    public String getFname()
    {
        return Fname;
     }
    
    
    public String getLname()
    {
        return Lname;
     }
    
    public void setPhone(int P)
    {
        this.phone = P;
    }
    
    public int getPhone()
    {
        return phone;
    }
    
}
