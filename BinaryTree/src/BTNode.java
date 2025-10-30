public class BTNode<E> {
  private E value;
  private BTNode<E> left;
  private BTNode<E> right;

  public BTNode() {
    this(null, null, null);
  }

  public BTNode(E value, BTNode<E> left, BTNode<E> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public E getValue() {
    return value;
  }

  public BTNode<E> getLeft() {
    return left;
  }

  public BTNode<E> getRight() {
    return right;
  }

  public void setValue(E value) {
    this.value = value;
  }

  public void setLeft(BTNode<E> left) {
    this.left = left;
  }

  public void setRight(BTNode<E> right) {
    this.right = right;
  }

}
