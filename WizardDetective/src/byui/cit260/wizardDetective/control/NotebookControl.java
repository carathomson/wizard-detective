/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import static byui.cit260.wizardDetective.control.NotebookControl.arraySort;
import byui.cit260.wizardDetective.model.Clue;
import byui.cit260.wizardDetective.view.View;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class NotebookControl extends View {

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

    public static void printNotebook(String filePath) {
       Clue[] clues = clue.getDescription;
        this.console.println("");
    }

    @Override
    public void display() {
        this.console.println("================================"
                + "\nWhat do you want to look at?"
                + "\n---------------------------"
                + "\nN - clues in your notebook"
                + "\nB - tools in your backpack"
                + "\n================================");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
/**
    public void display() {
       for (Clue[] x : arraySort) {
           for (Clue y : x) {
         System.out.println(y);
            }
        
        Clue[] originalClueList = WizardDetective.getCurrentGame().getClue();
        Clue[] clueList = NotebookControl.arraySort(originalClueList);
        for (Clue x : clueList) {
            System.out.println(x.getDescription());
        }
  
**/
