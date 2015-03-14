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
public enum Tool implements Serializable {
    
    //description
    Flashlight("allows exploration of celler and wine room"),
    Keys("unlocks doors"),
    Gun("shoots stuff"),
    Rope("has many different functions - tie, fast desent, etc..."),
    Cuffs("restrains criminals"),
    Radio("communicate with Chief and Tim");

    //class instance variables
    private final String toolAction;

    Tool(String toolAction) {
        this.toolAction = toolAction;
    }

    public String getToolAction() {
        return toolAction;
    }

    @Override
    public String toString() {
        return "Tool{" + "toolAction=" + toolAction + '}';
    }




}
