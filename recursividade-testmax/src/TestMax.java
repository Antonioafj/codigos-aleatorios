public class TestMax {


    static int maxIt(int v[], int start, int end) {
        int maxSofar = v[start];
        for (int i = start+1; i <=end; i++)
            maxSofar = Math.max(maxSofar, v[i]);
            return maxSofar;
    }

    static int maxRec1(int v[], int start, int end) {
        if (start == end) return v[start];
        int max = maxRec1(v, start+1, end);
        return Math.max(v[start], max);
        
        }

    static int maxRec2(int v[], int start, int end) {
        if (start == end)
        return v[start];
        int middle = (start + end) /2;
        int max1 = maxRec2(v, start, middle);
        int max2 = maxRec2(v, middle+1, end);
        return Math.max(max1, max2);

    }

    public static void main(String[] args) throws Exception {
        int v[] = {1, 5, 2, 8, 4, 3, 7, 6};

        System.out.println("maxIt: " + maxIt(v,0, v.length-1));
        System.out.println("maxRec1: " + maxRec1(v,0, v.length-1));
        System.out.println("maxRec2: " + maxRec2(v,0, v.length-1));

    }
}
