/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oshoppingproject;

import java.util.Date;


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

public static String brandtest(String name,String date, String description , String ID)
{
    return name+" "+date+" "+description+" "+ID;
}
    /**
     * @return the ID
     */
    
}
