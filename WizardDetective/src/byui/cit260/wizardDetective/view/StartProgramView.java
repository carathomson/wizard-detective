/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.ProgramControl;
import byui.cit260.wizardDetective.model.Player;

/**
 *
 * @author carathomson
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n\n**************************************"
                + "*                                    *"
                + "\n* Welcome to Case 234                *"
                + "\n* In this game you are a detective   *"
                + "\n* for the local police department    *"
                + "\n* you are also the local wizard.     *"
                + "\n* you need to solve a murder and     *"
                + "\n* catch the criminal.                *"
                + "\n*                                    *"
                + "\n* There was a murder at the hotel,   *"
                + "\n* you have been called in to solve   *"
                + "\n* it. You will have to use both      *"
                + "\n* traditional and magiacl means to   *"
                + "\n* find the killer. There will be     *"
                + "\n* puzzles to solve and clues to find.*"
                + "\n* To start off you need to create a  *"
                + "\n* backpack.                          *"
                + "\n*                                    *"
                + "\n* Good luck and have fun!            *"
                + "\n*                                    *"
                + "\n**************************************"
                + "\n\n  Please enter your name:");
    }

    public void display(Player player) {
        System.out.println("\n\n===========================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("===============================================");
    }

    @Override
    public boolean doAction(Object obj) {
        String playersName = (String) obj;
        Player player = ProgramControl.createPlayer(playersName);
        //Display personalized welcome message
        this.display(player);
        //Display the main view
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

        return true;
    }

}
