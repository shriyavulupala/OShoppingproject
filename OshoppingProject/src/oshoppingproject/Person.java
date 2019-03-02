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
    private String ID;
    
    public Person(String Lname, String Fname, String address, String ID)
    {
        this.Lname=Lname;
        this.Fname=Fname;
        this.address=address;
        this.ID=ID;
        
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
     public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    

 public void display()
    {
    System.out.println("LastName: " +Lname + "\n FirstName: " +Fname + "\n Address: " +address);
    }
public static String Persontest(String Lname,String Fname, String address, String ID)
{
    return Lname+" "+Fname+" "+address+" "+ID;
}
    /**
     * @return the ID
     */
   
}