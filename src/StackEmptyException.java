package src;

public class StackEmptyException extends Exception{
    public StackEmptyException(String message){
        super(message);
    }
    public StackEmptyException(){
        super("The Stack is empty");
    }
}
