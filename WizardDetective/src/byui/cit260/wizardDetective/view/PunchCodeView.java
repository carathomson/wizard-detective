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
public class PunchCodeView extends View{

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
            System.out.println(this.getPromptMessage()); //display the main menu

            System.out.println("Enter the first number: ");
            String input = this.getInput();//get the user selection
            double value1 = Double.parseDouble(input);
            
            System.out.println("Enter the second number: ");
            input = this.getInput();//get the user selection
            double value2 = Double.parseDouble(input);

            System.out.println("Enter the third number: ");
            input = this.getInput();//get the user selection
            double value3 = Double.parseDouble(input);

            System.out.println("Enter the fourth number: ");
            input = this.getInput();//get the user selection
            double value4 = Double.parseDouble(input);

            //this.doAction(selection);//do action based on selection
            double answer = PunchCodeControl.calcPunchCodeHack(value1, value2, value3, value4);
            if (answer == 29) {
                System.out.println("Success!!!");// print success message
                RoomMenuView roomMenu = new RoomMenuView();
                roomMenu.display();
                return;
            } else {
                System.out.println("Password was incorrect, try again.");// print error message
                continue;
            }

        } while (selection != 'E');//a selection is not "Exit"
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String getInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { //while a valid iput has not been retrieved

            //get the name from the keyboard and trim off the blanks
            getInput = keyboard.nextLine();
            getInput = getInput.trim();

            // if the name is invalid (less than two characters in length))
            if (getInput.length() > 2 || getInput.length() < 1) {
                System.out.println("Invalid entry must have selection");
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
