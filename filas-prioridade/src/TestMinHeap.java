import java.util.Comparator;

public class TestMinHeap {
    public static void main(String[] args) throws Exception {

        MinHeap<Integer> h1 = new MinHeap<>(100);

        int[] v1 = {10, 4, 3, 12, 9, 1, 7, 11, 5, 4};

        for(int i =0; i < v1.length; i++)
            h1.insert(v1[i]);

        for(int i = 0; i < v1.length; i++)
            System.out.println(h1.removeMin() + " ");
        System.out.println();    

        MinHeap<String> h2 = new MinHeap<>(100);

        String[] v2 = {"bbb", "aaaaa", "ee", "cccc", "d"};

        for (int i = 0; i < v2.length; i++)
            h2.insert(v2[i]);

        for (int i = 0; i < v2.length; i++)
            System.out.println(h2.removeMin() + " ");
        System.out.println(); 
        
        
        MinHeap<String> h = new MinHeap<>(100, new LengthCompartor());

        for (int i = 0; i < v2.length; i ++)
            h.insert(v2[i]);


        for (int i = 0; i < v2.length; i++)
            System.out.println(h.removeMin() + " ");
        System.out.println();

    }
}


class LengthCompartor implements Comparator<String> {

    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}
