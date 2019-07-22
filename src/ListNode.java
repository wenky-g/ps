public class ListNode<E> {
    private E data;
    private ListNode<E> prevNode;
    private ListNode<E> nextNode;

    ListNode(){
        this.data = null;
        this.nextNode = null;
        this.prevNode = null;
    }
    ListNode(E data){
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }
    public void setData(E data){
        this.data = data;
    }
    public void setPrevNode(ListNode<E> prevNode){
        this.prevNode = prevNode;
    }
    public void setNextNode(ListNode<E> nextNode){
        this.nextNode = nextNode;
    }

    public E getData() {
        return this.data;
    }
    public ListNode<E> getPrevNode(){
        return this.prevNode;
    }
    public ListNode<E> getNextNode(){
        return this.nextNode;
    }
}
