package br.com.antonio;
public class App {
    public static void main(String[] args) throws Exception {
        

        Account account = new Account("0001", "1234", "é brincadeira O loco bicho ");

        boolean succeed = account.withDraw(355);
        if (!succeed) {
            System.out.println("Você não tem saldo suficiente para sacar");
        }

        account.deposit(150);
        account.deposit(150);
        account.deposit(150);

        
        if (!account.withDraw(300)) {
            System.out.println("Você não tem saldo suficiente para sacar");
        }

        if (!account.withDraw(300)) {
            System.out.println("Você não tem saldo suficiente para sacar");
        }

        System.out.println(account);
    }
}
