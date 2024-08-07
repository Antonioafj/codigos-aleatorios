/**
 * DNode
 */
public class DNode<T> {
    private T value;
    private DNode<T> prev;
    private DNode<T> next;
    
    DNode(T v, DNode<T> p, DNode<T> n) {
        value = v;
        prev = p;
        next = n;
    }

    public T getValue() {
        return value;
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setValue(T v) {
        value = v;
    }   

    public void setPrev (DNode<T> p){
        prev = p;
    }

    public void setNext(DNode<T> n) {
        next = n;
    }

}