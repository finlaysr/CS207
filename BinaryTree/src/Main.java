
void main() {
  BTNode<Character> btnode = new BTNode<>('A',
      new BTNode<>('B',
          new BTNode<>('D',
              null, new BTNode<>('G', null, null)),
          null),
      new BTNode<>('C',
          new BTNode<>('E', null, null),
          new BTNode<>('F',
              new BTNode<>('H', null, null), null)));

  BinaryTree<Character> tree = new BinaryTree<>(btnode);
  System.out.print("PreOrder:  ");
  tree.preOrder();
  System.out.print("\nInOrder:   ");
  tree.inOrder();
  System.out.print("\nPostOrder: ");
  tree.postOrder();

}
