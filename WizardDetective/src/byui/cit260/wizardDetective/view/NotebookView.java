/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class NotebookView extends View {

    public NotebookView() {
        super();
    }

    @Override
    public boolean doAction(Object obj) {

        this.console.println(WizardDetective.getCurrentGame().getNotebook().getClues());
        this.console.println("------------------------------------"
                + "\nEnter E to exit back to game menu.");
        
        
        
        String value = (String) obj;
        char choice = value.charAt(0);

        switch (choice) {
            case 'E': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayClues() {
    }
}
