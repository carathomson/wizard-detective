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
       
       /**
         * Test Case 6
         */
        System.out.println("/tTest Case #6");
        //input values
         input1 = 10.0;
         input2 = 10.0;
         input3 = 9.0;
         input4 = 8.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
        /**
         * Test Case 7
         */
        System.out.println("/tTest Case #7");
        //input values
         input1 = 10.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 8
         */
        System.out.println("/tTest Case #8");
        //input values
         input1 = 10.0;
         input2 = 8.0;
         input3 = 4.0;
         input4 = 10.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 9
         */
        System.out.println("/tTest Case #9");
        //input values
         input1 = 8.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 10
         */
        System.out.println("/tTest Case #10");
        //input values
         input1 = 3.0;
         input2 = 8.0;
         input3 = 8.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 11
         */
        System.out.println("/tTest Case #11");
        //input values
         input1 = 5.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 8.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 12
         */
        System.out.println("/tTest Case #12");
        //input values
         input1 = 10.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 13
         */
        System.out.println("/tTest Case #13");
        //input values
         input1 = 8.0;
         input2 = 10.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 14
         */
        System.out.println("/tTest Case #14");
        //input values
         input1 = 4.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 10.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
       /**
         * Test Case 15
         */
        System.out.println("/tTest Case #15");
        //input values
         input1 = 4.0;
         input2 = 8.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
        /**
         * Test Case 16
         */
        System.out.println("/tTest Case #16");
        //input values
         input1 = 5.0;
         input2 = 4.0;
         input3 = 10.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
       
        /**
         * Test Case 17
         */
        System.out.println("/tTest Case #17");
        //input values
         input1 = 5.0;
         input2 = 8.0;
         input3 = 4.0;
         input4 = 4.0;
        
                
       expResult = -2;//expected result
        
       result = instance.calcPunchCodeHack(input1, input2, input3, input4);
        
       assertEquals(expResult, result, 0.0001);
    }
    
}
