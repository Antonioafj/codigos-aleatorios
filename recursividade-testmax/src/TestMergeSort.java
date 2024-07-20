import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMergeSort {

    static void mergeSort(int v[], int start, int end) {
        if (start == end) return;
        int middle = (start + end) / 2;
        mergeSort(v, start, middle);
        mergeSort(v, middle+1, end);
        merge(v, start, middle, end);
    }

    static void merge(int v[], int start, int middle, int end) {
        int aux[] = new int[end-start+1];

        int p1 = start;
        int p2 = middle+1;
        int cur = 0;
        while (p1 <= middle && p2 <= end) {
            if (v[p1] <= v[p2]) aux[cur++] = v[p1++];
            else aux[cur++] = v[p2++];
            }


         while (p1 <= middle) aux[cur++] = v[p1++];
         while (p2 <= end) aux[cur++] = v[p2++]; 
    
        for (int i = 0; i < cur; i++) v[start + i] = aux[i];
        }

    public static void main(String args[]){
        int v[] = {1, 5, 2, 8 , 4 , 3, 7, 6};
        
        System.out.println("Antes do mergeSort: " + Arrays.toString(v));
        mergeSort(v, 0, v.length-1);
        System.out.println("Depois do mergeSort: " + Arrays.toString(v));
    }

}
