public class LinkedStackADT<E> implements StackADTInterface<E>{
    protected Node<E> top;
    protected int size; // tracking the number of elements in the stack
    public LinkedStackADT(){
        top = null;
        size = 0;
    }

    public void push(E item){
        Node<E> v = new Node<> (item, top);
        top = v;
        size ++;
    }

    public E pop(){
        if (isEmpty()){
            //throw EmptyStackException;
            System.out.println("Stack is empty");
            return null;
        }
        E itemRemoved = top.getElement();
        top = top.getNext();
        size --;
        return itemRemoved;
    }

    public E getTop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return top.getElement();
    }

    public int size(){ return size; }

    public boolean isEmpty(){ return top == null;}
}