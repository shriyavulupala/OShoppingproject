package oshoppingproject;

import java.util.Date;

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
    String newid;
    public detail(String id,String Quantity,Date dt){
        
             String d=dt.toString();
      String dtl=generateid(d,"id","Quantity");
      display(dtl);
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
    public void setquantity(String quantity )
    {
        this.setQuantity(quantity);
    }
    public String getquantity(){
        return getQuantity();
        
    }
             
    public void display(String dtl){
                System.out.println(dtl);

        System.out.println("quantity detail: "+ getQuantity());
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
  
}
