/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignSceneToLocations(Map map) {
        //get the locations 2d array in the map
        Location[] [] locations = map.getLocations();
        //assign to the location row0, column 0 the bathroom scene
        Location nextLocation = locations [0] [0];
        nextLocation.setScene(Scene.Bathroom);
        //assign to the location row0, column 1 the livingroom scene
        
        //assign to the location row0, column 2 the ... scene
    }
}