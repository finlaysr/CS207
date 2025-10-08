class Main {
  public class ArrayListADT<E> implements ListADT<E> {
    private static int CAPACITY = 100;
    private E[] data;
    private int size;

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
      if (size == CAPACITY) {
        throw FullListException("List Full!");
      }
      if (i < 0 || (i > size)) {
        throw new IndexOutOfBoundsException();
      }
      for (int j = size - 1; j >= i; j--) {
        data[j + 1] = data[j];
      }
      data[i] = x;
      size++;
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

  public static void main(String[] args) {

  }

}
