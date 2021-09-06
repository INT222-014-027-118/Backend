package INT222.Exceptions;

public class NotFoundImageException extends RuntimeException{

    public NotFoundImageException(String name) {
        super("Could not find image name: " + name);
    }
}
