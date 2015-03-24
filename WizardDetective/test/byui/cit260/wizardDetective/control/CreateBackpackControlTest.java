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
public class CreateBackpackControlTest {

    public CreateBackpackControlTest() {
    }

    /**
     * Test of calcBackpackSize method, of class CreateBackpackControl.
     */
    @Test

    //test 1
    public void testCalcBackpackSize() {
        System.out.println("testCaseOne");
        double height = 24.0;
        double width = 18.0;
        double depth = 6.0;
        CreateBackpackControl instance = new CreateBackpackControl();
        double expResult = 2592.0;

        double result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test2
        System.out.println("testCaseTwo");
        height = -7.0;
        width = 18.0;
        depth = 6.0;
        expResult = -1.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 3
        System.out.println("testCaseThree");
        height = 24.0;
        width = 21.0;
        depth = 6.0;
        expResult = -2.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 4
        System.out.println("testCaseFour");
        height = 24.0;
        width = 18.0;
        depth = 13.0;
        expResult = -3.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 5
        System.out.println("testCaseFive");
        height = 25.0;
        width = 18.0;
        depth = 6.0;
        expResult = 2700.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 6
        System.out.println("testCaseSix");
        height = 1.0;
        width = 18.0;
        depth = 6.0;
        expResult = 108.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 7
        System.out.println("testCaseSeven");
        height = 24.0;
        width = 1.0;
        depth = 6.0;
        expResult = 144.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 8
        System.out.println("testCaseEight");
        height = 24.0;
        width = 18.0;
        depth = 1.0;
        expResult = 432.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 9
        System.out.println("testCaseNine");
        height = 20.0;
        width = 20.0;
        depth = 8.0;
        expResult = 3200.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 10
        System.out.println("testCaseTen");
        height = 22.0;
        width = 16.0;
        depth = 12.0;
        expResult = 4224.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 11
        System.out.println("testCaseEleven");
        height = 25.0;
        width = 20.0;
        depth = 12.0;
        expResult = 6000.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 12
        System.out.println("testCaseTwelve");
        height = 26.0;
        width = 20.0;
        depth = 12.0;
        expResult = -1.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 13
        System.out.println("testCaseThirteen");
        height = 25.0;
        width = 0.0;
        depth = 12.0;
        expResult = -2.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);

        //test 14
        System.out.println("testCaseFourteen");
        height = 25.0;
        width = 20.0;
        depth = -4.0;
        expResult = -3.0;

        result = instance.calcBackpackSize(height, width, depth);
        assertEquals(expResult, result, 0.001);
    }
}
