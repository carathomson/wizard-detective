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
    private int rows;
    private int columns;
    
    private Game game;
    private Location[] [] locations = new Location[5] [5];

    public Map() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "rows=" + rows + ", columns=" + columns + ", game=" + game + ", locations=" + locations + '}';
    }
    

}
