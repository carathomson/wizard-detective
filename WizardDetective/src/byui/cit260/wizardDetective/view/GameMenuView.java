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
public class GameMenuView extends View{
    public GameMenuView() {
    
        super("\n"
                +"\n-----------------------------------------------------------"
                +"\n| Game Menu                                               |"
                +"\n-----------------------------------------------------------"
                +"\nI - Inventory"
                +"\nN - Navigate"
                +"\nH - Help"
                +"\nE - Exit"
                +"\n-----------------------------------------------------------")
                ;
    }
    @Override
    public boolean doAction(Object obj) {
       
        String value = (String) obj;
        
        char choice = value.charAt(0);
            
        switch (choice) {
            case 'I': // Look at inventory
                    this.seeInventory();
                    break;
            case 'N':// move Locations
                this.displayRoomMenuView();
                break;
            case 'H': //pulls up help screen
                this.displayHelpMenu();
                break;
            case 'E': // exit the program
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }
        

    private void seeInventory() {
        CreateBackpackView createBackpack = new CreateBackpackView();
        createBackpack.display();
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void displayRoomMenuView() {
        PunchCodeView punchCode = new PunchCodeView();
        punchCode.displayPunchCode();
        
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
