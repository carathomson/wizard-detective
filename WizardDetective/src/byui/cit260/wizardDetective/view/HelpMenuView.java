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
public class HelpMenuView {
    
    private final String HELP = "\n"
                +"\n-----------------------------------------------------------"
                +"\n| Help                                               |"
                +"\n-----------------------------------------------------------"
                +"\nM - How to Move"
                +"\nC - Controls"
                +"\nI - How to Investigate or Interrogate"
                +"\nE - Exit"
                +"\n-----------------------------------------------------------"
                ;
                
    public void displayHelpMenu() {
        char selection = ' ';
        do {
           System.out.println(HELP); //display the main menu
           
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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }

    private void helpMove() {
        System.out.println("*** Help move page selected ***");
    }

    private void helpControls() {
        System.out.println("*** Help Control map page selected ***");
    }

    private void helpInterrogate() {
        System.out.println("*** Help interrogate and investigate page selected ***");
    }
}
