import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparar {
    public static void main(String[] args)  {

       // int[] numbersA = new int[]{1, 2, 3};
        //int[] numbersB = new int[]{1, 2, 3};

       // System.out.println(numbersA == numbersB);
       // System.out.println(numbersA.equals(numbersB));
       // System.out.println(numbersA + " " + numbersB);
       // System.out.println(Arrays.equals(numbersA, numbersB));

       //String[] nomes = new String[10];
       //Arrays.fill(nomes, "Desconhecidos");

       //System.out.println(Arrays.toString(nomes));

       List<String> nomes = new ArrayList<>();
            
            nomes.add("Nome 3");
            nomes.add("Nome 1");
            nomes.add("Nome 5");
            nomes.add("Nome 2"); 
            nomes.add("Nome 4");  
           
            

            //for(int i = 0; i < nomes.size(); i++){
            //    System.out.println(nomes.get(i));
            //}

            // index = nomes.indexOf("Nome 3");
            //System.out.println(index);

            //System.out.println(nomes.indexOf("Nome 4"));

            //System.out.println(nomes.isEmpty());

           // System.out.println(nomes.contains("Nome 23"));

           // System.out.println(nomes.size());

           // nomes.clear();

            //System.out.println(nomes.size());
            //System.out.println(nomes.isEmpty());

            Collections.sort(nomes);
            System.out.println(nomes);

            for(String name: nomes){
                System.out.println(name);
            }

    }
}
