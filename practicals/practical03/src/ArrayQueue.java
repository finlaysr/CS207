/**
 * This class is for completion in practical 3 part i
 */
public class ArrayQueue<E> implements QueueADT<E> {
  protected E[] Q; // Q will refer to the array
  protected int f; // front - array index of element at front of queue
  protected int r; // rear - array index of where next element added will be placed
  protected int N; // array capacity

  /**
   * Constructor for objects of class ArrayQueue.
   * In practical 3i no change need be made to this constructor.
   * With this constructor a queue can hold up to 3 (i.e.N-1) items when
   * using the approach described in lectures.
   */
  public ArrayQueue() {
    N = 4;
    Q = (E[]) new Object[N];
    f = 0;
    r = 0;
  }

  /**
   * @throws FullQueueException
   */
  public void enqueue(E element) {
    if (size() == N - 1) {
      throw new FullQueueException("Queue is full");
    } else {
      Q[r] = element;
      r = (r + 1) % N;
    }
  }

  /**
   * @throws EmptyQueueException
   */
  public E dequeue() {
    E removed = front();
    f = (f + 1) % N;
    return removed;
  }

  /**
   * @throws EmptyQueueException
   */
  public E front() {
    if (isEmpty()) {
      throw new EmptyQueueException("Queue is empty");
    } else {
      return Q[f];
    }
  }

  public int size() {
    return (r - f + N) % N;
  }

  public boolean isEmpty() {
    return (f == r);
  }
}
