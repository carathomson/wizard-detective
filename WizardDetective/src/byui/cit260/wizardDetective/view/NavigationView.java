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
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Navigation                                               |"
                + "\n-----------------------------------------------------------"
                + "\nP - Parlor"
                + "\nC - Crime Scene"
                + "\nK - Kitchen"
                + "\nG - Guest Room #33"
                + "\nH - Cellar"
                + "\nB - Gymnasium"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayParlor() {
        System.out.println("*** Help move page selected ***");
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
        System.out.println("*** Guest Room View Selected ***");
    }

    private void displayGym() {
        System.out.println("*** Gymnasium Display Selected ***");
    }

    private void displayCellar() {
        System.out.println("*** Cellar Selected ***");
    }
}
