import javax.swing.*;
import java.awt.*;

public class Algoritmo356 {
    public static void main(String[] args) {
        byte alunos = 15;

        JTextField[] nomePessoa = new JTextField[alunos];
        JPanel nomesPanel = new JPanel();
        nomesPanel.setLayout(new BoxLayout(nomesPanel, BoxLayout.Y_AXIS));
        nomesPanel.add(new JLabel("A seguir, digite os nomes dos alunos:"));

        for (int i = 0; i < alunos; i++) {
            nomePessoa[i] = new JTextField(10);
            nomesPanel.add(new JLabel("Nome " + (i + 1) + ": "));
            nomesPanel.add(nomePessoa[i]);
        }

        JOptionPane.showConfirmDialog(null, nomesPanel, "NOME ALUNOS", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        JTextField[] notasPR1 = new JTextField[alunos];
        JTextField[] notasPR2 = new JTextField[alunos];
        JPanel notasPanel = new JPanel();
        notasPanel.setLayout(new BoxLayout(notasPanel, BoxLayout.Y_AXIS));
        notasPanel.add(new JLabel("A seguir, digite as notas PR1 e PR2 para cada aluno:"));

        for (int i = 0; i < alunos; i++) {
            JPanel notaPanel = new JPanel();
            notaPanel.add(new JLabel("Nome: " + nomePessoa[i].getText()));
            notaPanel.add(new JLabel("PR1: "));
            notasPR1[i] = new JTextField(5);
            notaPanel.add(notasPR1[i]);
            notaPanel.add(new JLabel("PR2: "));
            notasPR2[i] = new JTextField(5);
            notaPanel.add(notasPR2[i]);
            notasPanel.add(notaPanel);
        }

        JOptionPane.showConfirmDialog(null, notasPanel, "NOTAS PR1 E PR2", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.setLayout(new GridLayout(alunos + 1, 5));
        resultadoPanel.add(new JLabel("Nome"));
        resultadoPanel.add(new JLabel("PR1"));
        resultadoPanel.add(new JLabel("PR2"));
        resultadoPanel.add(new JLabel("Média"));
        resultadoPanel.add(new JLabel("Status"));

        for (int i = 0; i < alunos; i++) {
            double media = calcularMedia(Double.parseDouble(notasPR1[i].getText()), Double.parseDouble(notasPR2[i].getText()));
            String status = (media >= 5) ? "Aprovado" : "Reprovado";

            resultadoPanel.add(new JLabel(nomePessoa[i].getText()));
            resultadoPanel.add(new JLabel(notasPR1[i].getText()));
            resultadoPanel.add(new JLabel(notasPR2[i].getText()));
            resultadoPanel.add(new JLabel(String.format("%.2f", media)));
            resultadoPanel.add(new JLabel(status));
        }

        JOptionPane.showMessageDialog(null, resultadoPanel, "Resultados", JOptionPane.PLAIN_MESSAGE);
    }

    private static double calcularMedia(double pr1, double pr2) {
        return (pr1 + pr2) / 2;
    }
}
