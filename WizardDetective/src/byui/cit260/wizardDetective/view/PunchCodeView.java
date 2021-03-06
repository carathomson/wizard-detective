/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.PunchCodeControl;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lynn
 */
public class PunchCodeView extends View {

    public PunchCodeView() {

        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Door Code                                             |"
                + "\n-----------------------------------------------------------"
                + "\n - You reach the door to the room and find it locked."
                + "\n - There is a keypad on the doorhandle, with instructions:"
                + "\n - Password is four numbers who are greater than zero"
                + "\n - that don't repeat, and add up to 29."
                + "\n-----------------------------------------------------------");
    }

    /**
     * display code is different than abstract class
     */
    @Override
    public void display() {
        char selection = ' ';
        do {
            this.console.println(this.getPromptMessage()); //display the main menu

            this.console.println("Enter the first number: ");
            String value = this.getInput();//get the user selection
           double value1 = 0;
            try {
             value1 = Double.parseDouble(value);
            
           } catch (NumberFormatException nf){
               this.console.println("\nYou must enter a valid number."
                                    +"Try again or enter E to quit.");
               
            }
               
           
        
            this.console.println("Enter the second number: ");
            value = this.getInput();//get the user selection
           double value2 = 0;
            try {
                if (value.equals("E")){
               return;
            }
             value2 = Double.parseDouble(value);
               } catch (NumberFormatException nf){
               this.console.println("\nYou must enter a valid number."
                                    +"Try again or enter E to quit.");
           }
            this.console.println("Enter the third number: ");
            value = this.getInput();//get the user selection
            double value3 = 0;
            try {
                if (value.equals("E")){
               return;
            }
            value3 = Double.parseDouble(value);
            } catch (NumberFormatException nf){
               this.console.println("\nYou must enter a valid number."
                                    +"Try again or enter E to quit.");
           }
            this.console.println("Enter the fourth number: ");
            value = this.getInput();//get the user selection
            double value4 = 0;
            try {
                if (value.equals("E")){
               return;
            }
            value4 = Double.parseDouble(value);
            } catch (NumberFormatException nf){
               this.console.println("\nYou must enter a valid number."
                                    +"Try again or enter E to quit.");
           }
            //this.doAction(selection);//do action based on selection
            double answer = PunchCodeControl.calcPunchCodeHack(value1, value2, value3, value4);
            if (answer == 29) {
                this.console.println("Success!!!");// print success message
                RoomMenuView roomMenu = new RoomMenuView();
                roomMenu.display();
                return;
            } else {
                this.console.println("Password was incorrect, try again.");// print error message
                continue;
            }

        } while (selection != 'E');//a selection is not "Exit"
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String getInput = null;
        

        while (!valid) { try {
            //while a valid iput has not been retrieved
            
            //get the name from the keyboard and trim off the blanks
            getInput = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(PunchCodeView.class.getName()).log(Level.SEVERE, null, ex);
            }
            getInput = getInput.trim();

            // if the name is invalid (less than two characters in length))
            if (getInput.length() > 2 || getInput.length() < 1) {
                this.console.println("Invalid entry must have selection");
                continue; //repeat again
            }
            break; //out of the (exit) the repitition
        }

        return getInput; // return the input
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
