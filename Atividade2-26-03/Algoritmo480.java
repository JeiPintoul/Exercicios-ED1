import java.util.Scanner;

public class Algoritmo480 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número que deseja checar se é capicua: ");
        int numero = entrada.nextInt();
        if (capicua(numero)) {
            System.out.println("O número " + numero + " é capicua.");
        } else {
            System.out.println("O número " + numero + " não é capicua.");
        }

        entrada.close();
    }

    public static boolean capicua(int valor) {
        String checador = Integer.toString(valor);

        return checador.equals(new StringBuilder(checador).reverse().toString());
    }
}
