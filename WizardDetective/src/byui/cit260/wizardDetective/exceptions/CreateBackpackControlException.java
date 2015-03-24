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
public class CreateBackpackControlException extends Exception {
    private int errorcode;
    public CreateBackpackControlException() {
    }

    public CreateBackpackControlException(String message) {
        super(message);
    }
    public CreateBackpackControlException(String message, int errorCode) {
        super(message);
        this.errorcode =errorCode;
    }

    public CreateBackpackControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateBackpackControlException(Throwable cause) {
        super(cause);
    }

    public CreateBackpackControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
