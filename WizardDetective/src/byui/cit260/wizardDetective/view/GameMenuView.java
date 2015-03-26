/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.GameControl;
import byui.cit260.wizardDetective.control.NotebookControl;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Scene;
import java.util.Scanner;
import wizarddetective.WizardDetective;

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
                this.displayMap(WizardDetective.getCurrentGame().getMap());
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
        Location[][] locations = map.getLocations();
        System.out.println("\nThe Ritz Marriot Hotel");
        System.out.println("1" + "2" + "3" + "4" + "5");
        for (int i = 0; i < locations.length; i++) {
//            System.out.println();
            System.out.println("-----------------------");
            System.out.print(i + 1);
            for (int j = 0; j < locations[i].length; j++) {
                System.out.print("|");
                Location room = locations[i][j];
                //if location is visited
                if (room.isVisited()) {
                    System.out.print(room.getScene().getSymbol());
                } else {
                    System.out.print("??");

                }
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }

}
