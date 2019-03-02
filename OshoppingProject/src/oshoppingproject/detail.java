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
    String quantity;
    public void setquantity(String quantity )
    {
        this.quantity=quantity;
    }
    public String getquantity(){
        return quantity;
        
    }
             
    public void display(){
        System.out.println("quantity detail: "+ quantity);
    }
}
