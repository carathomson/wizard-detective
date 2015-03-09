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
public class SearchAreaControlTest {

    public SearchAreaControlTest() {
    }

    /**
     * Test of calcSearchArea method, of class SearchAreaControl.
     */
    @Test
    //test 1
    public void testCalcSearchArea() {
        System.out.println("testCaseOne");
        double time = 6.0;
        double speed = 70.0;
        SearchAreaControl instance = new SearchAreaControl();
        double expResult = 7.0;
        double result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 2
        System.out.println("testCasetwo");
        time = 15.0;
        speed = 70.0;

        expResult = -1.0;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 3
        System.out.println("testCaseThree");
        time = -5.0;
        speed = 70.0;

        expResult = -1.0;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 4
        System.out.println("testCaseFour");
        time = 6.0;
        speed = 115.0;

        expResult = -2.0;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 5
        System.out.println("testCaseFive");
        time = 6.0;
        speed = 10.0;

        expResult = -2.0;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 6
        System.out.println("testCaseSix");
        time = 10.0;
        speed = 70.0;

        expResult = 11.6667; //problem here? maybe?
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 7
        System.out.println("testCaseSeven");
        time = 3.0;
        speed = 70.0;

        expResult = 3.5;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 8
        System.out.println("testCaseEight");
        time = 6.0;
        speed = 100.0;

        expResult = 10.0;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

        //test 9
        System.out.println("testCaseNine");
        time = 6.0;
        speed = 25.0;

        expResult = 2.5;
        result = instance.calcSearchArea(time, speed);
        assertEquals(expResult, result, 0.001);

    }

}
