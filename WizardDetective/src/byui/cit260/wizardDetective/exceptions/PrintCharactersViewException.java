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
public class PrintCharactersViewException extends Exception {

    public PrintCharactersViewException() {
    }

    public PrintCharactersViewException(String message) {
        super(message);
    }

    public PrintCharactersViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrintCharactersViewException(Throwable cause) {
        super(cause);
    }

    public PrintCharactersViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
