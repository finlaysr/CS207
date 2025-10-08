//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {

  Node<Integer> node = new Node<>(0, new Node<>(1, new Node<>(2, new Node<>(3, null))));
  Node<Integer> n = node;
  while (n != null) {
    n.setElement(n.getElement() * 2);
    System.out.println(n.getElement());
    n = n.getNext();
  }
}
