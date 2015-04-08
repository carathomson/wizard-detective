/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.model.Clue;
import java.util.ArrayList;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class NotebookView extends View {

    public NotebookView() {
        super("\n\n----------------------------------------------"
                + "\n|   Notebook Menu                            |"
                + "\n----------------------------------------------"
                + "\nN - open notebook and look at clues"
                + "\nE - go back to game menu"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char choice = value.charAt(0);

        switch (choice) {
            case 'N': // see clue
                this.displayClues();
                return true;
            case 'E': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayClues() {
        this.console.println("\nCLUES COLLECTED:");
        ArrayList <Clue> clues = WizardDetective.getCurrentGame().getNotebook().getClues();
        for (Clue clue : clues) {
            this.console.println(clue.getDescription());
        }
        
        
    }
}
