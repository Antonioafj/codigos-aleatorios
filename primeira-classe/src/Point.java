public class Point {
    static int npoints = 0;

    int x;
    int y;

    Point(int xvalue, int yvalue) {
        x = xvalue;
        y = yvalue;
        npoints++;
    }

    Point() {
        x = 0;
        y = 0;
        npoints ++;
    }

    void show(){
        System.out.println("(" + x + "," + y + ")");
    }

    static void showNumPoints(){
        System.out.println("npoints = " + npoints);
    }
    
    
}
