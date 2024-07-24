import java.util.Comparator;

public class BSTMapNode <K extends Comparable<? super K>, V> {

    private K key;
    private V value;
    private BSTMapNode<K, V> left;
    private BSTMapNode<K, V> right;

    BSTMapNode(K k, V v, BSTMapNode<K,V> l, BSTMapNode<K,V> r) {
        key = k;
        value = v;
        left = l;
        right = r;
    }

    public K getKey() {
        return  key;
    }

    public V getValue() {
        return  value;
    }

    public BSTMapNode<K, V> getLeft() {
        return left;
    }

    public BSTMapNode<K, V> getRight() {
        return right;
    }

    public void setKey (K k) {
        key = k;
    }

    public void setValue(V v) {
        value = v;
    }

    public void setLeft(BSTMapNode<K, V> l) {
        left = l;
    }

    public void setRight(BSTMapNode<K, V> r) {
        right = r;
    }
}
