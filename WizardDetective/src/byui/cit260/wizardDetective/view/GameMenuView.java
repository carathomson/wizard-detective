/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.NotebookControl;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import java.util.Scanner;

/**
 *
 * @author Lynn
 */
public class GameMenuView extends View {

    public GameMenuView() {

        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Game Menu                                               |"
                + "\n-----------------------------------------------------------"
                + "\nI - Inventory"
                + "\nB - Make Backpack"
                + "\nN - Navigate"
                + "\nC - Chase Man"
                + "\nH - Help"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        switch (choice) {
            case 'I': // Look at list of clues
                this.seeInventory();
                break;
            case 'N':// move Locations
                this.displayMap();
                break;
            case 'B'://make your backpack
                this.makeBackpack();
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
        NotebookControl notebookList = new NotebookControl();
        notebookList.display();
    }

    private void chaseMan() {
        SearchAreaView searchArea = new SearchAreaView();
        searchArea.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();

    }

    private void displayNavigationView() {
        NavigationView navigation = new NavigationView();
        navigation.display();

    }

    private void makeBackpack() {
        CreateBackpackView createBackpack = new CreateBackpackView();
        createBackpack.display();
    }

    private void displayMap(Map map) {
        //get map locations
        Location[][] locations = map.getLocations();
        //display map title
        System.out.println("The Ritz Marriot Hotel");
        //display column numbers
        System.out.println('1' + '2' + '3' + '4' + '5');
        //for every row in the map do:
        for (int i = 0; i < locations.length; i++) {
            //row divider
            System.out.println("----------------------------------------");
            //row number
            System.out.println(i);
            //for every column in the row do:
            for (int j = 0; j < locations[i].length; j++) {
                //column divider
                System.out.println("|");
                //assign scene to spacific coordinate
                Location room = locations[i][j];
                //if the location has been visited
                    //display scene name
                //else show "???"
                
            }
        }
    }

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
