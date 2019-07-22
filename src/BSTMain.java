public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bstObj = new BinarySearchTree<>();
        int[] a = {15,10,11,9,25,20,30,5};
        for(int i:a){
            bstObj.addToTree(i);
        }

        bstObj.printInOrder();
        System.out.println("Height of tree is :"+bstObj.treeHeight());
    }
}
