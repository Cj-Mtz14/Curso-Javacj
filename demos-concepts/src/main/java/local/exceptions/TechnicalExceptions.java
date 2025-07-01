package local.exceptions;

//esto será una runtime exceptions.

public class TechnicalExceptions extends RuntimeException{

    TechnicalExceptions(String message) {
        super(message);
    }

    TechnicalExceptions(String message, Throwable cause) {
        super(message, cause);
    }

}
