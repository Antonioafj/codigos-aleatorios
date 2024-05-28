public class Calculate {
    public static void main(String[] args) {
        double x = Integer.parseInt(args[1]);
        double y =  Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
                        
        } else if (args[0].equals("subtrair")) {
            minus(x, y);   
        
        } else if (args[0].equals("dividir")) {
            divide(x, y);
        
        } else if (args[0].equals("multi")) {
            multiple(x, y);
        
        } else 
            System.out.println("Nenhuma instrução definida");
        
    }
    
    static void sum(double x, double y ){
        System.out.println(x + y);
    }
    static void minus(double x, double y ){
        System.out.println(x - y);
    }
    static void divide(double x, double y ){
        System.out.println(x / y);
    }
    static void multiple(double x, double y ){
        System.out.println(x * y);
    }

}
