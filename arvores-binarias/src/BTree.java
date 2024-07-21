public class BTree<T> {
    private BTNode<T> root;

    BTree() {
        root = null;
    }

    public BTNode<T> getRoot() {
        return root;
    }

    public void setRoot(BTNode<T> r){
        root = r;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int numberNodes() {
        return numberNodes(root);
    }

    private int numberNodes(BTNode<T> n) {
        if (n == null) return 0;
        return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
    }

    public int depth() {
        return depth(root);
    }

    private int depth(BTNode<T> n) {
        if (n == null) return -1;
        return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    public boolean contains(BTNode<T> n, T value) {
        if (n==null) return false;
        if (n.getValue().equals(value)) return true;
        return contains(n.getLeft(), value) || contains(n.getRight(), value);
    }

    public void printPreOrder() {
        System.out.print("PreOrder: ");
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(BTNode<T> n) {
        if (n==null) return; 
        System.out.println(" " + n.getValue());
        printPreOrder(n.getLeft());
        printPreOrder(n.getRight());    
        
    }

    public void printInOrder() {
        System.out.print("InOrder");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BTNode<T> n) {
        if (n==null)return; 
        printInOrder(n.getLeft());
        System.out.println(" " + n.getValue());
        printInOrder(n.getRight());
    }

    public void printPostOrder() {
        System.out.print("PostOrder: ");
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder (BTNode <T> n) {
        if (n==null) return;
        printPostOrder(n.getLeft());
        printPostOrder(n.getRight());
        System.out.print(" " + n.getValue());
    }

public void printBFS() {
        System.out.println("BFS: ");

        MyQueue<BTNode<T>> q = new LinkedListQueue<BTNode<T>>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            BTNode<T> cur = q.dequeue();
            if (cur != null) {
                System.out.print(" " + cur.getValue());
                q.enqueue(cur.getLeft());
                q.enqueue(cur.getRight());
            }
        }

        System.out.println();
    }

public void printDFS() {
    System.out.println("DFS");

    MyStack<BTNode<T>> q = new LinkedListStack<BTNode<T>>();
    q.push(root);
    while (!q.isEmpty()) {
        BTNode<T> cur = q.pop();
        if (cur != null) {
            System.out.println(" " + cur.getValue());
            q.push(cur.getLeft());
            q.push(cur.getRight());
        }       
    }
    System.out.println();
    }
}