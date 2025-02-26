package src;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> bookStack= new Stack<>(4);
        Stack<Object> stackO=new Stack<>(6);
        try {
            bookStack.push("Harry Potter");
            bookStack.push("Lord of the Rings");
            bookStack.push("How to keep your Code Simple & Clean");
            System.out.println("The following books are on the book stack: "+bookStack.list());
            System.out.println("The book \"" + bookStack.pop()+"\" was removed from the Stack");
            System.out.println("The first book of the Stack is \""+ bookStack.peek()+"\"");
            System.out.println("The following books are on the book stack: "+bookStack.list());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println("Exception: "+e.getMessage() );
        }
    }

}
