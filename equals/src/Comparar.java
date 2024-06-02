import java.util.Arrays;

public class Comparar {
    public static void main(String[] args)  {

       // int[] numbersA = new int[]{1, 2, 3};
        //int[] numbersB = new int[]{1, 2, 3};

       // System.out.println(numbersA == numbersB);
       // System.out.println(numbersA.equals(numbersB));
       // System.out.println(numbersA + " " + numbersB);
       // System.out.println(Arrays.equals(numbersA, numbersB));

       String[] nomes = new String[10];
       Arrays.fill(nomes, "Desconhecidos");

       System.out.println(Arrays.toString(nomes));


    }
}
