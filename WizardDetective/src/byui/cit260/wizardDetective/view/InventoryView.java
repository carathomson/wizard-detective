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
public class InventoryView extends View {

    public InventoryView() {
        super("\n\n================================"
                + "\nWhat do you want to look at?"
                + "\n--------------------------------"
                + "\n\nN - clues in your notebook"
                + "\nB - tools in your backpack"
                + "\nE - go back to the game menu"
                + "\n\n================================");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        switch (choice) {
            case 'N': // Look at list of clues
                this.displayClues();
                break;
            case 'B': // Look at list of clues
                this.displayTools();
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
        this.console.println("the collected clues still need to be figured out");
    }

    private void displayTools() {
        this.console.println("the collected tools still need to be figured out");
    }
}
