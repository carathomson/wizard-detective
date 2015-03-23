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
 * @author Lynn
 */
public enum Scene implements Serializable {
    Bathroom("Presidential suite bathroom. Lavish furnishings.", "BR"),
    LivingRoom("Presidential suite room.", "LR"),
    CrimeScene("Steve's bedroom. He is laying on his bed dead.", "CS"),
    PresKitchen("Very nice kitchen.", "PK"),
    Balcony("Overlooks the city.", "BA"),
    GuestRoom("Generic hotel room.", "GR"),
    Parlor("Main entrance of the hotel.", "P"),
    FrontDesk("This is where you check in.", "FD"),
    Office("This is where the Matrede organizes everything.", "OF"),
    Kitchen("The main kitchen for the hotel.", "K"),
    Gym("Big room with lots of exercize equipment.", "G"),
    Laundry("Lots of noisy machines and clothes in bins.", "L"),
    Garage("Your basic parking lot full of expensive cars.", "GA"),
    BoilerRoom("Hot noisy room with a lot of pipes.", "BO"),
    Cellar("Big storage room full of food.", "CL"),
    WineRoom("Cold room with wine on shelves.", "WI"),
    SafeRoom("Hidden room behind one of the shelves in the wine room.", "SA"),
    Janitor("Where the cleaning supplies and the Janitorys office is", "J");

    //class instance variables
    private final String description;
    private final Clue[] clues;
    private final Tool[] tools;
    private final Actor[] actors;
    private final String symbol;
    private Location[] location;
    private Actor[] actor;
    private Inventory[] inventory;

    Scene(String description, String symbol) {
        this.symbol = symbol;
        this.description = description;
        this.clues = new Clue[6];
        this.actors = new Actor[11];
        this.tools = new Tool[6];
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public Clue[] getClues() {
        return clues;
    }

    public Tool[] getTools() {
        return tools;
    }

    public Actor[] getActors() {
        return actors;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", clues=" + clues + ", tools=" + tools + ", actors=" + actors + ", symbol=" + symbol + ", location=" + location + ", actor=" + actor + ", inventory=" + inventory + '}';
    }

}
