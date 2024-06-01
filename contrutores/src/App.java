public class App {
    public static void main(String[] args) {
        
        User[] users = new User[]{

            new User("josé", "noob"),
            new User("Maria", "Josefina"),
            new User("Pira", "Salvado"),
            new User("jeferson", "nunes"),
            new User("Chitao", "xororo"),
            new User ("caterine", "zetajones")         

        };
        
        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());

        System.out.println(users[5].getFirstName());
        System.out.println(users[5].getLastName());
        
    }
}
