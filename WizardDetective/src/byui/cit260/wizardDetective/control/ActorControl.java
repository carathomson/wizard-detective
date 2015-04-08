/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.GameControlException;
import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Notebook;
import byui.cit260.wizardDetective.model.Scene;
import wizarddetective.WizardDetective;
import java.awt.Point;

/**
 *
 * @author carathomson
 */
public class ActorControl {

    static Actor[] createActor() {
        System.out.println("createActor function called");
        return null;
    }

    public static Location moveActorToLocation(Actor actor, Point coordinates)
            throws GameControlException {

        Location newLocation = null;

        // get new Location from locations 2-d array
        Location[][] locations = WizardDetective.getCurrentGame().getMap().getLocations();
        newLocation = locations[coordinates.x][coordinates.y];
        newLocation.setActor(actor);
        newLocation.setVisited(true);
        Point oldCoordinates = actor.getLocation();
        Location oldLocation = locations[oldCoordinates.x][oldCoordinates.y];
        oldLocation.setActor(null);
        actor.getLocation().x = coordinates.x;
        actor.getLocation().y = coordinates.y;

        //get the clue disctiption at the newLocation
        Clue clue = newLocation.getClue();
        Notebook notebook = WizardDetective.getCurrentGame().getNotebook();
        NotebookControl.addClue(clue, notebook);


        
        return newLocation;
    }

}
