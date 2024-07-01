import java.util.Scanner;

public class AreaTrigonometrica {
    Scanner s = new Scanner(System.in);
    double area;
    double b;
    double h;
    double r;
    double a;
    double l;
    double perimeter;
    double volume;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void areaFoCircle(){
            System.out.println("Enter the radius: ");
           r = s.nextInt();
           area =(22*r*r)/7;
        System.out.printf("\nArea of Circle  is %.2f : " , area );
    }
    public void areaOfTriangle(){
        System.out.println("Enter the width of the Triangle: ");
         b = s.nextDouble();

        System.out.println("Enter the heigt of the Triangle: ");
        h = s.nextDouble();

        double area = (b*h)/2;
        System.out.println("Area of Triangle is: " + area);

    }

    public void areaOfisocelesTriangle(){
        System.out.println("Enter the length of same sided");
        a = s.nextDouble();

        System.out.println("Enter the side2 of the Trianglo");
        b = s.nextDouble();
        double area=(b/4)*Math.sqrt((4*a*a)-(b*b));

        System.out.println("Area of Isosceles Triangle is: " + area);
    }

    public void areaofEquilateralTriangle(){
        System.out.println("Enter side of the Triangle");
        a = s.nextDouble();
        area = (Math.sqrt(a)/4)*(a*a);
        System.out.println("Area of Triangle is: " + area);

    }
    public void areaOfRetangle(){
        System.out.println("Enter the length: ");
         l = s.nextDouble();
         System.out.println("Enter the breath: ");
         b = s.nextDouble();   
        double area = l*b;
        System.out.println("Area of Rectanle is: "+ area);
    }

    public void perimeterOfRectangle(){
        System.out.println("Enter the length of the Rectangle");
        l = s.nextDouble();
        System.out.println("Enter the width of the Rectangle");
        b = s.nextDouble();

        perimeter = 2*(l+b);

        System.out.println("pperimeter of Rectangle is: " + perimeter);


    }

    public void perimeterOfSquare(){

        System.out.println("Enter the side of the square: ");
        a = s.nextDouble();
        perimeter = 4*a;
        System.out.println("Perimeter of Square is : " + perimeter);

    }

    public void volumeOfSphere(){

        System.out.println( "Enter the radius of sphere: ");
        r = s.nextDouble();
        volume = (4*22*r*r*r)/(3*7);
        System.out.println("Volume is: " + volume);
    }

}
