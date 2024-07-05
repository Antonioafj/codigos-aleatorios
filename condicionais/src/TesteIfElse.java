import java.util.Scanner;


public class TesteIfElse {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);
       /*  int testescore;
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
        
        */
        int  month;;
        String monthString;
       do{
         System.out.println("Digite um numero do mês de 1 e 12: " );
        month = mes.nextInt();
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "Mach";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "Octuber";
                break;
                case 11:
                monthString = "November";
                break;
                case 12:
                monthString = "December";
                break;
        
            default:
                monthString ="Invalid Month";
                break;

            }    
            System.out.println(monthString);
        }while(month != 0);

    }
    
}

