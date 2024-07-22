public class BSTree<T extends Comparable<? super T>> {
    private BSTNode<T> root;

    BSTree() {
        root = null;
    }
    

    public BSTNode<T> getRoot(){
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    public int numberNodes(){
        return numberNodes(root);
    }

    private int numberNodes(BSTNode<T> n) {
        if (n == null) return 0;
        return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight()); 
    }

    public boolean contains(T value) {
        return contains(root, value);
    }

    public boolean contains(BSTNode<T> n, T value) {
        if (n == null) return false;
        if (value.compareTo(n.getValue()) < 0) 
            return contains(n.getLeft(), value);
        if (value.compareTo(n.getValue()) > 0)
            return contains(n.getRight(), value);
         return true;   
    }

    public boolean insert(T value) {
        if (contains(value)) return false;
        root = insert(root, value);
        return true;
    }

    private BSTNode<T> insert (BSTNode<T> n, T value) {
        if (n == null) 
            return new BSTNode<T>(value, null, null);
        else if (value.compareTo(n.getValue()) < 0);
            n.setLeft(insert(n.getLeft(), value));
         if (value.compareTo(n.getValue()) > 0) 
            n.setRight(insert(n.getRight(), value));
        return n;
    }

    public boolean remove(T value) {
        if (!contains(value)) return false;
        root = remove(root, value);
        return true;
    }

    private BSTNode<T> remove(BSTNode<T> n, T value) {
        if (value.compareTo(n.getValue()) < 0)
            n.setLeft(remove(n.getLeft(), value));
        else if (value.compareTo(n.getValue()) > 0);
            n.setRight(remove(n.getRight(), value));
         if (n.getLeft() == null)
            n = n.getRight();
        else if (n.getRight() == null)
            n = n.getLeft();
        else {
            BSTNode<T> max = n.getLeft();
            while (max.getRight() != null) max = max.getRight(); 
            n.setValue(max.getValue());
            n.setLeft(remove(n.getLeft(), max.getValue()));
    }
    return n;
}

public int depth() {
    return depth(root);
}

private int depth(BSTNode<T> n) {
    if ( n == null) return -1;
    return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
}

public void printPreOrder(){
    System.out.println("PreOrder");
    printPreOrder(root);
    System.out.println();
}

private void printPreOrder(BSTNode<T> n){
    if (n == null) return;
    System.out.println(" " + n.getValue());
    printPreOrder(n.getLeft());
    printPreOrder(n.getRight());
}

public void printInOrder() {
    System.out.println("InOrder: ");
    printInOrder(root);
    System.out.println();
}
 
private void printInOrder(BSTNode<T> n) {
    if (n == null) return;
    printInOrder(n.getLeft());
    System.out.println(" " + n.getValue()); 
    printInOrder(n.getRight());
}

public void printPostOrder() {
    System.out.println("PostOrder: ");
    printPostOrder(root);
    System.out.println();
}

private void printPostOrder(BSTNode<T> n){
    if (n == null) return;
    printPostOrder(n.getLeft());
    printPostOrder(n.getRight());
    System.out.println(" " + n.getValue());
}

public void printBFS() {
    System.out.println("BFS");

    MyQueue<BSTNode<T>> q = new LinkedListQueue<BSTNode<T>>();
    q.enqueue(root);
    while (!q.isEmpty()) {
        BSTNode<T> cur = q.dequeue();
        if (cur != null) {
            System.out.println(" " + cur.getValue());
            q.enqueue(cur.getLeft());
            q.enqueue(cur.getRight());
        }
    }
    System.out.println();
}

public void printDFS() {
    System.out.println("DFS");

    MyStack<BSTNode<T>> q = new LinkedListStack<BSTNode<T>>();
    q.push(root);
    while (!q.isEmpty()) {
        BSTNode<T> cur = q.pop();
        if (cur != null) {
            q.push(cur.getLeft());
            q.push(cur.getRight());        
        }
     }
     System.out.println();
   }
}