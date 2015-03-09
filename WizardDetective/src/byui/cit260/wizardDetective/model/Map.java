/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.model;

import java.io.Serializable;

/**
 *
 * @author Lynn Mecham
 */
public class Map implements Serializable {

    //class instance variables
    private int size;
    private int coordinate;
    private int location;

    public Map() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.size;
        hash = 83 * hash + this.coordinate;
        hash = 83 * hash + this.location;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "size=" + size + ", coordinate=" + coordinate + ", location=" + location + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.size != other.size) {
            return false;
        }
        if (this.coordinate != other.coordinate) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        return true;
    }

}
