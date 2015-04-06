/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

/**
 *
 * @author carathomson
 */
public class NotebookView extends View {

    public NotebookView() {
        super("\n\n============================================================"
                + "\nN - See collected clues in notebook"
                + "\nE - Go back to the game menu");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        switch (choice) {
            case 'N': // Look at list of clues
                this.displayClues();
                break;
            case 'E': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayClues() {
        this.console.println("\n\n-------CLUES-------"
                + "\n  •Clue one"
                + "\n  •Clue two"
                + "\n  •Clue three"
                + "\nthe collected clues still need to be figured out");
    }
}
