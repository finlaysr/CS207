public class MyArrayList<E> implements ListADT<E>{
    private E[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 100;

    // No-argument constructor
    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }

    // constructor with specific capacity
    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty(){


    }

    public int size(){
      


    }

    public E get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == 0) throw new EmptyListException("The list is empty now!");
        return data[index];
    }

    @Override
    public void set(int i, E x) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        data[i] = x;
    }

    @Override
    public void insert(int i, E x) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == DEFAULT_CAPACITY) {
            throw new FullListException("The list is full now");
        }
        for (int j = size - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }
        data[i] = x;
        size++;
    }

    public E delete(int index) {
     





    }

    public void display(){
        if (size == 0) {
            System.out.print("The list is empty now, no elements to be displayed!");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " \n");
        }
    }

    public int search(E x){
   



    }




}


