package ArrayListADT.src;

class Main {
  public static void main(String[] args) {

  }

  public class ArrayListADT<E> implements ArrayListADT.src.ListADT<E> {
    private E[] data;
    private int size;
    private static int CAPACITY = 100;

    public ArrayListADT(int CAPACITY) {
      data = (E[]) new Object[CAPACITY];
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    public E get(int i) {
      if (size == 0) {
        throw EmptyListException();
      }
      if ((i < 0) || (i >= size)) { // incorrect position
        throw new IndexOutOfBoundsException();
      }
      return data[i];
    }

    public void set(int i, E x) {
      if ((i < 0) || (i >= size)) { // incorrect position
        throw new IndexOutOfBoundsException();
      }
      data[i] = x;
    }

    @Override
    public void insert(int i, E x) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public E delete(int i) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public int search(E x) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

  }

}
