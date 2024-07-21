public class TestPerm {

    static void permutations(int v[]) {
        boolean used[] = new boolean[v.length];
        int perm[] = new int[v.length];
        goPerm(0, v, used, perm);
    }

    static void goPerm(int cur, int v[], boolean used[], int perm[]){
        if(cur == v.length) {
            for (int i=0; i < v.length; i++)
            System.out.println(v[perm[i]] + " ");
                System.out.println();
        } else {
            for (int i = 0; i<v.length; i++)
            if(!used[i]) {
                used[i] = true; perm[cur] = i;
                goPerm(cur+1, v, used, perm);
                used[i] = false;
            }

        }
    }
    public static void main(String[] args) {
        int v[] = {2, 4, 6, 8};
        
        permutations(v);
    }
    
}
