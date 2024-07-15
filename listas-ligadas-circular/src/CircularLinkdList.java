public class CircularLinkdList <T> {
    private Node<T> last;
    private int size;

    CircularLinkdList(){
        last = null;
        size = 0;
    }

    public int size (){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T getFirst(){
        if (isEmpty()) return null;
        return last.getNext().getValue();

    }

    public T getLast(){
        if (isEmpty()) return null;
            return last.getValue();        
        
    }

    public void rotate() {
        if (! isEmpty()) 
            last = last.getNext();
        }

    public void addFirst( T v) {
            if (isEmpty()) {
                last = new Node<T>(v, null);
                last.setNext(last);
            }else {
                Node<T> newNode = new Node<T> (v, last.getNext());
                last.setNext(newNode); 
            }
            size++;
        }

    public void addLast(T v) {
            addFirst(v);
            last = last.getNext();
    }

    public void removeFirst() {
        if (isEmpty()) return;
        if (size == 1) last = null;
        else last.setNext(last.getNext().getNext()); 
            
    }

    public void remaLast () {
        if (isEmpty())return;
        if (size == 1) {
            last = null;
        } else {
            Node<T> cur = last.getNext();
            for (int i = 0; i < size - 2; i++)
                cur = cur.getNext();
            last = cur;
            last.setNext(last.getNext().getNext());
        }
        size --;
    }
    
    public String toString() {
        String str = "{";
        if (!isEmpty()) {
            Node<T> cur = last.getNext();
            for (int i = 0; i < size; i++) {
                str += cur.getValue();
                if (cur != last) str += ",";
                cur = cur.getNext();
            }
        }
        str += "}";
        return str;
    }
} 

