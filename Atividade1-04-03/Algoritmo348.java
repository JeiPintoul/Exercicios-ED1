import javax.swing.*;

public class Algoritmo348 {
    public static void main(String[] args) {
        byte alunos = 5;

        float notas1[] = new float[alunos];
        float notas2[] = new float[alunos];
        String nomes[] = new String[alunos];
        double media[] = new double[alunos];

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JTextField pegarNome = new JTextField(10);
        JTextField pegarNota1 = new JTextField(7);
        JTextField pegarNota2 = new JTextField(7);
        painel.add(new JLabel("Digite o nome do aluno: "));
        painel.add(pegarNome);
        painel.add(new JLabel("Digite a primeira nota do aluno: "));
        painel.add(pegarNota1);
        painel.add(new JLabel("Digite a segunda nota do aluno: "));
        painel.add(pegarNota2);

        for (int i = 0; i < alunos; i++) {
            while (true) {
                int resultado = JOptionPane.showConfirmDialog(null, painel, "Dados escolares", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (resultado == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(null, "O programa será finalizado.");
                    return;
                }

                else if (resultado == JOptionPane.OK_OPTION) {
                    nomes[i] = pegarNome.getText();
                    String notas1Temp = pegarNota1.getText();
                    String notas2Temp = pegarNota2.getText();

                    try {
                        notas1[i] = Float.parseFloat(notas1Temp);
                        notas2[i] = Float.parseFloat(notas2Temp);

                        media[i] = (double) (notas1[i] + notas2[i]) / 2;

                        pegarNome.setText("");
                        pegarNota1.setText("");
                        pegarNota2.setText("");

                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.",
                            "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        JPanel painelResultados = new JPanel();
        painelResultados.setLayout(new BoxLayout(painelResultados, BoxLayout.Y_AXIS));

        for (int i = 0; i < alunos; i++) {
            painelResultados.add(new JLabel("Aluno: " + nomes[i] + "    Nota 1: " + notas1[i] + "    Nota 2: " + notas2[i] + "    Media: " + media[i]));
        }

        JOptionPane.showMessageDialog(null, painelResultados, "DADOS ALUNOS", JOptionPane.INFORMATION_MESSAGE);
    }
}
