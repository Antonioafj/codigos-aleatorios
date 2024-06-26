import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String username = "admin";
        String password = "password";

        System.out.println("Digite o nome de usuário: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)){
            System.out.println("Login bem sucedido.");
        }else {
                System.out.println("Nome de usuário ou senha incorretos.");
        }
    
        scanner.close();
    }
}
