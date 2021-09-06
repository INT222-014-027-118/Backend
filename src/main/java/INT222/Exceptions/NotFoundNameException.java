package INT222.Exceptions;

public class NotFoundNameException extends RuntimeException{


    public NotFoundNameException(String name) {
        super("Could not find product name: " + name);
    }
}
