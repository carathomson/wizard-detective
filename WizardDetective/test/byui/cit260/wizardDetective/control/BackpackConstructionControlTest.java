/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carathomson
 */
public class BackpackConstructionControlTest {
    
    public BackpackConstructionControlTest() {
    }

    /**
     * Test of calcBackpackSize method, of class BackpackConstructionControl.
     */
    @Test
    public void testCalcBackpackSize() {
        System.out.println("calcBackpackSize");
        double height = 0.0;
        double width = 0.0;
        double depth = 0.0;
        BackpackConstructionControl instance = new BackpackConstructionControl();
        double expResult = 0.0;
        double result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
