/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

/**
 *
 * @author carathomson
 */
public class BackpackConstructionControl {

    public static double calcBackpackSize(double height, double width, double depth) {

        if (height > 25 || height < 1) {
            return -1;
        }

        if (width > 20 || width < 1) {
            return -2;
        }

        if (depth > 12 || depth < 1) {
            return -3;
        }

        double volume = (height * width * depth);

        return volume;

    }
}
