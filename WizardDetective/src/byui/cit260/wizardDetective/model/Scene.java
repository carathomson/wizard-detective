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
public class Scene implements Serializable {

    //class instance variables
    private String description;
    private int clues;
    private int tools;
    private int actors;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClues() {
        return clues;
    }

    public void setClues(int clues) {
        this.clues = clues;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    public int getActors() {
        return actors;
    }

    public void setActors(int actors) {
        this.actors = actors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + this.clues;
        hash = 23 * hash + this.tools;
        hash = 23 * hash + this.actors;
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", clues=" + clues + ", tools=" + tools + ", actors=" + actors + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.clues != other.clues) {
            return false;
        }
        if (this.tools != other.tools) {
            return false;
        }
        if (this.actors != other.actors) {
            return false;
        }
        return true;
    }

}
