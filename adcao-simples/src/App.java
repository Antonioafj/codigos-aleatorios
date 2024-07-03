import java.util.Scanner;

public class App {
    
    public static void main(String[] args)  {
       Scanner sca= new Scanner(System.in);
       
        int a, b, c;

        System.out.println("Enter first number: ");
        a = sca.nextInt();

        System.out.println("Enter Second number");
        b = sca.nextInt();

        c= addition(a, b);
        System.out.println("Addition of two numbers is: " + c);
    }
    static int addition(int x, int y){
        return x + y;
        

    }
}
          

