public class App {
    public static void main(String[] args) throws Exception {

        User userA = new User("Antonio", "Alves");
        User userB = new User("Antonio", "Alves");

       //System.out.println(userA.output());
        //System.out.println(userA.output(false));

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));

    }

}
