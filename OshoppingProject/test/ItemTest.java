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
 * @author 1895198
 */
public class ItemTest {
    
    public ItemTest() {
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
    public void Itemtest() 
    {
        int id=23;
        int size=40;
        int quantity=4;
        String name="Kurtha";
        String color= "Pink";
        float price= 800f;
        String expected = id+" "+size+ " "+ quantity+" "+name +" "+ color+" "+ price+" ";
        String real=oshoppingproject.Item.Item(id,size,quantity,name,color,price);
        assertEquals(expected,real);
        
        
    }
}
