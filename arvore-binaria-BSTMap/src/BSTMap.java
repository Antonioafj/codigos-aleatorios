import java.util.LinkedList;

public class BSTMap<K extends  Comparable<? super K>, V> {
    private BSTMapNode<K, V> root;

    BSTMap() {
        root = null;
    }

    public BSTMapNode<K, V> getRoot() {
        return root;
    }

    public void setRoot(BSTMapNode<K, V> r) {
        root = r;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    public int size() {
        return size(root);
    }

    private int size(BSTMapNode<K, V> n) {
        if(n == null) return 0;
        return 1 + size(n.getLeft()) + size(n.getRight());
    }

    public V get(K key) {
        return get(root, key);
    }

    private V get(BSTMapNode<K,V> n, K key) {
        if (n == null) return null;
        if (key.compareTo(n.getKey()) < 0) return get(n.getLeft(), key);
        if (key.compareTo(n.getKey()) > 0) return get(n.getRight(), key);
        return n.getValue();
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private BSTMapNode<K,V> put(BSTMapNode<K,V> n, K key, V value) {
        if (n==null) 
            return new BSTMapNode<K, V>(key, value, null, null);
        else if (key.compareTo(n.getKey()) < 0)
            n.setLeft(put(n.getLeft(), key, value));
        else if (key.compareTo(n.getKey()) > 0)
            n.setRight(put(n.getRight(), key, value));
        else 
            n.setValue(value);
        return n; 
    }
    
    public boolean remove(K key) {
        if (get(key) == null) return false;
        root = remove(root, key);
        return true;
    }

    private BSTMapNode<K, V> remove(BSTMapNode<K, V> n, K key) {
        if (key.compareTo(n.getKey()) < 0)
            n.setLeft(remove(n.getLeft(), key));
        else if (key.compareTo(n.getKey()) > 0 )
            n.setRight(remove(n.getRight(), key));
        else if (n.getLeft() == null) 
           n = n.getRight();
        else if (n.getRight() == null) 
            n = n.getLeft();
        else{
            BSTMapNode<K, V> max = n.getLeft();
            while (max.getRight() != null) max = max.getRight();
            n.setKey(max.getKey());
            n.setLeft(remove(n.getLeft(), max.getKey()));
        }
        return n;
    }

    public LinkedList<K> keys() {
        LinkedList<K> list = new LinkedList<K>();
        keys(root, list);
        return list;
    }

    private void keys(BSTMapNode<K, V> n, LinkedList<K> l) {
        if (n == null) return;
        keys(n.getLeft(), l);
        l.addLast(n.getKey());
        keys(n.getRight(), l);
    }

}
