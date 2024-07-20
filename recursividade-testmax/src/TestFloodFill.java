import java.util.Scanner;

public class TestFloodFill {
    static int rows;
    static int cols;
    static char m[][];
    static boolean visited[][];

    static int t(int y, int x) {
        if (y < 0 || y >= rows || x < 0 || x >= cols)  return 0;
        if (visited[y][x]) return 0;
        if (m[x][x] == '.') return 0; 
        int count = 1;
        visited[y][x] = true;
        count += t(y - 1, x);
        count += t(y + 1, x);
        count += t(y, x +1);
        count += t(y, x-1);
        return count;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            rows = in.nextInt();
            cols = in.nextInt();
            m = new char [rows][cols];
            visited = new boolean[rows][cols];
            for (int i = 0; i < rows; i++)
                m[i] = in.next().toCharArray();
        
        System.out.printf("t(0,0) = %d\n", t(0,0));
        System.out.printf("t(2,5) = %d\n", t(2,5));
        System.out.printf("t(4,0) = %d\n", t(4,0));

    }
    
}
