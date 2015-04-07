/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class Notebook implements Serializable {

    private double requiredAmount;
    private ArrayList <Clue> clues = new ArrayList();
    

    public Notebook() {
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    public ArrayList<Clue> getClues() {
        return clues;
    }

    public void setClues(ArrayList<Clue> clues) {
        this.clues = clues;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notebook other = (Notebook) obj;
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notebook{" + "requiredAmount=" + requiredAmount + ", clues=" + clues + '}';
    }

    


}
