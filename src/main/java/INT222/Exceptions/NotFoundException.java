package INT222.Exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(long id) {
        super("Could not find product id: " + id);
    }
}
