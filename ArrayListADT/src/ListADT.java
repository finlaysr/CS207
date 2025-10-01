package ArrayListADT.src;

public interface ListADT<E> {
  public boolean isEmpty();

  public int size();

  public E get(int i);

  public void set(int i, E x);

  public void insert(int i, E x);

  public E delete(int i);

  public int search(E x);
}
