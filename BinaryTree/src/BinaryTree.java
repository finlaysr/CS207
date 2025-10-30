public class BinaryTree<E> {
  protected BTNode<E> root;

  public BinaryTree(BTNode<E> root) {
    this.root = root;
  }

  public void preOrder() {
    preOrder(this.root);
  }

  private void preOrder(BTNode<E> curr) {
    if (curr != null) {
      System.out.print(curr.getValue() + " ");
      preOrder(curr.getLeft());
      preOrder(curr.getRight());
    }
  }

  public void inOrder() {
    inOrder(this.root);
  }

  private void inOrder(BTNode<E> curr) {
    if (curr != null) {
      inOrder(curr.getLeft());
      System.out.print(curr.getValue() + " ");
      inOrder(curr.getRight());
    }
  }

  public void postOrder() {
    postOrder(this.root);
  }

  private void postOrder(BTNode<E> curr) {
    if (curr != null) {
      postOrder(curr.getLeft());
      postOrder(curr.getRight());
      System.out.print(curr.getValue() + " ");
    }
  }
}
