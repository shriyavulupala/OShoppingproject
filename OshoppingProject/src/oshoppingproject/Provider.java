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
public class Provider extends Person
{
    int companynumber;
    String companyname;
    private String ID;
    
    public Provider(int c, String cname,String ID)
    {
         super("pavani", "movva", "address","ID");
        this.companyname = cname;
        this.companynumber = c;
        this.ID=ID;
    }
    
    public void setCompanynumber(int cnumber)
    {
        this.companynumber = cnumber; 
    }
    
    public int getCompanynumber()
    {
        return companynumber;
    }
    
     public void setCompanyname(String cname)
    {
        this.companyname = cname; 
    }
    
    public String getCompanyname()
    {
        return companyname;
    }


    public String getID() {
        return ID;
    }

   
    public void setID(String ID) {
        this.ID = ID;
    }
    public void display()
    {
        System.out.println("company number: \n" +companynumber + "company name: \n" +companyname + "ID is:" +ID);
    }
}