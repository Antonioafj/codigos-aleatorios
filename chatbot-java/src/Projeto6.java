import java.util.Scanner;

public class Projeto6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nuumero de termos que deseja somar: ");
        int n = sc.nextInt();

        double soma = 0;
    

        for(int i =1; i <= n; i++){
            soma += i;
        
    }
    System.out.println("\nA soma dos " + n + " primeiro termos da série é: " + soma);
    sc.close();
  } 
}