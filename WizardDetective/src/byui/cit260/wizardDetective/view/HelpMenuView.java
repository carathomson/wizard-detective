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
        this.console.println("*** Help move page selected ***");
    }

    private void helpControls() {
        this.console.println("*** Help Control map page selected ***");
    }

    private void helpInterrogate() {
        this.console.println("*** Help interrogate and investigate page selected ***");
    }

}
