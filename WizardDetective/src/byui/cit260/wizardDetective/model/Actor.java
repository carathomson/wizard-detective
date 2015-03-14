/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Lynn
 */
public enum Actor implements Serializable {
    
    //descriptions
    Chief("chief of police. Head of investigation"),
    Witness("maid who dicovered the body."),
    Janitor("older gentleman who knows everything about the building."),
    Matrede("head of staff who organizes everything."),
    Bellboy("young kid who helps with the bags and does the odd jobs."),
    Tim("other detective on the case."),
    Bob("hotel owner"),
    Cook("Robust wooman in kitchen"),
    Coach("Fit man who teaches in the gym"),
    Maid("lady who has worked here for a few weeks cleaning rooms."),
    Steve("victim");

    //class instances
    private final Point location;
    private final String[] conversation;
    private final String description;
    private final Clue[] clues;
    
    private Game game;
    private Scene[] scene;
    private Inventory inventory;

    Actor(String description) {
        this.description = description;
        location = new Point(1,1);
        this.conversation = new String[4];
        this.clues = new Clue[6];
        
    }

    public Game getGame() {
        return game;
    }

    public Scene[] getScene() {
        return scene;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Point getLocation() {
        return location;
    }

    public String[] getConversation() {
        return conversation;
    }


    public String getDescription() {
        return description;
    }

    public Clue[] getClues() {
        return clues;
    }

  

    @Override
    public String toString() {
        return "Actor{" + "location=" + location + ", conversation=" + conversation + ", description=" + description + ", clues=" + clues + '}';
    }


}
