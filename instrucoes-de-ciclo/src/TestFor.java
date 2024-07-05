import java.util.Scanner;

public class TestFor{
    public static void main(String[] args)  {
        Scanner sca = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sca.nextInt();

        System.out.println("isPrime("+ num +") = " + isPrime(num));
    }
    
    /*public static boolean isPrime(int n){
        
        for(int divisor = 2; divisor < n/2; divisor++)
            if ((n % divisor) == 0) 
                return false;
             return true;
            
    }
             

    public static boolean isPrime(int n){
        int divisor = 2;
        while (divisor*divisor <= n) {
            if ((n % divisor) == 0) 
            return false;
            divisor ++;    
        }
        return true;
       
    }
         */

    public static boolean isPrime(int n){
         int divisor = 2;
         do{
            if ((n % divisor) == 0)
                return false;
            divisor++;
         }while(divisor * divisor <= n);
         return true;
    }    
}
