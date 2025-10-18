public class MyArrayList<E> implements ListADT<E> {
  private E[] data;
  private int size;
  private static final int DEFAULT_CAPACITY = 100;
  private int capacity;

  // No-argument constructor
  public MyArrayList() {
    this(DEFAULT_CAPACITY);
  }

  // constructor with specific capacity
  @SuppressWarnings("unchecked")
  public MyArrayList(int capacity) {
    data = (E[]) new Object[capacity];
    this.capacity = capacity;
    size = 0;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void expandCapacity() {
    capacity *= 2;
    E[] largerData = (E[]) new Object[capacity];
    java.lang.System.arraycopy(data, 0, largerData, 0, size);
    data = largerData;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    if (size == 0) {
      throw new EmptyListException("The list is empty now!");
    }
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
    if (size == capacity) {
      expandCapacity();
    }
    for (int j = size - 1; j >= i; j--) {
      data[j + 1] = data[j];
    }
    data[i] = x;
    size++;
  }

  public E delete(int i) {
    if (i < 0 || i > size) {
      throw new IndexOutOfBoundsException();
    }
    E deleted = data[i];
    for (int j = i; j < size; j++) {
      data[j] = data[j + 1];
    }
    size--;
    return deleted;
  }

  public void display() {
    if (size == 0) {
      System.out.print("The list is empty now, no elements to be displayed!");
    }
    for (int i = 0; i < size; i++) {
      System.out.print(data[i] + " \n");
    }
  }

  public int search(E x) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(x)) {
        return i;
      }
    }
    return -1;
  }

}
