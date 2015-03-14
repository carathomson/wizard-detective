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
    Bathroom("Presidential suite bathroom. Lavish furnishings."),
    LivingRoom("Presidential suite room."),
    CrimeScene("Steve's bedroom. He is laying on his bed dead."),
    PresKitchen("Very nice kitchen."),
    Balcony("Overlooks the city."),
    GuestRoom("Generic hotel room."),
    Parlor("Main entrance of the hotel."),
    FrontDesk("This is where you check in."),
    Office("This is where the Matrede organizes everything."),
    Kitchen("The main kitchen for the hotel."),
    Gym("Big room with lots of exercize equipment."),
    Laundry("Lots of noisy machines and clothes in bins."),
    Garage("Your basic parking lot full of expensive cars."),
    BoilerRoom("Hot noisy room with a lot of pipes."),
    Cellar("Big storage room full of food."),
    WineRoom("Cold room with wine on shelves."),
    SafeRoom("Hidden room behind one of the shelves in the wine room.");

    //class instance variables
    private final String description;
    private final Clue[] clues;
    private final Tool[] tools;
    private final Actor[] actors;
    
    private Location[] location;
    private Actor[] actor;
    private Inventory[] inventory;

    Scene(String description) {
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

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", clues=" + clues + ", tools=" + tools + ", actors=" + actors + '}';
    }

}
