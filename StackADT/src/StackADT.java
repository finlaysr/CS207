import java.util.Arrays;

public class StackADT<E> implements StackADTInterface<E>{
    int top;
    E[] S;
    int capacity;
    public StackADT(int capacity) {
        this.capacity = capacity;
        top = -1;
        S = (E[]) new Object[capacity];
// Casting is used in the above as generic arrays cannot be created using new E[]
    }

    public void push(E item){
        if (top == capacity){
            System.out.println("Stack is full");
            return;
        }
        top = top+1;
        S[top] = item;
    }

    public E pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        E temp = S[top];
        top = top-1;
        return temp;
    }

    public E getTop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return S[top];
    }

    public int size(){
        System.out.println(Arrays.toString(S));
        return top + 1;
    }

    public boolean isEmpty(){ return top == -1;}
}