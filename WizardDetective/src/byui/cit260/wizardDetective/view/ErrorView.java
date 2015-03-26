/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.view;

import java.io.PrintWriter;
import wizarddetective.WizardDetective;

/**
 *
 * @author carathomson
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = WizardDetective.getOutFile();
    private static final PrintWriter logFile = WizardDetective.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                    "----------------------------------------------------"
                            + "\n- ERROR - " + errorMessage
                 +"\n----------------------------------------------------"); 
        
        //logError
        logFile.println(className + " - " + errorMessage);
    }
    
}
