package src;

public class Stack<T> {
    // Array to store the elements of the stack
    private Object[] elements;

    // Variable to keep track of the number of elements in the stack
    private int size;

    // Variable to store the maximum capacity of the stack
    private int capacity;

    // Constructor to initialize the stack with a specific capacity
    public Stack(int capacity) {
        this.capacity = capacity; // Set the capacity
        this.elements = new Object[capacity]; // Initialize the array with the given capacity
        this.size = 0; // Initialize the size to 0 (empty stack)
    }

    // Default constructor that initializes the stack with a default capacity of 10
    public Stack() {
        this(10); // Calls the parameterized constructor with a default capacity of 10
    }

    // Method to push an element onto the stack
    public void push(T element) throws StackFullException {
        if (size >= capacity) {
            // If the stack is full, throw a StackFullException
            throw new StackFullException();
        }
        // Add the element to the stack and increment the size
        elements[size++] = element;
    }

    // Method to pop an element from the stack
    public T pop() throws StackEmptyException {
        if (size <= 0) {
            // If the stack is empty, throw a StackEmptyException
            throw new StackEmptyException();
        }
        // Retrieve the element at the top of the stack, decrement the size, and set the position to null
        T element = (T) elements[--size];
        elements[size] = null;
        return element; // Return the popped element
    }

    // Method to peek at the top element of the stack without removing it
    public T peek() throws StackEmptyException {
        if (size <= 0) {
            // If the stack is empty, throw a StackEmptyException
            throw new StackEmptyException();
        }
        // Return the element at the top of the stack
        return (T) elements[size - 1];
    }

    // Method to list all elements in the stack as a string
    public String list() {
        String list = ""; // Initialize an empty string
        for (int i = 0; i < size; i++) {
            // Append each element's string representation to the list, separated by a semicolon
            list += elements[i].toString() + ";";
        }
        return list; // Return the concatenated string
    }
}