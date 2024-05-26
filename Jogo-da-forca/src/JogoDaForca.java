import java.util.Scanner;
import java.util.Set;

public class JogoDaForca {

    public static void main(String[] args) {
            iniciarJogo();
    }

    private static void iniciarJogo(){
         
        String palavra = escolherPalavra();
        char[] letras = inicializarLetras(palavra.length());
        int tentativasRestantes = 6;
        
        jogar(palavra, letras, tentativasRestantes);
    }   
    private static String escolherPalavra(){
        String[] palavras = {"java", "progamacaro","computador", "teclado", "monitor"};
        return palavras[(int) (Math.random() * palavras.length)];

    }
        
    private static char[] inicializarLetras(int tamanho){
        char[]letras = new char[tamanho];
        for(int i = 0; i < tamanho; i++){
            letras[i] = '_';
        }
        return letras;
    }

    private static void jogar(String palavra, char[] letras, int tentativasRestantes){
        Scanner scanner = new Scanner(System.in);
        boolean jodoTerminado = false;
        
        while (!jodoTerminado) {
            exibirStatus(letras, tentativasRestantes);
            char chute = obterChute(scanner);

            boolean acertou = verificarChute(palavra, letras, chute);
            if (!acertou) {
                tentativasRestantes--;
            }
            jodoTerminado = verificarFimDoJogo(palavra, letras, tentativasRestantes);

        }

        scanner.close();
    }
    
    private static void exibirStatus(char[] letras, int tentativasRestantes) {
        System.out.println("Palavra: " + new String(letras));
        System.out.println("Tentativas restantes: " + tentativasRestantes);
    }
        
    private static char obterChute(Scanner scanner){
        while (true) {
            try {
                 System.out.println("Adivinhe uma letra: ");
                 String entrada = scanner.nextLine();
                 if (entrada.length() != 1 ) {
                    throw new IllegalArgumentException("Por favor, insira apenas um letra.");
                 }
            return entrada.charAt(0);
        } catch (Exception e){
            System.out.println("Entrada Inválida: " + e.getMessage());
        }
            
    }
    
}
    private static boolean verificarChute(String palavra, char[] letras, char chute, Set<Character> tentativasAnteriores ){
        if (tentativasAnteriores.contains(chute)) {
            System.out.println("Você já tentou essa letra");
            return false;
        }
        tentativasAnteriores.add(chute);
        boolean acertou = false;
        for(int i = 0; i < palavra.length(); i++){
            if (palavra.charAt(i) == chute){
                letras[i] = chute;
                acertou = true;
            }
        }
        return acertou;
    }
    
    private static boolean verificarFimDoJogo(String palavra, char[] letras, int tentativasRestantes){
        if (tentativasRestantes == 0) {
            System.out.println("Você perdeu! A palavra era: " + palavra);
            return true;
        }else if (new String(letras).equals(palavra)){
            System.out.println("Parabéns! Você adicinhou a palavra: " + palavra);
            return true;
        }
        return false;
        }
    }
    
