/**
 * MyQueue
 */
public interface MyQueue <T> {

    public void enqueue(T v);
    public T dequeue();

    public T first();
    public int size();
    public boolean isEmpty();
}