/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

/**
 *
 * @author carathomson
 */
public class SearchAreaControl {
    
    public static double calcSearchArea(double speed, double time){

        if (speed < 25 || speed > 100) {
            return -1;
        }
        
        if (time < 3 || time > 10) {
            return -2;
        }
            
        double distance = (speed * time / 60);
        
        return distance;
 
    }
    
}
