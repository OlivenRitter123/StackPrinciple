package src;

public class Stack<T>{
    private Object[] elements;
    private int size;
    private int capacity;

    public Stack(int capacity){
        this.capacity=capacity;
        this.elements= new Object[capacity];
        this.size=0;
    }
    public Stack(){
        this(10);
    }
    public void push(T element) throws StackFullException{
        if(size >= capacity) {
            throw new StackFullException();
        }
        elements[size++]=element;
    }
    public T pop() throws StackEmptyException{
        if(size<=0) {
            throw new StackEmptyException();
        }
        T element = (T) elements[--size];
        elements[size]=null;
        return element;
    }
    public T peek() throws StackEmptyException{
        if(size<=0) {
            throw new StackEmptyException();
        }
        return (T) elements[size-1];
    }
    public String list(){
        String list="";
        for(int i=0;i<size;i++){
            list += elements[i].toString()+";";
        }
        return list;
    }
}
