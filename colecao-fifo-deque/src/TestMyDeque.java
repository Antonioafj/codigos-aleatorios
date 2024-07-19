public class TestMyDeque {
    public static void main(String[] args)  {

        MyDeque<Integer> q = new LinkedListDeque<Integer>();

        for (int i = 1; i <= 4; i++)
            q.addFirst(i);
        
        for(int i = 5; i <= 8; i++)
            q.addLast(i);    
        System.out.println(q);

        System.out.println("q.removeFirst() = " + q.removeFirst());
        System.out.println("q.removeLast() = " + q.removeLast());

        System.out.println("q.size() = " + q.size());
        System.out.println("q.isEmpty() =" + q.isEmpty());
        System.out.println("q.first() = " + q.first());
        System.out.println("q.last() = " + q.last());
    }
}
