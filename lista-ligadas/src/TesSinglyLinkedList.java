public class TesSinglyLinkedList {
    public static void main(String[] args)  {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        
        System.out.println(list);

        System.out.println("isEmpty?" + list.isEmpty());

        for (int i = 1; i <= 5; i++)
            list.addLast(i);
        System.out.println(list);


        for(int i = 6; i <= 10; i++)
            list.addFirst(i);
        System.out.println(list);

        System.out.println("size =" + list.size());

        list.removeFirst();

        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println("isEmpty?" + list.isEmpty());

        System.out.println("getFirst =" + list.getFirst());
        System.out.println("getLast() =" + list.getLast());
    }
}
