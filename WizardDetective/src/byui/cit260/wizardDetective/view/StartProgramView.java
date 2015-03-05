/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.ProgramControl;
import byui.cit260.wizardDetective.model.Player;
import java.util.Scanner;

/**
 *
 * @author carathomson
 */
public class StartProgramView extends View {

    public void startProgramView() {

        this.displayBanner();
        //prompt player to enter name and retrieve name
        String playersName = this.getPlayersName();
        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        //Display personalized welcome message
        this.display(player);
        //Display the main view
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    @Override
    public void display() {
        System.out.println("\n\n**************************************");

        System.out.println("*                                    *"
                + "\n* Welcome to Case 234                *"
                + "\n* In this game you are a detective   *"
                + "\n* for the local police department    *"
                + "\n* you are also the local wizard.     *"
                + "\n* you need to solve a murder and     *"
                + "\n* catch the criminal.                *");

        System.out.println("*                                    *"
                + "\n* There was a murder at the hotel,   *"
                + "\n* you have been called in to solve   *"
                + "\n* it. You will have to use both      *"
                + "\n* traditional and magiacl means to   *"
                + "\n* find the killer. There will be     *"
                + "\n* puzzles to solve and clues to find.*"
                + "\n* To start off you need to create a  *"
                + "\n* backpack.                          *");

        System.out.println("*                                    *"
                + "\n* Good luck and have fun!            *"
                + "\n*                                    *");

        System.out.println("**************************************");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { //while a valid name has not been retrieved

            //prompt for the players name
            System.out.println("Enter the player's name below:");

            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            // if the name is invalid (less than two characters in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //repeat again
            }
            break; //out of the (exit) the repitition
        }

        return playersName; // return the name

    }

    public void display(Player player) {
        System.out.println("\n\n===========================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("===============================================");
    }

    private void displayBanner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPlayersName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void startProgram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
