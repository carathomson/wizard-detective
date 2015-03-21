/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.MapControlException;
import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Backpack;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.model.Game;
import byui.cit260.wizardDetective.model.Inventory;
import byui.cit260.wizardDetective.model.Map;
import byui.cit260.wizardDetective.model.Notebook;
import byui.cit260.wizardDetective.model.Player;
import byui.cit260.wizardDetective.model.Tool;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class GameControl {

    public static void createNewGame(Player player) 
            throws MapControlException {
        Game game = new Game(); //create new game
        WizardDetective.setCurrentGame(game); //save in wizard Detective
        
        game.setPlayer(player); //save player in game
        //game.setClue(createClueList());
        
        //create the inventory list and save in the game
        Backpack backpack = BackpackConstructionControl.createBackpack();
        game.setBackpack(backpack);
        
        Notebook notebook = new Notebook();
        notebook.setRequiredAmount(6);
        game.setNotebook(notebook);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); 
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
        
        Actor[] actor = ActorControl.createActor();
        game.setActor(actor);
    }
    
    private Clue[] createClueList(){
        Clue[] clueList = new Clue[6];
        
        return clueList;
    }



}
