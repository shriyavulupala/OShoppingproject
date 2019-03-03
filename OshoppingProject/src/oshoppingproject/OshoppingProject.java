/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshoppingproject;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 1895198
 */
public class OshoppingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("pavani", "movva", "cotesaintecatherine","P");
      Brand b = new Brand("Biba", "B","Cotton");
        
        Item i= new Item(23,40,4,"Kurta","Pink",800f);
            Category cu= new Category(23, "clothing", "newfashion");
           Order o= new Order(800f,"Credit card","O");
         Date dt=new Date();
        String d=dt.toString();
        String id=generateid(d,cu.paymethod, cu.getID());
       
               
       
        
        System.out.println(id);
       p.display();
       i.display();
      b.display();
       cu.display();
      o.display();
    }
 

  
  
    static String id;
    public static String generateid(String d,String fname,String lname)
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
        id=year+"-"+month+"-"+today+"-"+fn+ln;
        return id;
    } 

 
       

    

}

