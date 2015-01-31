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
public class Tool implements Serializable{
    
    private String toolName;
    private String toolAction;
    private String toolType;

    public Tool() {
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getToolAction() {
        return toolAction;
    }

    public void setToolAction(String toolAction) {
        this.toolAction = toolAction;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.toolName);
        hash = 53 * hash + Objects.hashCode(this.toolAction);
        hash = 53 * hash + Objects.hashCode(this.toolType);
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
        final Tool other = (Tool) obj;
        if (!Objects.equals(this.toolName, other.toolName)) {
            return false;
        }
        if (!Objects.equals(this.toolAction, other.toolAction)) {
            return false;
        }
        if (!Objects.equals(this.toolType, other.toolType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tool{" + "toolName=" + toolName + ", toolAction=" + toolAction + ", toolType=" + toolType + '}';
    }

    
    
    
    
}
