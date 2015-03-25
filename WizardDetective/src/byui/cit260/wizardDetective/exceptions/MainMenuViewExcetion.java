/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.wizardDetective.exceptions;

/**
 *
 * @author carathomson
 */
public class MainMenuViewExcetion extends Exception {

    public MainMenuViewExcetion() {
    }

    public MainMenuViewExcetion(String message) {
        super(message);
    }

    public MainMenuViewExcetion(String message, Throwable cause) {
        super(message, cause);
    }

    public MainMenuViewExcetion(Throwable cause) {
        super(cause);
    }

    public MainMenuViewExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
