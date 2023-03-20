package treeNode;

public class TreeNode<E extends Object> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
    }
}
