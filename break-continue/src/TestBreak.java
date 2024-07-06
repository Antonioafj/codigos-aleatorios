public class TestBreak {
    public static void main(String[] args) {
        /*for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 10; j++ ){
                if (j == 5) break;
                    
                System.out.println("ciclo j = " + j + "| i = " + i);
            }

            System.out.println("Ciclo i = " + i);
        }
            */

        for(int i =1; i <= 4; i++){
            System.out.println("[antes] i = " + i);
            if (i > 2) continue;
            
            System.out.println("[depois] i =" + i);
    
        }
    }   
}