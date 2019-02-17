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
public class OshoppingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Brand b = new Brand();
        b.setName("Coffee Maker");
        b.setid("10f0D");
        b.setDescription("Instant coffee maker");
       b.display();
    }
    
}
