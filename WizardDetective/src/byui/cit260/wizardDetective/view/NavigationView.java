/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

/**
 *
 * @author Mechams
 */
public class NavigationView extends View {

    public NavigationView() {
        super("\nEnter the row and column number for the room you would like to visit.");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        String[] values = value.split(" ");

        int row = Integer.parseInt(values[0]);
        int column = Integer.parseInt(values[1]);

        if (row < 0 || row > 5) {
            return this.console.println("Row value out of bounds");
        }

        if (column < 0 || column > 5) {
            return this.console.println("Column value out of bounds");
        }

        char choice = value.charAt(0);

        switch (choice) {
            case 'P': // Look at inventory
                this.displayParlor();
                break;

            case 'C': // Look at inventory
                this.displayCrimeSceneView();
                break;

            case 'K':// move Locations
                this.displayRoomMenuView();
                break;

            case 'G': // chase man
                this.displayGuestRoom();
                break;

            case 'H': //pulls up help screen
                this.displayCellar();
                break;

            case 'B': //pulls up help screen
                this.displayGym();
                break;
            case 'E': // return to previous Menu
                return true;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayParlor() {
        this.console.println("*** Help move page selected ***");
    }

    private void displayCrimeSceneView() {
        CrimeSceneView crimeScene = new CrimeSceneView();
        crimeScene.display();

    }

    private void displayRoomMenuView() {
        PunchCodeView punchCode = new PunchCodeView();
        punchCode.display();
    }

    private void displayGuestRoom() {
        this.console.println("*** Guest Room View Selected ***");
    }

    private void displayGym() {
        this.console.println("*** Gymnasium Display Selected ***");
    }

    private void displayCellar() {
        this.console.println("*** Cellar Selected ***");
    }
}
