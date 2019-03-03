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
 * @author 1895730
 */
public class OrderTest {
    
    public OrderTest() {
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
     public void Ordertest(){
                 float amount=800;
         String Id="1895730";
         String paymethod="credit card";
         String expected =amount+" "+paymethod+" "+Id;
         String real=oshoppingproject.Order.Ordertest(amount, paymethod, Id);
         assertEquals(expected,real);
    // public void hello() {}
}
}
