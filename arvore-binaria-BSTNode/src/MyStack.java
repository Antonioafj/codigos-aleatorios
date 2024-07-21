/**
 * MyStack
 */
public interface MyStack<T> {

        public void push(T v);
        public T pop();

        public T top();
        public int size();
        public boolean isEmpty();
    
}