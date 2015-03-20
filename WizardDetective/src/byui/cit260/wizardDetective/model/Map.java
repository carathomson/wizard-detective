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
    private int noOfRows;
    private int noOfColumns;
    
    
    
    private Game game;
    private Location[][] locations = new Location[5][5];

    public Map() {
        //for every row in the locations
        for (int i = 0; i < locations.length; i++) {
            //for every column
            for (int j = 0; j < locations[i].length; j++) {
                //assign a new location to current position
                locations[i][j] = new Location();
            }
        }
    }
    public Map(int noOfRows, int noOfColumns){
        if(noOfRows < 1 || noOfColumns < 1){
            System.out.println("the number of rows and columns must be greater than zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for(int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                //create and initialize new location object instance
                Location location = new Location();
                location.setColumn (column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the location object to the current position in the array
                locations[row][column] = location;
            }
        }
        
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", game=" + game + ", locations=" + locations + '}';
    }

   

    

}
