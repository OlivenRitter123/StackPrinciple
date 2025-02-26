package src;

public class StackFullException extends Exception{
    public StackFullException(String message) {
        super(message);
    }
    public StackFullException(){
        super("The stack is already full");
    }
}
