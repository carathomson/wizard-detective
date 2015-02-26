/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.PunchCodeControl;
import java.util.Scanner;

/**
 *
 * @author Lynn
 */
public class PunchCodeView {
    private final String CODE = "\n"
                +"\n-----------------------------------------------------------"
                +"\n| Door Code                                             |"
                +"\n-----------------------------------------------------------"
                +"\n - You reach the door to the room and find it locked."
                +"\n - There is a keypad on the doorhandle, with instructions:"
                +"\n - Password is four numbers who are greater than zero"
                +"\n - and add up to 29."
                +"\n-----------------------------------------------------------"
                ;
                
    public void displayPunchCode() {
        char selection = ' ';
        do {
           System.out.println(CODE); //display the main menu
           
           String input = this.getInput("Enter the first number: ");//get the user selection
           double value1 = Double.parseDouble(input);
           
           input = this.getInput("Enter the second number: ");//get the user selection
           double value2 = Double.parseDouble(input);
           
           input = this.getInput("Enter the third number: ");//get the user selection
           double value3 = Double.parseDouble(input);
           
           input = this.getInput("Enter the fourth number: ");//get the user selection
           double value4 = Double.parseDouble(input);
           
           //this.doAction(selection);//do action based on selection
           
           double answer = PunchCodeControl.calcPunchCodeHack(value1, value2, value3, value4);
           if (answer == 29){
               // print success message
               RoomMenuView roomMenu = new RoomMenuView();
                roomMenu.displayRoomMenu();
               return;
           }
           else {
               // print error message
               continue;
           }
           
        }while (selection != 'E');//a selection is not "Exit"
        }
    public String getInput(String promptMsg) {
        boolean valid = false; // indicates if the name has been retrieved
       String getInput = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { //while a valid iput has not been retrieved
           
           //prompt for the players name
           System.out.println(promptMsg);
           
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
    
}
