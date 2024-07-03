public class NumeroCompuesto {
    public static void main(String[] args) {
        
        
        System.out.println(esCompuesto(28) ? " Sí, El numero es un numerto compueste!": "No es compueto, es primo");

        System.out.println(esCompuesto(19) ? " Sí, El numero es un numerto compueste!": "No es compueto, es primo");
        
        }
    
    static boolean esCompuesto (int n){
        if (n == 1)
            System.out.println("falso");
        if (n == 3)
         System.out.println("falso"); 
        
      if (n % 2 == 0 || n % 3 == 0) 
      return true;
    
      for( int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            
        return true;
    return false;
    }
}


