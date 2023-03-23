package ProgramEngineering.CustomizedException;

public class NumberException extends Exception {

    private final static String ERROR_MESSAGE = "You inputted an invalid number";

    public NumberException() {
        super(ERROR_MESSAGE);
    }
}
