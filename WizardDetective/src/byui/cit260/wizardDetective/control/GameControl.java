/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.GameControlException;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class GameControl {
//    private static Game game;

    public static void createNewGame(Player player) 
            throws MapControlException {
        
        Game game = new Game(); //create new game
        WizardDetective.setCurrentGame(game); //save in wizard Detective
        
        game.setPlayer(player); //save player in game
        //game.setClue(createClueList());
        
        //create the inventory list and save in the game
        Backpack backpack = CreateBackpackControl.createBackpack();
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
//        GameControl.game = game;
    }
    
    private Clue[] createClueList(){
        Clue[] clueList = new Clue[6];
        
        return clueList;
    }
    
    public static void saveGame(Game game, String filePath)
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);//write the game object out to the file
            
        }catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getLoadGame(String filePath)
                        throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();//read the game object from file
            
        }catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
            
        }catch(Exception e) {
            throw new GameControlException(e.getMessage());
            
        }
        //close the output file
        WizardDetective.setCurrentGame(game);//save in WizardDetective
        
    }
}
