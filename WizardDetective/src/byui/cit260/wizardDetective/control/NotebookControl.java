/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

import byui.cit260.wizardDetective.model.Clue;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class NotebookControl {

    public static Clue[] arraySort(Clue[] array) {
        
        Clue[] originalClueList = WizardDetective.getCurrentGame().getClue();
        Clue[] clueList = originalClueList.clone();
        
        int i = 0; 
        for (Clue c: array) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getDescription().compareTo(array[smallestIndex].getDescription()) < 0) {
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

   

    public void display() {
        for (Clue[] x : arraySort) {
            for (Clue y : x) {
            System.out.println(y);
            }
        }
    }
}
