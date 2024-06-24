import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) throws Exception {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Digite a temperatura em Celsius: ");
           double celsius = scanner.nextInt();
           scanner.close();
           
           double fahrenheit = (celsius * 9/5 + 32);

        
           System.out.println(celsius +" graus Celsius é igual a " + fahrenheit+ " graus Fahrenheit. ");
    }
}
