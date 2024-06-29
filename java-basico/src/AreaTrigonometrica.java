import java.util.Scanner;

public class AreaTrigonometrica {

    double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void areaFoCircle(){
        Scanner s = new Scanner(System.in);
            System.out.println("Enter the radius: ");
            double r = s.nextInt();
            double area =(22*r*r)/7;
        System.out.printf("\nArea of Circle  is %.2f : " , area );
    }
    public void areaOfTriangle(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle: ");
        double b = s.nextDouble();

        System.out.println("Enter the heigt of the Triangle: ");
        double h = s.nextDouble();

        double area = (b*h)/2;
        System.out.println("Area of Triangle is: " + area);

    }
    
    
}
