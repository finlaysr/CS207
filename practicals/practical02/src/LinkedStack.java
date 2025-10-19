public class LinkedStack<E> implements StackADT<E> {
  protected Node<E> top;
  protected int size;

  public LinkedStack() {
    top = null;
    size = 0;
  }

  public boolean isEmpty() {

  }

  public int size() {

  }

  public void push(E item) {

  }

  public E pop() {

  }

  public E getTop() {

  }

  @Override
  public void traverse() {
    if (isEmpty()) {
      throw new EmptyStackException("The stack is empty. No elements can be traversed!");
    }
    Node<E> temp = top;
    System.out.println("Stack elements from top to bottom:");
    while (temp != null) {
      System.out.print(temp.getElement() + " ");
      temp = temp.getNext();
    }
  }
}
