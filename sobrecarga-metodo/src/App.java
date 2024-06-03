public class App {
    public static void main(String[] args) throws Exception {

        User userA = new User("Antonio", "Alves");
        User userB = new User("Ferreira", "Junior");

       //System.out.println(userA.output());
        //System.out.println(userA.output(false));

        System.out.println(userA.toString());
        System.out.println(userB.toString());

    }

}
