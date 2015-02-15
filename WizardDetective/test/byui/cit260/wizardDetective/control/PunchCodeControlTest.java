/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mechams
 */
public class PunchCodeControlTest {
    
    public PunchCodeControlTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcPunchCodeHack method, of class PunchCodeControl.
     */
    @Test
    public void testCalcPunchCodeHack() {
        System.out.println("calcPunchCodeHack");
        /**
         * Test Case 1
         */
        System.out.println("/tTest Case #1");
        //input values
        double input1 = 9.0;
        double input2 = 8.0;
        double input3 = 7.0;
        double input4 = 5.0;
        
        PunchCodeControl instance = new PunchCodeControl();
        
        double expResult = 29.0;//expected result
        
        double result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
        
         /**
         * Test Case 2
         */
        System.out.println("/tTest Case #2");
        //input values
         input1 = -1.0;
         input2 = 8.0;
         input3 = 9.0;
         input4 = 5.0;
        
        
        
       expResult = -1;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    
     /**
         * Test Case 3
         */
        System.out.println("/tTest Case #3");
        //input values
         input1 = 9.0;
         input2 = -1.0;
         input3 = 9.0;
         input4 = 5.0;
        
        
        
       expResult = -1;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
    
     /**
         * Test Case 4
         */
        System.out.println("/tTest Case #4");
        //input values
         input1 = 1.0;
         input2 = 8.0;
         input3 = -45.0;
         input4 = 5.0;
        
        
        
       expResult = -1;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
    
        /**
         * Test Case 5
         */
        System.out.println("/tTest Case #5");
        //input values
         input1 = 10.0;
         input2 = 8.0;
         input3 = 9.0;
         input4 = -8.0;
        
                
       expResult = -1;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
    }
    
}
