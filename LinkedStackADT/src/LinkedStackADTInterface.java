public class LinkedStack<E> implements StackADT<E>{
    protected Node<E> top;
    protected int size; // tracking the number of elements in the stack
    public LinkedStack(){
        top = null;
        size = 0;
    }
    public void push(E item){ … }
    public E pop(){ … }
    public E getTop(){ …}
    public int size(){ return size; }
    public boolean isEmpty(){ return top == null;}
}