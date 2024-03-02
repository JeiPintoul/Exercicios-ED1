import javax.swing.*;

public class Algoritmo358 {

    public static void main(String[] args) {
        final double LUCRO_10_PERCENT = 0.10;
        final double LUCRO_20_PERCENT = 0.20;

        int menos10Percent = 0;
        int entre10e20Percent = 0;
        int mais20Percent = 0;

        for (int i = 1; i <= 100; i++) {
            JPanel panel = new JPanel();
            JTextField precoCompraField = new JTextField(10);
            JTextField precoVendaField = new JTextField(10);

            panel.add(new JLabel("Digite o preço de compra da mercadoria " + i + ":"));
            panel.add(precoCompraField);
            panel.add(new JLabel("Digite o preço de venda da mercadoria " + i + ":"));
            panel.add(precoVendaField);

            int result = JOptionPane.showConfirmDialog(null, panel,
                    "Informe os preços de compra e venda", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                double precoCompra = Double.parseDouble(precoCompraField.getText());
                double precoVenda = Double.parseDouble(precoVendaField.getText());

                double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

                if (lucroPercentual < LUCRO_10_PERCENT) {
                    menos10Percent++;
                } else if (lucroPercentual >= LUCRO_10_PERCENT && lucroPercentual <= LUCRO_20_PERCENT) {
                    entre10e20Percent++;
                } else {
                    mais20Percent++;
                }
            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Mercadorias com menos de 10% de lucro: " + menos10Percent + "\n" +
                        "Mercadorias com 10% a 20% de lucro: " + entre10e20Percent + "\n" +
                        "Mercadorias com mais de 20% de lucro: " + mais20Percent);
    }
}
