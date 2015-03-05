/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.GameControl;
import java.util.Scanner;
import wizarddetective.WizardDetective;

/**
 *
 * @author Lynn
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Main Menu                                               |"
                + "\n-----------------------------------------------------------"
                + "\nP - Play"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nH - Help"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        switch (choice) {
            case 'P': // create and start new game
                this.startNewGame();
                break;
            case 'S':// Saves Game
                this.saveGame();
                break;
            case 'L':// Loads previously saved game
                this.loadGame();
                break;
            case 'H': //pulls up help screen
                this.displayHelpMenu();
                break;
            case 'E': // exit the program
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return true;
    }

    private void startNewGame() {
        // create new game
        GameControl.createNewGame(WizardDetective.getPlayer());

        //display the game menucar
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("*** startSaveGame function called ***");
    }

    private void loadGame() {
        System.out.println("*** loadGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }
}
