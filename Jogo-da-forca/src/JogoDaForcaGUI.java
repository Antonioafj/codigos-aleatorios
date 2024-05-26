import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;


public class JogoDaForcaGUI {

    private static String[] palavras = {"java", "programacao", "computador", "teclado", "monitor"};
    private static String palavra = palavras[(int) (Math.random() * palavras.length)];
    private static char[] letras = new char[palavra.length()];
    private static int tentativasRestantes = 6;
    private static JLabel palavraLabel = new JLabel(new String(letras));
    private static JLabel tentativasLabel = new JLabel("Tentativas restantes: " + tentativasRestantes);
    private static JTextField chuteField = new JTextField(1);

    public static void main(String[] args) {
        for(int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }

    JFrame frame = new JFrame("Jogo da Força");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    frame.add(palavraLabel);
    frame.add(tentativasLabel);
    frame.add(chuteField);

    chuteField.addActionListener(new addActionListener() {
        public void actionPerformed(ActionEvent e){
            char chute = chuteField.getText().charAt(0);
            chuteField.setText("");
            boolean acertou = false;

            for(int i = 0; i < palavra.length(); i++){
                if(palavra.charAt(i) == chute){
                    letras[i] = chute;
                    acertou = true;
                }
            }
            if (!acertou) {
                tentativasRestantes--;
            }

            palavraLabel.setText(new String(letras));
            tentativasLabel.setText("Tentativas resstantes: " + tentativasRestantes);
            
            if (tentativasRestantes == 0) {
                JOptionPane.showMessageDialog(frame, "Você Perdeu! A palavra era: " + palavra);
                frame.dispose();
            }else if (new String(letras).equals(palavra)) {
                JOptionPane.showMessageDialog(frame, "Parbéns! Você adivinhou a palavra: " + palavra);  
                frame.dispose();
            }
        }

    });
    frame.setVisible(true);
  }
}

 