public class App {
    public static void main(String[] args) throws Exception {

        User antonio = new User("Antonio", "Alves");
        User cesar = new User("Cesar", "Augusto");
      
        antonio.setCount(1);
        antonio.setCount(1);
        antonio.setCount(1);
        
        cesar.setCount(2);
        cesar.setCount(2);
        cesar.setCount(2);
        
        System.out.println(antonio.getCount());
        System.out.println(cesar.getCount());

        

    }

}
