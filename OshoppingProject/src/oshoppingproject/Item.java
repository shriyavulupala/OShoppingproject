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
public class Item 
{
    int id, size, quantity;
    String name, color;
    float price;
    
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    
    public void setColor(String c)
    {
        this.color=c;
    }
    public String getColor()
    {
        return color;
    }
    
    public void setId(int ID)
    {
        this.id=ID;
    }
    public int getID()
    {
     return id;   
    }
    
    public void setSize(int s)
    {
        this.size=s;
    }
    public int getSize()
    {
     return size;   
    }
    
    public void setQuantity(int q)
    {
        this.quantity=q;
    }
    public int getQuantity()
    {
     return quantity;   
    }
    
    public void setPrice(float p)
    {
        this.price=p;
    }
    public float getPrice()
    {
     return price;   
    }
     public void display()
    {
    System.out.println("Item ID: "+id+"\n Item size: "+size +"\n Item Quantity: "+quantity + "\n Item Name: " +name + "\n color:" +color+ "\n Price:" +price);
    }
    
}
