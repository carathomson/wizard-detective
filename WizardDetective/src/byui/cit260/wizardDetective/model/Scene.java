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
    Bathroom("\nYou walk into the Presidential suite bathroom and notice"
            + "\nthe lavish furnishings. Nothing seems out of place.", "BTH"),
    LivingRoom("\nIn entering the suite's living room you see a distraught woman"
            + "\n sitting on the fancy couch. She must be the witness!", "LVR"),
    CrimeScene("\nYou walk into the crime scene. Forensic Specialists are coming"
            + "\nthrough the area checking for particulates and anything else that"
            + "\nmay be of use in the investigation. There is a body lying face down"
            + "\non the bed. A red pool of dried blood surrounding his body. His hair"
            + "\nis blond. The cause of death is obvious, his throat was slashed.", "CRI"),
    PresKitchen("\nThe Presidential suite's kitchen doesn't seem to hold any clues. "
            + "\nEvery surface is covered in fingerprinting dust. The Forensics"
            + "\nteam has already been through here.", "PKT"),
    Balcony("\nYou notice the large balcony and go to take a look. The view is"
            + "\namazing but you don't see anything of interest.", "BAL"),
    GuestRoomOne("\nYou enter a generic hotel room with two beds and a bathroom."
            + "\nNothing is out of the ordinary so you move on.", "GST"),
    GuestRoomTwo("\nYou enter a generic hotel room and you see a crumpled paper in"
            + "\nthe otherwise spotless room. You pick it up and smooth it out.", "GST"),
    GuestRoomThree("\nYou enter a generic hotel room and you see someone!"
            + "\nYou walk up to them and ask them a few questions", "GST"),
    Parlor("\nYou walk into the main entrance of the hotel and see the"
            + "\nBell Boy by the door. You go up and talk to him.", "PAR"),
    FrontDesk("\nYou approach the front desk and strike up a conversation"
            + "\nwith the Matrade named Gaston.", "FRD"),
    Office("\nUpon walking into the office you quickly notice this is where"
            + "\nthe Matrede organizes everything for Bob the owner. You use"
            + "\nyour sight and notice two drops of blood in the corner.", "OFF"),
    Kitchen("\nYou enter the main kitchen for the hotel and the jolly plump"
            + "\n lady who is the cook starts yacking away to you.", "KTN"),
    Gym("\nYou find yourself in a big room with lots of exercize equipment."
            + "\nA Schwarzenegger like man walks up to you. He let you know"
            + "\nhe is the fitness instructor. You tell him who you are and"
            + "\nthen you ask him some questions", "GYM"),
    Laundry("\nYou find yourself in the laundry room. There are lots of"
            + "\nnoisy machines and clothes in bins. You see your partner"
            + "\nTim. He shows you a pile of past files.", "LDY"),
    Garage("\nYou open the door to the garage and at first it looks pretty"
            + "\nnormal but then something glimmers. You go over and find"
            + "\na knife covered in blood. It is the murder wepon!", "GAR"),
    BoilerRoom("\nYou go into a hot noisy room with a lot of pipes.Must be"
            + "\nthe boiler room. You have no chance of finding anything"
            + "\nhere so you use your sight and notice a pice of paper wadded"
            + "\nup on the top of the trash.", "BOL"),
    Cellar("\nEntering the big food storage room you realize you haven't eaten"
            + "\nyet. Nothing looks out of the ordinary and your sight also "
            + "\nreveals nothing so you move on.", "CLR"),
    WineRoom("\nA chill goes down your spine as you enter the cold wine room."
            + "\nSomething seems off and on looking around you see a discarded"
            + "\nletter.Just to be safe you use your sight and you are suprised"
            + "\nwhen you see a hidden doorway.", "WIN"),
    SafeRoom("\nEntering the code, the secret door opens and you cautiously"
            + "\ncreap into a dimly lit room. You have finally found the rumored"
            + "\nBob! He heard the door open and nocks the gun out of your hand."
            + "\nAfter struggling for a few minutes he knocks you down dazed and"
            + "\nruns out the door. As you slowly limp after him you follow him"
            + "\nwith your sight and see him pull out of the garage in his fancy"
            + "\ncar. -this is where SearchAreaView is called-", "SAF"),
    Janitor("\nWhere the cleaning supplies and the Janitor's office is", "JNR");

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
