import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) throws Exception {
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        while ((sc.hasNext())) {
            i++;
            System.out.println("Token: " + i + " " + sc.next());
        }
        sc.close();
    }
}
