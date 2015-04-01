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
    Clue1("number 23 on a scrap of paper"),
    Clue2("number 8 on a scrap of paper"),
    Clue3("number 9 on a scrap of paper"),
    Clue4("number 17 on a scrap of paper"),
    Clue5("LETTER"
            + "\n Bob,"
            + "\n I thank you for your hospitality but I am unable"
            + "\n to pay my bill. My parents have frozen all of my"
            + "\n credit cards. I hope you will understand."
            + "\n      Steve"),
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
