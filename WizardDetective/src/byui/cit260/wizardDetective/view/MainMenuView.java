/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.GameControl;
import byui.cit260.wizardDetective.exceptions.MainMenuViewExcetion;
import byui.cit260.wizardDetective.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            case 'P':
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
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return true;
    }

    private void startNewGame() {
        // create new game
        try {
            // create and start new game
            GameControl.createNewGame(WizardDetective.getPlayer());
            if (WizardDetective.getCurrentGame().getBackpack().getVolume() == 0){
                this.makeBackpack();
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
            }
        } catch (Exception e) {
            this.console.println(e.getMessage());
        }
        
        

    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is to be saved.");
        String filePath = this.getInput();
        try {
            //save game to the specified file
            GameControl.saveGame(WizardDetective.getCurrentGame(), filePath);

        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void loadGame() {
        this.console.println("\n\nEnter the file path for the file where the game"
                + "is saved.");
        String filePath = this.getInput();
        
        try{
            //start a saved game
            GameControl.getLoadGame(filePath);
            
        }catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    private void makeBackpack() {
        CreateBackpackView createBackpack = new CreateBackpackView();
        createBackpack.display();
    }
}
