public class TestMyQueue {
    public static void main(String[] args) {

        MyQueue<Integer> q = new LinkedListQueue<Integer>();

        for(int i = 1; i <= 8; i++)
            q.enqueue(i);            
        System.out.println(q);

        for (int i = 0; i < 4; i++) {
            int aux = q.dequeue();
            System.out.println("q.dequeue() = " + aux);
        }
        System.out.println(q);

        System.out.println("q.size() = " + q.size());
        System.out.println("q.isEmpty() = " + q.isEmpty());
        System.out.println("q.first() = " + q.first());
    }
}
