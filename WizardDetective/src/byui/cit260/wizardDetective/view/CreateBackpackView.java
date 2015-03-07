/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.BackpackConstructionControl;
import java.util.Scanner;

/**
 *
 * @author carathomson
 */
public class CreateBackpackView extends View {

    public CreateBackpackView() {
        super("");
    }

   

    @Override
    public void display() {
        boolean valid = false;
        do {
            System.out.println("\n\n*************************************************"
                    + "\nNo detective is compleat without a strong bag."
                    + "\nYou need to create a backpack big enough"
                    + "\nto carry your gear and any clues you"
                    + "\ncome accross as you investigate."
                    + "\n\nHere are the rules:"
                    + "\nHeight <= 25 inches"
                    + "\nWidth  <= 20 inches"
                    + "\nDepth  <= 12 inches"
                    + "\n*************************************************");

            System.out.println("\nHow high should your backpack be?");
            String value = this.getInput();
            double height = Double.parseDouble(value);

            System.out.println("\nHow wide?");
            value = this.getInput();
            double width = Double.parseDouble(value);

            System.out.println("\nHow deep?");
            value = this.getInput();
            double depth = Double.parseDouble(value);
            
            double[] values = new double[3];
            values[0] = height;
            values[1] = width;
            values[2] = depth;
            valid = this.doAction(values);//do action based on selection

        } while (!valid); //a selection is not "Exit"
    }

   

    @Override
    public boolean doAction(Object obj){
        double[] inputValues = (double[]) obj;
        double volume = BackpackConstructionControl.calcBackpackSize(inputValues[0], inputValues[1], inputValues[2]);
        if (volume == -1) {
            System.out.println(
                    "\n\n-----------------| Invalid height |-----------------");
            return false;
        } else if (volume == -2) {
            System.out.println(
                    "\n\n-----------------| Invalid width |-----------------");
            return false;
        } else if (volume == -3) {
            System.out.println(
                    "\n\n-----------------| Invalid depth |-----------------");
            return false;
        } else {
            System.out.println(
                    "\n\n========================================================"
                    + "\nCongradulations! Your backpack can hold " + volume + " cubic inches."
                    + "\nNow you are ready to start your investigation."
                    + "\n========================================================");
        }
        return true;
    }

    

}
