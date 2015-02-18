/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

/**
 *
 * @author carathomson
 */
public class StartProgramView {
    public void startProgram() {

        this.displayBanner();
        
/*
* BEGIN
* Display the banner screen
* Get the players name
* Create a new player
* DISPLAY a customized welcome message
* DISPLAY the main menu
* END 
*/
            

    }

    private void displayBanner() {
        System.out.println("\n\n**************************************");
        
        System.out.println("*                                    *"
                         + "\n* Welcome to Case 234                *"
                         + "\n* In this game you are a detective   *"
                         + "\n* for the local police department    *"
                         + "\n* you are also the local wizard.     *"
                         + "\n* you need to solve a murder and     *"
                         + "\n* catch the criminal.                *" );
        
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
}
