/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.model.Backpack;
import byui.cit260.wizardDetective.model.Tool;
import java.util.ArrayList;
import byui.cit260.wizardDetective.exceptions.CreateBackpackControlException;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class CreateBackpackControl {

    public static double calcBackpackSize(double height, double width, double depth)
            throws CreateBackpackControlException {

        if (height > 25 || height < 1) {
            throw new CreateBackpackControlException(
                    "\n\n-----------------| Invalid height |-----------------", -1);
        }

        if (width > 20 || width < 1) {
            throw new CreateBackpackControlException(
                    "\n\n-----------------| Invalid width |------------------", -2);
        }

        if (depth > 12 || depth < 1) {
            throw new CreateBackpackControlException(
                    "\n\n-----------------| Invalid depth |------------------", -3);
        }

        double volume = (height * width * depth);
        WizardDetective.getCurrentGame().getBackpack().setVolume(volume);
        return volume;

    }

    public static Backpack createBackpack() {
        Backpack backpack = new Backpack();

        ArrayList<Tool> tools = backpack.getTools();
        tools.add(Tool.Radio);
        tools.add(Tool.Gun);
        tools.add(Tool.Cuffs);
        return backpack;
    }
}
