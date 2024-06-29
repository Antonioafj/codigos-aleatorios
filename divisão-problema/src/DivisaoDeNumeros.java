import java.util.Scanner;

public class DivisaoDeNumeros {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do dividendo: ");
        double dividendo = input.nextDouble();
        
        System.out.println("Insira o valor do divisor: ");

        double divisor = input.nextDouble();

       
            
            System.out.println("Valor calculador: " + dividendo / divisor);
    }
}

