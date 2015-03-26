/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = WizardDetective.getInFile();
    protected final PrintWriter console = WizardDetective.getOutFile();

    public View() {
        promptMessage = "";
    }

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
        String input;
        do {
            this.console.println(this.promptMessage);//display message

            input = this.getInput();//get the user selection
            //           selection = input.charAt(0);//get first character of a string

            this.doAction(input);//do action based on selection

        } while (!input.equals("E"));//a selection is not "Exit"
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String getInput = null;

        while (!valid) {
            try {
            //while a valid input has not been retrieved

                //get the name from the keyboard and trim off the blanks
                getInput = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            getInput = getInput.trim();

            try{
            // if the name is invalid (less than two characters in length))
            if (getInput.length() < 1) {
                continue; //repeat again
            }
            break; //out of the (exit) the repitition
            }catch (Exception e){
                ErrorView.display(this.getClass().getName(),
                        "Error Reading Input" + e.getMessage());
                return null;
            }
        }

        return getInput; // return the input    
    }

}
