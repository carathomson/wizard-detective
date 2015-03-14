/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mechams
 */
public class Location implements Serializable {

    //class Instance variables
    private int coordinate;
    private String name;
    private int visited;
    private Scene scene;
    
    private Inventory[] inventory;
    

    public Location() {
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinate=" + coordinate + ", name=" + name + ", visited=" + visited + ", scene=" + scene + ", inventory=" + inventory + '}';
    }




}
