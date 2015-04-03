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
    private boolean visited;
    private Scene scene;
    private int row;
    private int column;
    private Actor actor;
    private Clue clue;
    
    private Inventory[] inventory;

    public Location() {
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }
    

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setLocation(Scene scene) {
        this.scene = scene;
    }
    
    public void setLocation(Scene scene,Clue clue) {
        this.scene = scene;
        this.clue = clue;
    }

    public void setLocation(Scene scene,Actor actor) {
        this.scene = scene;
        this.actor = actor;
    }

    public void setLocation(Scene scene, Actor actor, Clue clue) {
        this.scene = scene;
        this.actor = actor;
        this.clue = clue;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
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
