import java.util.Arrays;

public class TestReverse {

    static void reverse(int v[], int start, int end) {
        if (start >= end) return; 
            int tmp = v[start];
            v[start] = v[end];
            v[end] = tmp;
            reverse(v, start+1, end-1);    
    }

    public static void main(String [] args){

        int v[] = { 2, 4, 6, 8 ,18, 15, -1, 3, 13, 10};

        System.out.println("Antes do reverse" + Arrays.toString(v));
        reverse(v, 0, v.length-1);
        System.out.println("Depois do reverse: " + Arrays.toString(v));
    }
    
}
