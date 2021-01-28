package org.clover.exception;

import org.clover.constant.ErrorMessage;

/**
 * DESCRIPTION :
 * {@code InvalidInputException} is a class of {@code RuntimeException} which is thrown
 * when there is a mismatch in the inputs given by the user.
 *
 * @author Sachin Jangid
 * @version 0.0.1
 */

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(ErrorMessage message) {
        super(message.getMessage());
    }
}
