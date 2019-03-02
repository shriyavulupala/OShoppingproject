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
    String name, color,ID;
    float price;
    public Item(int id, int size, int quantity, String name, String color ,String ID , float price)
    {
        this.id=id;
        this.size=size;
        this.quantity=quantity;
        this.name=name;
        this.color=color;
        this.ID=ID;
        this.price=price;
    }
    
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
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getid()
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
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID()
    {
     return ID;   
    }
}
