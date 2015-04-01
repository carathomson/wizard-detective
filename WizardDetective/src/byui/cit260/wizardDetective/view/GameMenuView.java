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
                + "\nP - Print Notebook"
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
                
                this.displayNavigationView();
                break;
            case 'B'://make your backpack
                this.makeBackpack();
                break;
            case 'C': // chase man
                this.chaseMan();
                break;
            case 'P'://Print Notebook
                this.printNotebook();
                break;
            case 'H': //pulls up help screen
                this.displayHelpMenu();
                break;
            case 'E': // exit the program
                return true;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
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
        this.displayMap(WizardDetective.getCurrentGame().getMap());
        NavigationView navigation = new NavigationView();
        navigation.display();

    }

    private void makeBackpack() {
        CreateBackpackView createBackpack = new CreateBackpackView();
        createBackpack.display();
    }

    private void displayMap(Map map) {
        Location[][] locations = map.getLocations();
        this.console.println("\n   The Ritz Marriot Hotel");
        this.console.println("\n     1" + "   2" + "   3" + "   4" + "   5");
        for (int i = 0; i < locations.length; i++) {
            this.console.println("    -------------------");
            this.console.print(i + 1 + "  ");
            for (int j = 0; j < locations[i].length; j++) {
                this.console.print("|");
                Location room = locations[i][j];
                //if location is visited
                if (room.isVisited()) {
                    this.console.print(room.getScene().getSymbol());
                } else {
                    this.console.print("???");

                }
            }
            this.console.println("|");
        }
        this.console.println("    -------------------");
    }

    private void printNotebook() {
        //prompt for and get the name of the file to print the notbook to
        this.console.println("\n\nEnter the file path to where the Notebook "
                                + "is to be printed to.");
        String filePath = this.getInput();
        
        try{
            NotebookControl.printNotebook(filePath);
        }catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

}
