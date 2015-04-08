/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.GameControl;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
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
                + "\nC - Notebook Clues"
                + "\nN - Navigate"
                + "\nM - Chase Man"
                + "\nP - Print Notebook"
                + "\nZ - Print Map"
                + "\nH - Help"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        try {
            switch (choice) {
                case 'C': // Look at list of clues
                    this.seeNotebook();
                    break;
                case 'N':// move Locations
                    this.displayNavigationView();
                    break;
                case 'Z':// print Map
                    this.printNavigationView();
                    break;
                case 'M': // chase man
                    this.chaseMan();
                    break;
                // case 'P'://Print Notebook
                //   this.printNotebook();
                // break;
//            case 'C'://Print character list
//                this.printCharacters();
//                break;
                case 'H': //pulls up help screen
                    this.displayHelpMenu();
                    break;
                case 'E': // exit the program
                    return true;
                default:
                    this.console.println("\n*** Invalid Selection *** Try Again");
                    break;
            }

        } catch (Exception e) {
            this.console.println(e.getMessage());
        }
        return true;
    }

    private void seeNotebook() {
        NotebookView notebook = new NotebookView();
        notebook.display();
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

    private void printNavigationView() {
        PrintWriter mapOut = null;
        try {
            this.console.println("enter file name for the saved map");
            String file = getInput();
            mapOut = new PrintWriter(file);
            this.displayMap(WizardDetective.getCurrentGame().getMap(), mapOut);
        } catch (IOException e) {
            ErrorView.display("GameMenuView", e.getMessage());
        } finally {
            mapOut.close();
        }
    }

    private void makeBackpack() {
        CreateBackpackView createBackpack = new CreateBackpackView();
        createBackpack.display();
    }

    public void displayMap(Map map) {
        this.console.println(buildMap(map));
    }

    public void displayMap(Map map, PrintWriter mapOut) {
        mapOut.println(buildMap(map));
    }

    private String buildMap(Map map) {
        StringBuilder sb = new StringBuilder();
        Location[][] locations = map.getLocations();
        sb.append("\n   The Ritz Marriot Hotel");
        sb.append("\n");
        sb.append("\n     0" + "   1" + "   2" + "   3" + "   4");
        sb.append("\n");
        for (int i = 0; i < locations.length; i++) {
            sb.append("    -------------------");
            sb.append("\n");
            sb.append(i + "  ");
            for (int j = 0; j < locations[i].length; j++) {
                sb.append("|");
                Location room = locations[i][j];
                //if location is visited
                if (room.isVisited()) {
                    sb.append(room.getScene().getSymbol());
                } else {
                    sb.append("???");

                }
            }
            sb.append("|");
            sb.append("\n");
        }
        sb.append("    -------------------");
        sb.append("\n");
        return sb.toString();
    }

    /**
     * private void printNotebook() { //prompt for and get the name of the file
     * to print the notbook to this.console.println("\n\nEnter the file path to
     * where the Notebook " + "is to be printed to."); String filePath =
     * this.getInput();
     *
     * try { NotebookControl.printNotebook(filePath); } catch (Exception ex) {
     * ErrorView.display("GameMenuView", ex.getMessage()); } }
     *
     */
//    private void printCharacters() {
//        // prompt for user to enter the filepath to print to
//        this.console.println("================================================="
//                + "\nPlease enter the filepath where you would like"
//                + "\nthe list of characters to be printed."
//                + "\n=================================================");
//        // get the filepath
//        String filePath = this.getInput();
//        // call method to print the report
//        try {
//            filePath =
//            // display a success message
//            this.console.println(
//                    "\n\n--------------------------------------------------------"
//                    + "\nSUCCESS!"
//                    + "\nThe list of characters have been printed to your file."
//                    + "\n--------------------------------------------------------");
//        // catch errors
//        } catch (PrintCharactersViewException e) {
//            this.console.println(e.getMessage());
//        }
//
//
//
//    }
}
