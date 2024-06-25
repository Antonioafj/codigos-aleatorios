import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePessoaScanner {
    public static void main(String[] args) throws Exception {
        
        dadosPessoas();
    }
        public static void dadosPessoas(){

            Scanner sc = new Scanner(System.in);
            Pessoa pessoa;
            List<Pessoa> listaPessoas = new ArrayList<>();
            int opcao = 0;

        do{
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra pessoas");
                System.out.println("Opção 2 - Imprime pessoas cadastradas");
                System.out.println("Opção 0 - Sair do programa");
                System.out.println("__________________________");

                System.out.println("Digite aqui sua opção");
                opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 1) {
             //Cria um novo objeto
                pessoa = new Pessoa();
                
                System.out.println("Digite o código: ");
                pessoa.setCodigo(Integer.parseInt(sc.nextLine()));

                System.out.println("Digite o nome: ");
                pessoa.setNome(sc.nextLine());

                System.out.println("Digite o Endereço: ");
                pessoa.setEndereço(sc.nextLine());

                System.out.println("Digite a idade: ");
                pessoa.setIdade(Integer.parseInt(sc.nextLine()));  

                System.out.println();    

               listaPessoas.add(pessoa);
                }if (opcao == 2) {
                    if (listaPessoas.isEmpty()) {
                        System.out.println("Não existem pessoas cadastradas, pressione uma tecla para continuar");
                        sc.nextLine();
                    } else {
                        System.out.println(listaPessoas.toString());

                        System.out.println("Pressione uma tecla para continua");
                        sc.nextLine();
                     }
                }

            } while (opcao != 0);
            sc.close();
        }    

}
