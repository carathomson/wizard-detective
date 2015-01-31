
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizarddetective;

import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Backpack;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.model.Game;
import byui.cit260.wizardDetective.model.Inventory;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Notebook;
import byui.cit260.wizardDetective.model.Player;
import byui.cit260.wizardDetective.model.Scene;
import byui.cit260.wizardDetective.model.Tool;

/**
 *
 * @author carathomson
 */
public class WizardDetective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Player instance
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setInventory(0.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        //Inventory instance
        Inventory inventoryType = new Inventory();
        
        inventoryType.setInventoryType("Backpack");
        inventoryType.setQuantity(0.00);
        
        String inventoryInfo = inventoryType.toString();
        System.out.println(inventoryInfo);
        
        
        //Game instance
        Game gameOne = new Game();
       
        gameOne.setTime(78.36);
        gameOne.setWinner(" Congrats Billy!!! ");
        gameOne.setLoadGame(68.3);
        gameOne.setSaveGame(79.36);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        //Notebook instance
        Notebook entryInfo = new Notebook();
        
        entryInfo.setClue("Clue 2");
        entryInfo.setRequiredAmount(2);
        
        String notebookInfo = entryInfo.toString();
        System.out.println(notebookInfo);
        
        
        //Backpack instance
        Backpack item = new Backpack();
        
        item.setToolName("gun");
        
        String backpackInfo = item.toString();
        System.out.println(backpackInfo);
        
        
        //Clue instance
        Clue clueDetail = new Clue();
        
        clueDetail.setClueType("Normal");
        clueDetail.setName("Blood on Floor");
        clueDetail.setDiscription("Drops of blood were found the floor outside of room 204.");
        
        String clueInfo = clueDetail.toString();
        System.out.println(clueInfo);
        
        
        //Tool instance
        Tool toolDetail = new Tool();
        
        toolDetail.setToolName("gun");
        toolDetail.setToolAction("Shoot");
        toolDetail.setToolType("weapon");
        
        String toolInfo = toolDetail.toString();
        System.out.println(toolInfo);
        
        
        //Map Instance
        Map mapOne = new Map();
        
        mapOne.setCoordinate(53);
        mapOne.setLocation(456);
        mapOne.setSize(36);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Location Instance
        Location locationOne = new Location();
        
        locationOne.setCoordinate(45);
        locationOne.setName(" Ballroom ");
        locationOne.setScene(23);
        locationOne.setVisited(63);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        //Scene Instance
        Scene sceneOne = new Scene();
        
        sceneOne.setActors(3);
        sceneOne.setClues(4);
        sceneOne.setDescription(" Laboratory ");
        sceneOne.setTools(5);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        //Actor Instance
        Actor actorOne = new Actor();
        
        actorOne.setClues(4);
        actorOne.setConversation(" Hello, how are you? ");
        actorOne.setDescription(" Tall, blonde, mustached ");
        actorOne.setLocation(" Crime Scene ");
        actorOne.setName(" Charles McScootertood ");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
    }
        
 
    
}
