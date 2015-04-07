/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.exceptions.GameControlException;
import static byui.cit260.wizardDetective.control.NotebookControl.arraySort;
import byui.cit260.wizardDetective.model.Actor;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.model.Location;
import byui.cit260.wizardDetective.model.Notebook;
import byui.cit260.wizardDetective.view.View;
import java.util.ArrayList;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class NotebookControl {

    public static Clue[] arraySort(Clue[] array) {
        
        
        int i = 0; 
        for (Clue c: array) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getDescription().compareToIgnoreCase(array[smallestIndex].getDescription()) < 0) {
                    smallestIndex = j;
                }
            }
            Clue temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
            i++;
        }
        return array;
    }
    
    public static void addClue(Clue clue, Notebook notebook) 
            throws GameControlException{
        //if clue is null then return
        if (clue == null){
            return;
        }
        //if notebook is null then throw game control exception
        if (notebook == null) {
            throw new GameControlException("notebook does not exist");
        }
        
        
        //get list of clues from notebook
        ArrayList <Clue> clues = notebook.getClues();
        //add ActorControl.clue to notebook
        clues.add(clue);
    }
}