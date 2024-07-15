public class TestCircularLinkedList {
    public static void main(String[] args) throws Exception {

        CircularLinkdList<Character> list = new CircularLinkdList<>();

        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
        list.addLast('D');


        System.out.println("8 rondas round-robin");
        for(int i = 1; i <= 8; i++){
            System.out.println(i + ": " + list);
            list.rotate();
        }

        list.addLast('E');
        System.out.println("addLast ('E'): " + list);
        list.remaLast();
        System.out.println("removeLast(): " + list);

        list.addFirst('F');
        System.out.println("addFirst ('F')" + list);
        list.removeFirst();
        System.out.println("removeFirst(): " + list);
    }
}
