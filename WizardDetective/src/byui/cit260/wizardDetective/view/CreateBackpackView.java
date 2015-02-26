/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.BackpackConstructionControl;
import java.util.Scanner;

/**
 *
 * @author carathomson
 */
public class CreateBackpackView {
    public CreateBackpackView() {
    }        
        


    public void display() {
        boolean valid = false;
        do {
            System.out.println("\n\n*************************************************"
                           + "\nNo detective is compleat without a strong bag."
                           + "\nYou need to create a backpack big enough"
                           + "\nto carry your gear and any clues you"
                           + "\ncome accross as you investigate."
                         + "\n\nHere are the rules:"
                           + "\nHeight <= 25 inches"
                           + "\nWidth  <= 20 inches"
                           + "\nDepth  <= 12 inches"
                           + "\n*************************************************");
        
            System.out.println("\nHow high should your backpack be?");
           String value = this.getInput();
           double height = Double.parseDouble(value);
           
           System.out.println("\nHow wide?");
           value = this.getInput();
           double width = Double.parseDouble(value);
           
           System.out.println("\nHow deep?");
           value = this.getInput();
           double depth = Double.parseDouble(value);
           

           valid = this.doAction(height, width, depth);//do action based on selection
           
        }while (!valid);//a selection is not "Exit"
    }

    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
       String input = null;
       Scanner keyboard = new Scanner(System.in); // keyboard input stream
       
       while(!valid) { //while a valid input has not been retrieved
           
           //prompt for menu selection
           System.out.println("Enter value below");
           
           //get the selection from the keyboard and trim off the blanks
           input = keyboard.nextLine();
           input = input.trim();
           
           // if the selection is invalid
           if (input.length() < 1){
               System.out.println("Must enter a value that is not blank");
               continue; //repeat again
               }
           break; //out of the (exit) the repitition
       }
       
       return input; // return the input
    }

    private boolean doAction(double height, double width, double depth) {
     
        double volume = BackpackConstructionControl.calcBackpackSize(height, width, depth);
        if (volume == -1) {
            System.out.println(
                    "\n\n------------------"
                       +"| Invalid height |"
                       +"------------------");
            return false;
        }
        else if (volume == -2) {
            System.out.println(
                    "\n\n-----------------"
                       +"| Invalid width |"
                       +"-----------------");
            return false;
        }
        else if (volume == -3) {
            System.out.println(
                    "\n\n-----------------"
                       +"| Invalid depth |"
                       +"-----------------");
            return false;
        }
        else {
            System.out.println(
                    "\n\n========================================================"
                     +"\nCongradulations! Your backpack can hold " + volume + " cubic inches."
                     +"\nNow you are ready to start your investigation."
                     +"\n========================================================");
        }
        return true;
    }
    
    
}
