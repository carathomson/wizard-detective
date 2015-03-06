/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

/**
 *
 * @author Lynn
 */
public class RoomMenuView extends View {

    public RoomMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Room                                             |"
                + "\n-----------------------------------------------------------"
                + "\nA - Investigate room"
                + "\nB - Interrogate Suspect"
                + "\nC - Use Wizards Sight"
                + "\nE - Exit"
                + "\n-----------------------------------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        char choice = value.charAt(0);

        switch (choice) {
            case 'A': // Loads investigate options
                this.investigate();
                break;
            case 'B':// loads interrogate options
                this.interrogate();
                break;
            case 'C':// loads the Sight options
                this.useSight();
                break;
            case 'E': // exit to previous screen
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                return false;
        }
        return true;
    }

    private void investigate() {
        System.out.println("You investigate the room");
    }

    private void interrogate() {
        System.out.println("You approach the suspect, questions in mind.");
    }

    private void useSight() {
        System.out.println("You close your eyes, focusing on your Sight.");
    }



}
