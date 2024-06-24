import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro Número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a Operação (+, -, /, *)");
        char operator = scanner.next().charAt(0);
        double  resu; 
        String str="Estou estudando java , e o tal do retorno que não entendo?";

        switch (operator) {
            case '+':
                resu= num1 + num2;
                break;

            case '-':
                resu= num1 - num2;
                break;
            
            case '/':
                resu= num1 / num2;
                break;
                
            case '*':
                resu= num1 * num2;
                break;
            
            default:
                System.out.println("Operação invalidade");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + resu);
        
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(23));
        System.out.println(str.charAt(18));
    }
}
