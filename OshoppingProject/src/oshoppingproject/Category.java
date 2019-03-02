/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;

/**
 *
 * @author 1895198
 */
public class Category
{
    String name,description;
    private String ID;
    int id;
    
    public Category(int id, String name, String description ,String ID)
    {
        this.id=id;
        this.name=name;
        this.description=description;
        this.ID=ID;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    
    public void setDescription(String d)
    {
        this.description=d;
    }
    public String getDescription()
    {
        return description;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getid()
    {
     return id;   
    }
     public void display()
    {
    System.out.println("Name: "+name+"\n ID: "+id+"\n Description: "+description);
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID()
    {
     return ID;   
    }
    
    
}
