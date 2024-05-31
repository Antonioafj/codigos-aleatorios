public class App {
    public static void main(String[] args) {

        User userA = new User();

        userA.setFirstName("Tiago Abuquerque");

        User userB = new User();

        userB.setFirstName("apple incorporation");

        System.out.println(userA.getFirstName());

        System.out.println(userB.getFirstName());

    }
}
