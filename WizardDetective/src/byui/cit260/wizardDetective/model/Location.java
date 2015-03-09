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
    private int scene;

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

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.coordinate;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.visited;
        hash = 23 * hash + this.scene;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "coordinate=" + coordinate + ", name=" + name + ", visited=" + visited + ", scene=" + scene + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.coordinate != other.coordinate) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.scene != other.scene) {
            return false;
        }
        return true;
    }

}
