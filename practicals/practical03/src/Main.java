void main() {
  ArrayQueue<String> q = new ArrayQueue<>();
  q.enqueue("hello");
  q.enqueue("world");

  System.out.println(q.dequeue());

  q.enqueue("aaksjjfb");

  System.out.println(q.dequeue());
  System.out.println(q.size());

}
