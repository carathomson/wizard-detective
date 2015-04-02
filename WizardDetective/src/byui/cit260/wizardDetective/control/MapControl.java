/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.MapControlException;
import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Scene;
import java.awt.Point;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map();

        //assign the different scenes to locations in the map
        assignSceneToLocations(map);

        return map;
    }

    static void moveActorsToStartingLocation(Map map)
            throws MapControlException {
        // for every actor
        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point location = actor.getLocation();
            MapControl.moveActorToLocation(actor, location);

        }

    }

    public static int moveActorToLocation(Actor actor, Point location)
            throws MapControlException {
        Map map = WizardDetective.getCurrentGame().getMap();
        int newRow = (int) location.getX();
        int newColumn = (int) location.getY();

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Cannot move Actor to location "
                    + location.x + ", " + location.y
                    + " because that location is outside"
                    + " the bounds of the map.");
        }
        return 0;
    }

    private static void assignSceneToLocations(Map map) {
        //get the locations 2d array in the map
        Location[][] locations = map.getLocations();
        //assign to the location row0, column 0 the bathroom scene
        Location nextLocation = locations[0][0];
        nextLocation.setLocation(Scene.Bathroom);
        //assign to the location row0, column 1 the livingroom scene
        Location nextLocation1 = locations[0][1];
        nextLocation1.setLocation(Scene.LivingRoom, Actor.Witness);
        //assign to the location row0, column 2 the Crime scene
        Location nextLocation2 = locations[0][2];
        nextLocation2.setLocation(Scene.CrimeScene, Actor.Chief);
        //assign to the location row0, column 3 the Kitchen scene
        Location nextLocation3 = locations[0][3];
        nextLocation3.setLocation(Scene.PresKitchen);
        //assign to the location row0, column 4 the Balcony scene
        Location nextLocation4 = locations[0][4];
        nextLocation4.setLocation(Scene.Balcony);
        //assign to the location row1, column 0 the Kitchen scene
        Location nextLocation5 = locations[1][0];
        nextLocation5.setLocation(Scene.GuestRoom, Clue.Clue2);
        //assign to the location row1, column 1 the Kitchen scene
        Location nextLocation6 = locations[1][1];
        nextLocation6.setLocation(Scene.GuestRoom);
        //assign to the location row1, column 2 the Kitchen scene
        Location nextLocation7 = locations[1][2];
        nextLocation7.setLocation(Scene.GuestRoom, Actor.Janitor, Clue.Clue6);
        //assign to the location row1, column 3 the Kitchen scene
        Location nextLocation8 = locations[1][3];
        nextLocation8.setLocation(Scene.GuestRoom);
        //assign to the location row1, column 0 the Kitchen scene
        Location nextLocation9 = locations[1][4];
        nextLocation9.setLocation(Scene.Janitor);
        //assign to the location row2, column 0 the Kitchen scene
        Location nextLocation10 = locations[2][0];
        nextLocation10.setLocation(Scene.GuestRoom, Actor.Maid, Clue.Clue10);
        //assign to the location row2, column 1 the Kitchen scene
        Location nextLocation11 = locations[2][1];
        nextLocation11.setLocation(Scene.GuestRoom);
        //assign to the location row2, column 2 the Kitchen scene
        Location nextLocation12 = locations[2][2];
        nextLocation12.setLocation(Scene.GuestRoom, Clue.Clue1);
        //assign to the location row2, column 3 the Kitchen scene
        Location nextLocation13 = locations[2][3];
        nextLocation13.setLocation(Scene.GuestRoom);
        //assign to the location row2, column 4 the Kitchen scene
        Location nextLocation14 = locations[2][4];
        nextLocation14.setLocation(Scene.GuestRoom);
        //assign to the location row3, column 0 the Kitchen scene
        Location nextLocation15 = locations[3][0];
        nextLocation15.setLocation(Scene.Parlor, Actor.Bellboy, Clue.Clue6);
        //assign to the location row3, column 1 the Kitchen scene
        Location nextLocation16 = locations[3][1];
        nextLocation16.setLocation(Scene.FrontDesk, Actor.Matrede);
        //assign to the location row3, column 2 the Kitchen scene
        Location nextLocation17 = locations[3][2];
        nextLocation17.setLocation(Scene.Office, Clue.Clue7);
        //assign to the location row3, column 3 the Kitchen scene
        Location nextLocation18 = locations[3][3];
        nextLocation18.setLocation(Scene.Kitchen, Actor.Cook);
        //assign to the location row3, column 4 the Kitchen scene
        Location nextLocation19 = locations[3][4];
        nextLocation19.setLocation(Scene.Gym, Actor.Coach, Clue.Clue6);
        //assign to the location row4, column 0 the Kitchen scene
        Location nextLocation20 = locations[4][0];
        nextLocation20.setLocation(Scene.Laundry, Actor.Tim);
        //assign to the location row4, column 1 the Kitchen scene
        Location nextLocation21 = locations[4][1];
        nextLocation21.setLocation(Scene.Garage, Clue.Clue8);
        //assign to the location row4, column 2 the Kitchen scene
        Location nextLocation22 = locations[4][2];
        nextLocation22.setLocation(Scene.BoilerRoom, Clue.Clue4);
        //assign to the location row4, column 3 the Kitchen scene
        Location nextLocation23 = locations[4][3];
        nextLocation23.setLocation(Scene.SafeRoom, Actor.Bob);
        //assign to the location row4, column 4 the Kitchen scene
        Location nextLocation24 = locations[4][4];
        nextLocation24.setLocation(Scene.WineRoom, Clue.Clue5);

    }

}
