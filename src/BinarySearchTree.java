public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;

    BinarySearchTree(){
        this.root = null;
    }
    public void addToTree(E element){
        TreeNode<E> node = new TreeNode<>(element);
        if(this.root == null){
            this.root = node;
        } else {
            this.formTree(this.root,node);
        }
    }

    private TreeNode formTree(TreeNode rootNode, TreeNode newNode){
        if(rootNode == null){
            return newNode;
        }
        if(newNode.getData().compareTo(rootNode.getData()) <= 0){
            rootNode.setLeft(formTree(rootNode.getLeft(),newNode));
        }
        if(newNode.getData().compareTo(rootNode.getData()) > 0){
            rootNode.setRight(formTree(rootNode.getRight(),newNode));
        }
        return rootNode;
    }

    public void printInOrder(){
        if(this.root == null){
            System.out.println("Tree is empty");
        } else{
            this.inOrder(this.root);
        }
    }

    private void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());
        }
    }

    public int treeHeight(){
        if(this.root == null){
            System.out.println("Tree Empty");
            return 0;
        } else{
            return height(this.root);
        }
    }
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(height(node.getLeft()),height(node.getRight()))+1;
    }
}
