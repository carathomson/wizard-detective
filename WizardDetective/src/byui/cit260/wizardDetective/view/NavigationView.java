/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import byui.cit260.wizardDetective.control.ActorControl;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Scene;
import java.awt.Point;
import wizarddetective.WizardDetective;

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
            this.console.println("Row value out of bounds");
        }

        if (column < 0 || column > 5) {
            this.console.println("Column value out of bounds");
        }
        
        Point location = new Point(row, column);
        ActorControl.moveActorToLocation(WizardDetective.getCurrentGame().getPlayer().getActor(), location);
        
        Location[][] locations = WizardDetective.getCurrentGame().getMap().getLocations();
        Location newLocation = locations[row][column];
        Scene scene = newLocation.getScene();
        this.console.println(scene.getDescription());
//        displayMap(WizardDetective.getCurrentGame().getMap());
        
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
