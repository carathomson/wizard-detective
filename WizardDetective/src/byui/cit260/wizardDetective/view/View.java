/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import java.util.Scanner;

/**
 *
 * @author carathomson
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        char selection = ' ';
        do {
            System.out.println(this.promptMessage);//display message

            String input = this.getInput();//get the user selection
            selection = input.charAt(0);//get first character of a string

            this.doAction(selection);//do action based on selection

        } while (selection != 'E');//a selection is not "Exit"
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String getInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { //while a valid input has not been retrieved

            //prompt for the players name
            System.out.println("Enter the letter for the Menu Selection");

            //get the name from the keyboard and trim off the blanks
            getInput = keyboard.nextLine();
            getInput = getInput.trim();

            // if the name is invalid (less than two characters in length))
            if (getInput.length() > 1 || getInput.length() < 1) {
                System.out.println("Invalid entry must have selection");
                continue; //repeat again
            }
            break; //out of the (exit) the repitition
        }

        return getInput; // return the input    
    }

}
