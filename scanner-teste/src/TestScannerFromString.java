import java.util.Scanner;

public class TestScannerFromString {
    public static void main(String[] args)  {
       /*  Scanner strIn = new Scanner("1 - 2 - 3 - 4 - 5");
        strIn.useDelimiter(" - ");
        while ( strIn.hasNextInt()) {

            int n = strIn.nextInt();
            System.out.println(n);

            String str = "JavaTpoint! 13 + 13.0 = 26.0 false";
        Scanner scanner = new Scanner(str);

            System.out.println("String:" + scanner.nextLine());
            scanner.useDelimiter("vaT");
            System.out.println("New delimiter: " + scanner.delimiter());
            scanner.close();

           

            Scanner scan = new Scanner("JavaTpoint/Abhishek/Male/22");
            scan.useDelimiter("/");
            while (scan.hasNext()) {
                System.out.println(scan.next());
                
            }
  
        String input = "1 fish 2 fish red fish blue fish";

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(sc.nextInt());
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.next());

        sc.close();
 */

        Scanner scanner = new Scanner("55 13 + 13.0 = 26.0 77");
        System.out.println("String" + scanner.nextLine());
        System.out.println("Novo delimitador: " + scanner.useDelimiter("abcd"));
        scanner.close();

        }
    }

