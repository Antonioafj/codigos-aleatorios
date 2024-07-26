/**
 * BSTNode
 */
public class BSTNode <T extends Comparable<? super T>>{

    private T value;
    private BSTNode<T> left;
    private BSTNode<T> right;


    BSTNode(T v, BSTNode<T> l, BSTNode<T> r) {
        value = v;
        left = l; 
        right = r;
    }

    public T getValue() {
        return value;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public BSTNode<T> getRight(){
        return right;
    }

    public void setValue(T v){
        value = v;
    }

    public void setLeft(BSTNode<T> l) {
        left = l;
    }

    public void setRight(BSTNode<T> r) {
        right = r;
    }
}