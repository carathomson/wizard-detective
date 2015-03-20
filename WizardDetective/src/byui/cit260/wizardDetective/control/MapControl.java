/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Scene;

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

     static void moveActorsToStartingLocation(Map map) {
        System.out.println("moveActortoStartingLocaitonCalled");
    }

    private static void assignSceneToLocations(Map map) {
        //get the locations 2d array in the map
        Location[] [] locations = map.getLocations();
        //assign to the location row0, column 0 the bathroom scene
        Location nextLocation = locations [0] [0];
        nextLocation.setScene(Scene.Bathroom);
        //assign to the location row0, column 1 the livingroom scene
        Location nextLocation1 = locations [0] [1];
        nextLocation.setScene(Scene.LivingRoom);
        //assign to the location row0, column 2 the Crime scene
        Location nextLocation2 = locations [0] [2];
        nextLocation.setScene(Scene.CrimeScene);
        //assign to the location row0, column 3 the Kitchen scene
        Location nextLocation3 = locations [0] [3];
        nextLocation.setScene(Scene.PresKitchen);
        //assign to the location row0, column 4 the Balcony scene
        Location nextLocation4 = locations [0] [4];
        nextLocation.setScene(Scene.Balcony);
        //assign to the location row1, column 0 the Kitchen scene
        Location nextLocation5 = locations [1] [0];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row1, column 1 the Kitchen scene
        Location nextLocation6 = locations [1] [1];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row1, column 2 the Kitchen scene
        Location nextLocation7 = locations [1] [2];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row1, column 3 the Kitchen scene
        Location nextLocation8 = locations [1] [3];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row1, column 0 the Kitchen scene
        Location nextLocation9 = locations [1] [4];
        nextLocation.setScene(Scene.Janitor);
        //assign to the location row2, column 0 the Kitchen scene
        Location nextLocation10 = locations [2] [0];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row2, column 1 the Kitchen scene
        Location nextLocation11 = locations [2] [1];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row2, column 2 the Kitchen scene
        Location nextLocation12 = locations [2] [2];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row2, column 3 the Kitchen scene
        Location nextLocation13 = locations [2] [3];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row2, column 4 the Kitchen scene
        Location nextLocation14 = locations [2] [4];
        nextLocation.setScene(Scene.GuestRoom);
        //assign to the location row3, column 0 the Kitchen scene
        Location nextLocation15 = locations [3] [0];
        nextLocation.setScene(Scene.Parlor);
        //assign to the location row3, column 1 the Kitchen scene
        Location nextLocation16 = locations [3] [1];
        nextLocation.setScene(Scene.FrontDesk);
        //assign to the location row3, column 2 the Kitchen scene
        Location nextLocation17 = locations [3] [2];
        nextLocation.setScene(Scene.Office);
        //assign to the location row3, column 3 the Kitchen scene
        Location nextLocation18 = locations [3] [3];
        nextLocation.setScene(Scene.Kitchen);
        //assign to the location row3, column 4 the Kitchen scene
        Location nextLocation19 = locations [3] [4];
        nextLocation.setScene(Scene.Gym);
        //assign to the location row4, column 0 the Kitchen scene
        Location nextLocation20 = locations [4] [0];
        nextLocation.setScene(Scene.Laundry);
        //assign to the location row4, column 1 the Kitchen scene
        Location nextLocation21 = locations [4] [1];
        nextLocation.setScene(Scene.Garage);
        //assign to the location row4, column 2 the Kitchen scene
        Location nextLocation22 = locations [4] [2];
        nextLocation.setScene(Scene.BoilerRoom);
        //assign to the location row4, column 3 the Kitchen scene
        Location nextLocation23 = locations [4] [3];
        nextLocation.setScene(Scene.SafeRoom);
        //assign to the location row4, column 4 the Kitchen scene
        Location nextLocation24 = locations [4] [4];
        nextLocation.setScene(Scene.WineRoom);
        
    }
   
}