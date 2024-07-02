import java.util.Scanner;

public class AdicaoNNumeros {
    public static void main(String[] args) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        int n, sum = 0;


    System.out.println(" Enter how many numbers you want sum");
        n =sc.nextInt();    
        int a[] = new int[n];
        
        System.out.println("Enter the " + n + " numberes ");
            for(int i = 0; i < n; i++)
            {
                System.out.println("enter number " + (i+1)+":");
                a[i] = sc.nextInt();
            }
            for(int i =0; i < n; i++){
                sum+=a[i];
            }

        System.out.println("sum of " +n+ " numbers is = " + sum);
        
        int units = 280;
        
        double billpay = 0;

            if(units < 100){
                billpay = units * 1.2;
            }else if (units < 300) {
                billpay = 100 * 1.2 + (units-100) * 2; 
            }else if (units > 300) {
                billpay = 100 * 1.2 + 200 * 2 + (units - 300) * 3;
            }
            System.out.println("Bill to pay: " + billpay);
            */
   // ANO BISSEXTO
        long a, y, c;
        Scanner sc = new Scanner(System.in);
   
            System.out.println("Enter any calendar year: ");
            y=sc.nextLong();

            if (y != 0) {
                a = (y % 400 == 0) ? (c = 1) : (y % 100 == 0) ? (c = 0) :((y % 4 == 0) ? (c = 1) : (c =0));
                if (a == 1) 
                    System.out.println(y + " is a leap yaer");
                        else
                    System.out.println(y + " is not a leap year");
            }
            else
            System.out.println("year zero does not exist ");
   
        }   
                    
}
