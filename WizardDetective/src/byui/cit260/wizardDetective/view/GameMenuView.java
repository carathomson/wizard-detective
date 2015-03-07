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
                +"\nC - Chase Man"
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
            case 'C': // chase man
                    this.chaseMan();
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

    private void chaseMan() {
        SearchAreaView searchArea = new SearchAreaView();
        searchArea.display();
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    
    }

    private void displayRoomMenuView() {
        PunchCodeView punchCode = new PunchCodeView();
        punchCode.display();
        
    }


    
}
