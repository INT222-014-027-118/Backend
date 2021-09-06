package INT222.Exceptions;

public class SameProductNameException  extends RuntimeException{

    public SameProductNameException(String name) {
        super("Product: " + name + " has all ready exist in the table");
    }
}
