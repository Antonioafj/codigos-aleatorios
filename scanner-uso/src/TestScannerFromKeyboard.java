import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestScannerFromKeyboard {
    public static void main(String[] args) {
        /*
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Number of persons");

        int n = stdIn.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("input name[space]age: ");
            names[i] =stdIn.next();
            ages[i] = stdIn.nextInt();
        }

        for(int i = 0; i < n; i ++)

        System.out.println("name: "+ names [i ]+ " age: " + ages[i]);
        */

        try {
            File file = new File("./SMPRE FORAM DGÇDS.txt");
            Scanner fileIn = new Scanner(file);
            while (fileIn.hasNextLine()) {
                System.out.println(fileIn.nextLine());
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

