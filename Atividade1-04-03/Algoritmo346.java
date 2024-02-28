import javax.swing.JOptionPane;

public class Algoritmo346 {
    public static void main(String[] args) {
        String frase;

        String msg = "Escolha uma opção: \n\n" +
        "1 - Imprime o comprimento da frase\n" +
        "2 - Imprime os dois primeiros e os dois últimos caracteres da frase\n" +
        "3 - Imprime a frase espelhada\n" +
        "4 - Termina o algoritmo";

        Object[] opcoes = {"1", "2", "3", "4"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(
            null,
            msg,
            "MENU",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoes,
            opcoes[0]
            );

            switch (escolha) {
                case 0:
                    frase = JOptionPane.showInputDialog("Digite a frase em questão: ").replace(" ", "");
                    JOptionPane.showMessageDialog(null, "O tamanho da frase em questão é: " + frase.length());
                    break;

                case 1:
                    while (true) {
                        frase = JOptionPane.showInputDialog("Digite a frase em questão: ").replace(" ", "");
                        if (frase.length() >= 2) {
                            JOptionPane.showMessageDialog(null, "As duas primeiras letras da frase são: " + frase.charAt(0) + " + " + frase.charAt(1) + 
                            "\nE os dois últimos caracteres da frase são: " + frase.charAt(frase.length() - 2) + " + " + frase.charAt(frase.length() - 1));
                            break;
                        } else JOptionPane.showMessageDialog(null, "A frase digitada é muito curta para a operação selecionada. Tente novamente.");
                    }
                    break;

                case 2:
                    frase = JOptionPane.showInputDialog("Digite a frase em questão: ");
                    
                    String espelhada = "";
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        espelhada += frase.charAt(i);
                    }
                    JOptionPane.showMessageDialog(null, "A frase espelhada é: " + espelhada);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "O algoritmo será finalizado.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}
