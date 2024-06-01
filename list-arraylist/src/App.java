import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();

            int i = 0;
            while (i < 5) {
                User actual = new User("Nome", "Sobrenome");
                users.add(actual);
                i++;
                
            }       

        
        
        System.out.println(users.get(1).getFirstName());
        System.out.println(users.get(1).getLastName());

        User user5 = new User("Nome 5", "Sobrenome 5");
        users.add(user5);

        System.out.println(users.get(5).getFirstName());
        System.out.println(users.get(5).getLastName());
        
    }
}
