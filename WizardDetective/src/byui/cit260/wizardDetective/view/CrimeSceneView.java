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
public class CrimeSceneView extends View {

    public CrimeSceneView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n| Crime Scene                                             |"
                + "\n You enter the room, the smell of blood is thick upon the  "
                + "\n air. You see in the middle of the floor a tall man, blonde"
                + "\n hair, lying face down on the ground a pool of blood "
                + "\nreflecting light around him. Forensics crews are busy gathering"
                + "\n evidence."
                + "\n The chief is standing next to the body looking gruff as always."
                + "\n-----------------------------------------------------------"
                + "\nA - Investigate Crime Scene"
                + "\nB - Talk to the Chief"
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
        System.out.println("You look around, finding nothing that looks out of place");
    }

    private void interrogate() {
        System.out.println("You approach the chief, he grunts when you get closer");
    }

    private void useSight() {
        System.out.println("You close your eyes, focusing on your Sight. The room lights up with an eerie green light.");
    }
}
