/**
 * BTNode
 */
public class BTNode<T> {

    private T value;
    private BTNode<T> left;
    private BTNode<T> right;

    BTNode(T v, BTNode<T> l, BTNode<T> r) {
        value = v;
        left = l;
        right = r;
    }

    public T getValue(){
        return value;
    }

    public BTNode<T> getLeft() {
        return left;
    }

    public BTNode<T> getRight() {
        return right;
    }    

    public void setValue(T v) {
        value = v;
    }

    public void setLeft(BTNode<T> l) {
        left = l;
    }
    public void setRight(BTNode<T> r) {
        right = r;
    }
}

