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
 * @author carathomson
 */
public class Clue implements Serializable{
    
    private String name;
    private String discription;

    public Clue() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.discription);
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
        final Clue other = (Clue) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.discription, other.discription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clue{" + "name=" + name + ", discription=" + discription + '}';
    }
    
    
    
}
