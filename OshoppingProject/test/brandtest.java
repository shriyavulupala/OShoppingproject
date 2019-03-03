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
import oshoppingproject.Order;

/**
 *
 * @author 15148
 */
public class brandtest {
    
    public brandtest() {
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
         String name="sfdadsf";
         String description="Cotton";
         
         String Id="1893716";
        String date="dt";
         String expected =name+" "+Id+" "+date+" "+description;
         String real=oshoppingproject.Brand.brandtest(name,Id,date,description);
         assertEquals(expected,real);
    // public void hello() {}
}
    // public void hello() {}
}
