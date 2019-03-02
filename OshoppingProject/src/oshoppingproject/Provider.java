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
    
    public Provider(int c, String cname)
    {
         super("pavani", "movva", "address");
        this.companyname = cname;
        this.companynumber = c;
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
    
}