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
 * @author 1894475
 */
public class Persontest {
    
    public Persontest() {
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
     public void PersonTest() 
     {
         String Lname="movva";
         String Fname="pavani";
         String address="cote sainte catherine";
         String ID="C";
         String expected=Lname+" "+Fname+" "+address+" "+ID;
         String real=oshoppingproject.Person.Persontest(Lname, Fname, address, ID);
         assertEquals(expected,real);
    
}
}
