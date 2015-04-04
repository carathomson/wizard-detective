/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import java.util.Scanner;

/**
 *
 * @author Lynn
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Help                                               |"
                + "\n-----------------------------------------------------------"
                + "\nM - How to Move"
                + "\nC - Controls"
                + "\nI - How to Investigate or Interrogate"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.toUpperCase().charAt(0);

        switch (choice) {
            case 'M': // loads the move instructions
                this.helpMove();
                break;
            case 'C':// loads the control map
                this.helpControls();
                break;
            case 'I':// loads the investigate and interrogate instructions
                this.helpInterrogate();
                break;
            case 'E': // exit to the Main Menu
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void helpMove() {
        this.console.println("To move select the navigate function and enter in the coordinates"
                + "/n that you would like to travel to. Each number must have a apace between them"
                + "/n for example: 1 1 is correct not 11 or 1-1.");
    }

    private void helpControls() {
        this.console.println("To choose an option just type in the corresponding letter  to the"
                + "/n menu option. The letter must be capitalized.");
    }

    private void helpInterrogate() {
        this.console.println("This happens automatically so don't worry too much about it. ");
    }

}
