/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

import java.util.Date;

/**
 *
 * @author 1893716
 */
public class Brand {
     String name;
    String id;
    String newid;
    Date dt=new Date();

    String description;
    
    
    public Brand(String name, String id,String description,Date dt)
    {
      this.name = name;
      this.dt=dt;
      this.id=id;
      this.description=description;
       String d=dt.toString();
      String br=generateid(d,id,name);
      display(br);
    }

   
        public String generateid(String d,String fname,String lname)
    { 
        char today;
        String[] datesplit=d.split(" ");
        
        String year=datesplit[5].substring(2,4);
       
        String month=datesplit[1].toUpperCase();
        
        String date=datesplit[2];
        int currentdate=Integer.parseInt(date);
       
            if(currentdate%2==0)
            {
                 today='E';
            }
            else
            {
                 today='O';
            }
           
    
        char fn=fname.charAt(0);
   
        char ln=lname.charAt(0);
        newid=year+"-"+month+"-"+today+"-"+fn+ln;
        return newid;
    } 
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setid(String id)
    {
        this.id=id;
    }
    
    public String getid()
    {
        return id;
    }
    
      public void setDescription(String d)
    {
        this.description=d;
    }
    public String getDescription()
    {
        return description;
    }
    
    public void display(String br)
    {
        System.out.println(br);
                
    System.out.println("Brand Name: "+getName()+"\n BrandID: "+id+"\n Description: "+description);
    
    }
public static String brandtest(String name,String date, String description , String ID)
{
    return name+" "+date+" "+description+" "+ID;
}
    /**
     * @return the ID
     */
    
}
