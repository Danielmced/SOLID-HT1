/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.open_closed_solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielmced
 */
class AntagonistTest {
    
    public AntagonistTest() {
        //Esta vacio porque no se ha implemetado un constructor
    }
    
    @BeforeAll
    public static void setUpClass() {
        //Esta vacio porque no se ha implemetado un constructor
    }
    
    @AfterAll
    public static void tearDownClass() {
        //Esta vacio porque no se ha implemetado un constructor
    }
    
    @BeforeEach
    public void setUp() {
        //Esta vacio porque no se ha implemetado un constructor
    }
    
    @AfterEach
    public void tearDown() {
        //Esta vacio porque no se ha implemetado un constructor
    }

    /**
     * Test of eventAction method, of class Antagonist.
     */
    @Test
    public void testEventAction() {
        System.out.println("eventAction");
        String characterType = "";
        Antagonist instance = new Antagonist();
        String expResult = "";
        String result = instance.eventAction(characterType);
        assertEquals(expResult, result);
        
    }
    
}
