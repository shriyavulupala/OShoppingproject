/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1893716
 */
public class detailtesting {
    
    public detailtesting() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void brandtest(){
        
         String quantity="23";
         
         
         String Id="1893716";
        String Date="dt";
         String expected=Date+" "+Id+" "+quantity;
         String real=oshoppingproject.detail.detailtest(Date, Id, quantity);
         assertEquals(expected,real); // public void hello() {}
}
}
