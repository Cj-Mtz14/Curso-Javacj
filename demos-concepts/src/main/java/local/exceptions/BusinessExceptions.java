package local.exceptions;

//Checked exceptions

public class BusinessExceptions extends Exception {

    private static String generateMessage(ErrorCodes code, String message) {
        return.//aun no se termina
    }


    ErrorCodes code;

    BusinessExceptions(ErrorCodes code, String message) {
        super(message);
        this.code = code;
        
    }

    BusinessExceptions(ErrorCodes code, String message, Throwable cause) {
        super(message,cause);
        this.code = code;
    }

    private String generateMessage() {
        return code + " - " + getMessage();
        

    }

}

enum ErrorCodes {
    ERROR_EVEN("No se admiten números pares"), 
    ERROR_NEGATIVE("No se admiten números negativos");


    String message;

    ErrorCodes(String message) {
        this.message = message;

    }

@Override
public String toString() {
    return this.message;
}

}



