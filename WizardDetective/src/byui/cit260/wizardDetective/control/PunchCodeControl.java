/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.control;

/**
 *
 * @author Lynn
 */
public class PunchCodeControl {
    public static double calcPunchCodeHack (double input1, double input2, double input3, double input4){
    if (input1 < 0 || input2 <0 || input3 < 0 || input4 < 0){
        return -1;
    }
   // if inputs equal each other (can't have same number)
    if (input1 == input2 || input1 == input3 || input1 == input4){
        return -2;
    }
    if (input2 == input3 || input2 == input1 || input2 == input4) {
        return -2;
    }
    if (input3 == input2 || input3 == input1 || input3 == input4) {
        return -2;
    }
    if (input4 == input3 || input4 == input1 || input4 == input2) {
        return -2;
    }
   //equation for the punch code
    double password =  input1 + input2 + input3 + input4;
    if (password != 29) {
        return -3;
    }
    if (password == 29){
    return password;
    
    }
return -4;
}
}    

