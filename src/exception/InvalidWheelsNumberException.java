package exception;

public class InvalidWheelsNumberException extends RuntimeException{
    public InvalidWheelsNumberException(String message){
        super(message);
    }
}
