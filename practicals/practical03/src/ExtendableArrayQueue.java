import practical1.EmptyListException;

import java.util.Arrays;

/**
 * This class is for completion in Practical 3ii
 */
public class ExtendableArrayQueue<E> implements QueueADT<E> {
  protected E[] Q; // Q will refer to the array
  protected int f; // front - array index of element at front of queue
  protected int r; // rear - array index of where next element added will be placed
  protected int N; // array capacity

  /**
   * Constructor for objects of class ExtendableArrayQueue.
   * In practical 3ii no change need be made to this constructor.
   * With this constructor a queue can initially hold up to
   * 3 (i.e.N-1) items when using the approach described in lectures.
   */
  public ExtendableArrayQueue() {
    N = 4;
    Q = (E[]) new Object[N];
    f = 0;
    r = 0;
  }

  // Complete the method bodies below and add any further methods if
  // appropriate. Many of the method bodies can be the same as in Q3i

  public void enqueue(E element) {
    if (size() == N - 1) {
      extendCapacity();
    }
    Q[r] = element;
    r = (r + 1) % N;

    System.out.println(Arrays.toString(Q));
  }

  /**
   * @throws EmptyQueueException
   */
  public E dequeue() {
    E removed = front();
    Q[f] = null;
    f = (f + 1) % N;
    System.out.println(Arrays.toString(Q));
    return removed;
  }

  /**
   * @throws EmptyQueueException
   */
  public E front() {
    if (r == f)
      throw new EmptyQueueException("The queue is empty");
    else
      return Q[f];
  }

  public int size() {
    return (r - f + N) % N;
  }

  public boolean isEmpty() {
    return f == r;
  }

  public void extendCapacity() {

    E[] largerQ = (E[]) new Object[N * 2];
    // print all
    if (f <= r) {
      java.lang.System.arraycopy(Q, f, largerQ, 0, size());
    } else {
      java.lang.System.arraycopy(Q, f, largerQ, 0, N - f);
      java.lang.System.arraycopy(Q, 0, largerQ, N - 1, r + 1);
    }

    Q = largerQ;
    f = 0;
    r = N - 1;
    N *= 2;

  }
}
