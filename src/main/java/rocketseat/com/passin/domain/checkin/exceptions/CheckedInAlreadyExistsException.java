package rocketseat.com.passin.domain.checkin.exceptions;

public class CheckedInAlreadyExistsException extends RuntimeException{
    public CheckedInAlreadyExistsException(String message){
        super(message);
    }
}
