import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int[] v = new int[4];
        v[0] =2;

        int[] primes = {2, 3, 5, 7, 11, 13};
        System.out.println(primes);
        System.out.println(Arrays.toString(primes));

        int[] a = {1, 2, 3, 4, 5};
        int [] b = { 1, 2, 3, 4, 5};
        if(Arrays.equals(a, b))
            System.out.println("Same contens");

        int[] c = addArrays(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] addArrays(int[] u, int[] v){
        int[] res = new int[u.length];
        for(int i = 0; i < u.length; i++)
            res[i] = u[i] + v[i];
        return res;
    }
}
