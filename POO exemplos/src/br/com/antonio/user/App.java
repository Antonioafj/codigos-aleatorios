package br.com.antonio.user;
public class App {
    public static void main(String[] args) {

        User userA = new User();

        userA.nome = "Antonio";
        userA.sobrenome = "Junior";
        userA.password = "123456";

        User userB = new User();

        userB.nome = "Carrreiro";
        userB.sobrenome = "capataz";
        userB.password ="321654";

        System.out.println(userA.nome + userA.sobrenome);
        System.out.println(userB.nome + userB.sobrenome + userB.password);
    }

}
