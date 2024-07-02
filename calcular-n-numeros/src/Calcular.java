/**
 * Calcular
 */
public class Calcular {

    public static void main(String[] args) {
        
        /*int n=5;
        int result = 0;
        double media;

        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int i;

        for(  i = 0; i < n; i++){
            result = result + a[i];
            
        }    
        media = result/n;

        System.out.printf("A média dos é %.2f \n: " , media);

*/  
        int Matches = 5, totalruns = 20, innings=5, notout = 1;
        double avg;

        avg = totalruns/(innings-notout);
        System.out.println("batting average=" + avg);

    }
}