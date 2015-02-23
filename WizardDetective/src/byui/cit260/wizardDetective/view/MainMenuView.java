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
public class MainMenuView {

        private final String MENU = "\n"
                +"\n-----------------------------------------------------------"
                +"\n| Main Menu                                               |"
                +"\n-----------------------------------------------------------"
                +"\nP - Play"
                +"\nS - Save Game"
                +"\nL - Load Game"
                +"\nH - Help"
                +"\nE - Exit"
                +"\n-----------------------------------------------------------"
                ;
                
    public void displayMenu() {
        char selection = ' ';
        do {
           System.out.println(MENU); //display the main menu
           
           String input = this.getInput();//get the user selection
           selection = input.charAt(0);//get first character of a string
           
           this.doAction(selection);//do action based on selection
           
        }while (selection != 'E');//a selection is not "Exit"
        }

    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { //while a valid iput has not been retrieved
           
           //prompt for the players name
           System.out.println("Enter the letter for the Menu Selection");
           
           //get the name from the keyboard and trim off the blanks
           getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           // if the name is invalid (less than two characters in length))
           if (getInput.length() > 1 || getInput.length() < 1){
               System.out.println("Invalid entry must have selection");
               continue; //repeat again
               }
           break; //out of the (exit) the repitition
       }
       
       return getInput; // return the input
    }

    private void doAction(char choice) {
       
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
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
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
    

