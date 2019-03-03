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
     private String name;
    private String id;
    private String description;
    
   
    public Brand(String name, String id,String description)
    {
      this.name = name;
      this.id=id;
      this.description=description;
    }
    
  
 
public static String Brand(String name,  String ID, String description)
{
    return name+" "+ID+" "+description;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    public void display()
    {
    System.out.println("name: "+id+" "+description);
    }
    /**
     * @return the ID
     */
   
}
