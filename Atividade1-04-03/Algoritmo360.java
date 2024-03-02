import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Algoritmo360 {

    public static void main(String[] args) {
        ArrayList<String> horoscopos = new ArrayList<>();

        while (true) {
            String data = JOptionPane.showInputDialog("Digite a data de nascimento (ddmm) ou 9999 para encerrar:");

            if (data.equals("9999")) {
                break;
            }

            if (validarData(data)) {
                String signo = calcularSigno(data);
                horoscopos.add("Data: " + data + " - Signo: " + signo);
            } else {
                JOptionPane.showMessageDialog(null, "Data inválida. Tente novamente.");
            }
        }

        exibirHoroscopos(horoscopos);
    }

    private static boolean validarData(String data) {
        return data.length() == 4;
    }

    private static String calcularSigno(String data) {
        int mes = Integer.parseInt(data.substring(2, 4));

        if ((mes >= 321 && mes <= 419)) {
            return "Áries";
        } else if ((mes >= 420 && mes <= 520)) {
            return "Touro";
        } else if ((mes >= 521 && mes <= 620)) {
            return "Gêmeos";
        } else if ((mes >= 621 && mes <= 722)) {
            return "Câncer";
        } else if ((mes >= 723 && mes <= 822)) {
            return "Leão";
        } else if ((mes >= 823 && mes <= 922)) {
            return "Virgem";
        } else if ((mes >= 923 && mes <= 1022)) {
            return "Libra";
        } else if ((mes >= 1023 && mes <= 1121)) {
            return "Escorpião";
        } else if ((mes >= 1122 && mes <= 1221)) {
            return "Sagitário";
        } else if ((mes >= 1222 || mes <= 119)) {
            return "Capricórnio";
        } else if ((mes >= 120 && mes <= 218)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }

    private static void exibirHoroscopos(ArrayList<String> horoscopos) {
        JPanel panel = new JPanel(new GridLayout(0, 1));

        int count = 0;
        for (String horoscopo : horoscopos) {
            if (count % 20 == 0 && count != 0) {
                JOptionPane.showMessageDialog(null, panel, "Horóscopos - Tabela " + (count / 20), JOptionPane.INFORMATION_MESSAGE);
                panel = new JPanel(new GridLayout(0, 1));
            }
            panel.add(new JLabel(horoscopo));
            count++;
        }

        if (count > 0) {
            JOptionPane.showMessageDialog(null, panel, "Horóscopos - Tabela " + (count / 20 + 1), JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma entrada para exibir.", "Horóscopos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
