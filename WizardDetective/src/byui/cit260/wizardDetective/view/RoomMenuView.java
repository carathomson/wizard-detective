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
public class RoomMenuView {
    
    private final String ROOM = "\n"
                +"\n-----------------------------------------------------------"
                +"\n| Room                                             |"
                +"\n-----------------------------------------------------------"
                +"\nA - How to Move"
                +"\nB - Controls"
                +"\nC - How to Investigate or Interrogate"
                +"\nE - Exit"
                +"\n-----------------------------------------------------------"
                ;
                
    public void displayHelpMenu() {
        char selection = ' ';
        do {
           System.out.println(ROOM); //display the main menu
           
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
           System.out.println("Enter the letter for the Help Selection");
           
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
            case 'A': // Loads investigate options
                    this.investigate();
                    break;
            case 'B':// loads interrogate options
                this.interrogate();
                break;
            case 'C':// loads the Sight options
                this.useSight();
                break;
            case 'E': // exit to previous screen
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    private void investigate() {
        System.out.println("You investigate the room");
    }

    private void interrogate() {
        System.out.println("You approach the suspect, questions in mind.");
    }

    private void useSight() {
        System.out.println("You close your eyes, focusing on your Sight.");
    }
}
