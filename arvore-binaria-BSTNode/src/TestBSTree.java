/**
 * TestBSTree
 */
public class TestBSTree {

    public static void main(String[] args) {

        BSTree<Integer> t = new BSTree<Integer>();

        int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
        for(int i = 0; i < data.length; i++) t.insert(data[i]);

        System.out.println("numberNodes= " + t.numberNodes());
        System.out.println("depth = " + t.depth());
        System.out.println("contains(2) = " + t.contains(2));
        System.out.println("contains(3) = " + t.contains(3));
        

        t.printPreOrder();
        t.printInOrder();
        t.printPostOrder();

        t.remove(14);
        t.printPreOrder();
        t.printInOrder();
        t.printPostOrder();
    }
}