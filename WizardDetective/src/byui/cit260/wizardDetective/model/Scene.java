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
    Bathroom("Presidential suite bathroom. Lavish furnishings.", "BTH"),
    LivingRoom("Presidential suite room.", "LVR"),
    CrimeScene("Steve's bedroom. He is laying on his bed dead.", "CRI"),
    PresKitchen("Very nice kitchen.", "PKT"),
    Balcony("Overlooks the city.", "BAL"),
    GuestRoom("Generic hotel room.", "GST"),
    Parlor("Main entrance of the hotel.", "PAR"),
    FrontDesk("This is where you check in.", "FRD"),
    Office("This is where the Matrede organizes everything.", "OFF"),
    Kitchen("The main kitchen for the hotel.", "KTN"),
    Gym("Big room with lots of exercize equipment.", "GYM"),
    Laundry("Lots of noisy machines and clothes in bins.", "LDY"),
    Garage("Your basic parking lot full of expensive cars.", "GAR"),
    BoilerRoom("Hot noisy room with a lot of pipes.", "BOL"),
    Cellar("Big storage room full of food.", "CLR"),
    WineRoom("Cold room with wine on shelves.", "WIN"),
    SafeRoom("Hidden room behind one of the shelves in the wine room.", "SAF"),
    Janitor("Where the cleaning supplies and the Janitorys office is", "JNR");

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
