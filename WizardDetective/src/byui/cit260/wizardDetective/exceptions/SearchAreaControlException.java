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
public class SearchAreaControlException extends Exception {
    

    public SearchAreaControlException() {
    }

    public SearchAreaControlException(String message) {
        super(message);
    }

    public SearchAreaControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchAreaControlException(Throwable cause) {
        super(cause);
    }

    public SearchAreaControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
