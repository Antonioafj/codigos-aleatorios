import java.util.Scanner;


public class TesteIfElse {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        int testescore;
        char grade;
        int i = 0;
      
      do{
        
        System.out.println("Digite o escore: ");
        testescore = teste.nextInt();

        if (testescore >= 90) {
            grade = 'A';
        }else if (testescore >= 80) {
            grade = 'B';
        }else if (testescore >= 70) {
            grade = 'C';
        }else if (testescore >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        i++;
        }while(i < 4);
        
    }
    
}

