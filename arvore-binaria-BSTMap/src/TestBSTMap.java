import java.util.LinkedList;

public class TestBSTMap {

    public static void main(String[] args) {
       
        BSTMap<String, Integer> map = new BSTMap<String, Integer>();

        map.put("life", 42);
        map.put("Zero", 0);
        map.put("Infinity", 999);

        System.out.println("size = " + map.size());
        System.out.println("Value of \"life\" = " + map.get("Life"));
        System.out.println("Value of \"Data\" = " + map.get("Data"));

        LinkedList<String> keys = map.keys();
        System.out.println("keys = " + keys);

        System.out.println("All (key, value) pairs: ");
        for(String k : map.keys())
            System.out.println("- (" + k + "," + map.get(k) + ")");

            map.put("Life", 22);
            System.out.println("Value of \"Life\" = " + map.get("Life"));

            map.remove("life");
            System.out.println("Value of \"Life\" = " + map.get("Life"));
    }
    
}
