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
 * @author carathomson
 */
public enum Clue implements Serializable {
    
    //descriptions
    Clue1("number on a scrap of paper"),
    Clue2("number on a scrap of paper"),
    Clue3("number on a scrap of paper"),
    Clue4("number on a scrap of paper"),
    Clue5("letter to Bob the owner from Steve"),
    Clue6("Rumor from the staff about Bob in wine room");

    //class instance variables
    private final Clue[] clueType;
    private final String description;

    Clue(String description) {
        this.description = description;
        this.clueType = new Clue[6];
    }
    
    

    public Clue[] getClueType() {
        return clueType;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Clue{" + "clueType=" + clueType + ", description=" + description + '}';
    }

}
