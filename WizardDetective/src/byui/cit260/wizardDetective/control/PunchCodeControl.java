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
public class PunchCodeControl {
    public double calcPunchCodeHack (double input1, double input2, double input3, double input4){
    if (input1 < 0){
        return -1;
    }
    if (input2 < 0){
        return -1;
    }
    if (input3 < 0){
        return -1;
    }
    if (input4 < 0) {
        return -1;
    }
    double password =  input1 + input2 + input3 + input4;
    return password;
    
    }
}
    

