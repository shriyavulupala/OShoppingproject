/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

/**
 *
 * @author 1893716
 */
public class Brand {
    String name;
    String id;
    String description;
    /*
    public Brand(String name, String id,String description)
    {
      this.name = name;
      this.id=id;
      this.description=description;
    }*/
    
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
    
    public void display()
    {
    System.out.println("Product Name: "+name+"\nProduct ID: "+id+"\nProduct Description: "+description);
    }
}
