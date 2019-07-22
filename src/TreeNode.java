public class TreeNode<E extends Comparable<E>> {
    private E data;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public TreeNode(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    public E getData() {
        return this.data;
    }

    public TreeNode<E> getLeft() {
        return this.left;
    }

    public TreeNode<E> getRight() {
        return this.right;
    }
}

