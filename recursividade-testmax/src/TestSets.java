public class TestSets {

    static void sets(int v[]) {
        boolean used[] = new boolean[v.length];
        goSets(0, v, used);
    }

    static void goSets(int cur, int v[], boolean used[]) {
        if (cur == v.length)  {
            System.out.println("Set");
            for(int i = 0; i < v.length; i++)
                if (used[i]) System.out.print(" " + v[i]); 
              System.out.println();    
            }else {
                used[cur] = true;
                goSets(cur+1, v, used);
                used[cur] = false;
                goSets(cur+1, v, used);
            }
            
    }

    public static void main(String[] args) {
        int v[] = {2, 4, 6, 8};

        sets(v);
    }
    
}
