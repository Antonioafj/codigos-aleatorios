public class TestPoint {
    public static void main(String[] args) throws Exception {

        Point.showNumPoints();

        Point point1 = new Point();
        point1.show();
        Point point2 = new Point(42, 13);
        point2.show();

        Point.showNumPoints();

        Point point3 = new Point(1, 1);
        Point point4 = new Point(1, 1);


        System.out.println(point3==point4);
        
        Point.showNumPoints();
    }
}
