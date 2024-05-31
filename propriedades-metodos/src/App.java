public class App {
    public static void main(String[] args) throws Exception {
        
        User userA = new User();

        userA.firstName = "Tiago";
        userA.lastName = "Silva";
        userA.fullName = "Loo";
        
        userA.setLogged(true);

        String fullName = userA.getFullName();

        System.out.println(fullName);
    }
}
