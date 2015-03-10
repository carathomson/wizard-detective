/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.SearchAreaControl;

/**
 *
 * @author carathomson
 */
public class SearchAreaView extends View {

    public SearchAreaView() {
        super("\n\n-------------------------------------------------"
                + "\n The suspect has fled the hotel!"
                + "\n Through the front doors and into the parking"
                + "\n lot. Luckly you were able to use your powers"
                + "\n and you now know what car he is in and how"
                + "\n fast he can go in the traffic outside. All you"
                + "\n have to do now is set up a search area, block"
                + "\n roads and send the police off to find the man."
                + "\n-------------------------------------------------"
                + "\n\n When you used your sight, what did you"
                + "\n see as the car's top speed in the present traffic?");
    }

    @Override
    public void display() {
        boolean valid = false;
        do {
            System.out.println(getPromptMessage());

            String value = this.getInput();
            double speed = Double.parseDouble(value);

            System.out.println("\n\n From experienc you know how long the police"
                    + "\n will take to get organized and into place."
                    + "\n Please enter that time here:");
            value = this.getInput();
            double time = Double.parseDouble(value);

            double[] values = new double[2];
            values[0] = speed;
            values[1] = time;
            valid = this.doAction(values);

        } while (!valid);
    }

    @Override
    public boolean doAction(Object obj) {
        double[] inputValues = (double[]) obj;
        double distance = SearchAreaControl.calcSearchArea(inputValues[0], inputValues[1]);
        if (distance == -1) {
            System.out.println(
                    "\n\n----| speed has to be between 25 and 100 m/h |-----");
            return false;
        } else if (distance == -2) {
            System.out.println(
                    "\n\n----| time has to be between 3 and 10 minutes |----");
            return false;
        } else {
            System.out.println(
                    "\n\n========================================================"
                    + "\n You radio your men and they cover a " + distance + " mile"
                    + "\n radius around the hotel. After a few tense minutes the "
                    + "\n team on 3rd and 4th report they have the man detained."
                    + "\n========================================================");
        }
        return true;

    }

}
