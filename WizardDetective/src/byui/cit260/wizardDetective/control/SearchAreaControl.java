/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.SearchAreaControlException;

/**
 *
 * @author carathomson
 */
public class SearchAreaControl {

    public static double calcSearchArea(double speed, double time)
            throws SearchAreaControlException {

        if (speed < 25 || speed > 100) {
            throw new SearchAreaControlException(
                    "\n\n----| speed has to be between 25 and 100 m/h |-----");
        }

        if (time < 3 || time > 10) {
            throw new SearchAreaControlException(
                    "\n\n----| time has to be between 3 and 10 minutes |----");
        }

        double distance = (speed * time / 60);

        return distance;

    }

}
