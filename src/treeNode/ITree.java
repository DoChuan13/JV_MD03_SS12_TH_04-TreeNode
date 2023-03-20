package treeNode;

public interface ITree<E> {
    boolean insert(E element);

    void inorder();

    int getSize();
}
