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
public class GameMenuView {
    
        private final String MENU = "\n"
                +"\n-----------------------------------------------------------"
                +"\n| Game Menu                                               |"
                +"\n-----------------------------------------------------------"
                +"\nI - Inventory"
                +"\nN - Navigate"
                +"\nH - Help"
                +"\nE - Exit"
                +"\n-----------------------------------------------------------"
                ;

    void displayMenu() {
       char selection = ' ';
        do {
           System.out.println(MENU); //display the game menu
           
           String input = this.getGameMenuInput();//get the user selection
           selection = input.charAt(0);//get first character of a string
           
           this.doAction(selection);//do action based on selection
           
        }while (selection != 'E');//a selection is not "Exit"
        }
    
        public String getGameMenuInput() {
        boolean valid = false; // indicates if the input has been retrieved
       String getGameMenuInput = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { //while a valid input has not been retrieved
           
           //prompt for menu selection
           System.out.println("Enter the letter for the Menu Selection");
           
           //get the selection from the keyboard and trim off the blanks
           getGameMenuInput = keyboard.nextLine();
           getGameMenuInput = getGameMenuInput.trim();
           
           // if the selection is invalid
           if (getGameMenuInput.length() > 1 || getGameMenuInput.length() < 1){
               System.out.println("Invalid entry must match selection");
               continue; //repeat again
               }
           break; //out of the (exit) the repitition
       }
       
       return getGameMenuInput; // return the input
    }

         private void doAction(char choice) {
       
        switch (choice) {
            case 'I': // Look at inventory
                    this.seeInventory();
                    break;
            case 'N':// move Locations
                this.displayRoomMenuView();
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
        

    private void seeInventory() {
        System.out.println("*** seeInventory function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void displayRoomMenuView() {
        RoomMenuView roomMenu = new RoomMenuView();
        roomMenu.displayRoomMenu();
    }
    
}
