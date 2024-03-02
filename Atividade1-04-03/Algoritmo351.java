import javax.swing.*;

public class Algoritmo351 {
    public static void main(String[] args) {
        String[] nomes = {"ANITA", "GUTO", "LORENA", "JOAO", "FERNANDO"};

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        for (int i = 0; i < nomes.length; i++) {
            painel.add(new JLabel("nome " + (i + 1) + ": "+ nomes[i]));
        }

        painel.add(new JLabel("Digite o número da pessoa: "));
        JTextField nomePessoa = new JTextField(10);
        painel.add(nomePessoa);

        while (true) {
            int resultado = JOptionPane.showConfirmDialog(null, painel, "NOMES", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (resultado == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "O programa será finalizado.");
                return;
            } else if (resultado == JOptionPane.OK_OPTION) {
                String nome = nomePessoa.getText();
                
                try {
                    int numeroNome = Integer.parseInt(nome);

                    JOptionPane.showMessageDialog(null, nomes[numeroNome - 1]);

                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o valor correto.",
                        "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return;
    }
}