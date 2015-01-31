
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizarddetective;

import byui.cit260.wizardDetective.model.Game;
import byui.cit260.wizardDetective.model.Inventory;
import byui.cit260.wizardDetective.model.Notebook;
import byui.cit260.wizardDetective.model.Player;

/**
 *
 * @author carathomson
 */
public class WizardDetective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setInventory(0.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
        Inventory inventoryType = new Inventory();
        
        inventoryType.setInventoryType("Backpack");
        inventoryType.setQuantity(0.00);
        
        String inventoryInfo = inventoryType.toString();
        System.out.println(inventoryInfo);
        
        
        
        Game gameOne = new Game();
        
        gameOne.setTime(9.00);
        gameOne.setWinner("Congrats: Fred Flinstone");
        
        
        Inventory itemOne = new Inventory();
        
//        itemOne.
        
        
        Notebook entryInfo = new Notebook();
        
        entryInfo.setClue("Blood on floor");
        entryInfo.setRequiredAmount(2);
        
        String notebookInfo = entryInfo.toString();
        System.out.println(notebookInfo);
        
    }
        
 
    
}
