package oshoppingproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1893716
 */
public class detail {
    private String quantity;
     private String ID;
     public detail(String quantity,String ID)
     {
         this.quantity=quantity;
         this.ID=ID;
     }
    
             
    
    /**
     * @return the quantity
     */
  

public static String detailtest(String Date,String id, String quantity)
{
    return Date+" "+id+" "+quantity;
}

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void display(){
        System.out.println("quantity detail: "+ getQuantity());
    }

}
