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
public class Game implements Serializable {
    //class instance variables

    private double time;
    private String winner;
    private double saveGame;
    private double loadGame;
    
    private Player player;
    private Backpack backpack;
    private Notebook notebook;
    private Actor[] actor;
    private Clue[] clue;
    private Map map;

//DEFALT CONSTRUCTOR
    public Game() {
        clue = Clue.values();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public void setClue(Clue[] list){
        this.clue = list;
    }
    public Clue[] getClue(){
        return this.clue;
    }
    

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public double getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(double saveGame) {
        this.saveGame = saveGame;
    }

    public double getLoadGame() {
        return loadGame;
    }

    public void setLoadGame(double loadGame) {
        this.loadGame = loadGame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.winner);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.saveGame) ^ (Double.doubleToLongBits(this.saveGame) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.loadGame) ^ (Double.doubleToLongBits(this.loadGame) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", winner=" + winner + ", saveGame=" + saveGame + ", loadGame=" + loadGame + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (!Objects.equals(this.winner, other.winner)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saveGame) != Double.doubleToLongBits(other.saveGame)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loadGame) != Double.doubleToLongBits(other.loadGame)) {
            return false;
        }
        return true;
    }

    public void setTool(Tool[] toolList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
