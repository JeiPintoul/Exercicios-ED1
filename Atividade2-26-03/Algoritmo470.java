import java.util.Scanner;

public class Algoritmo470 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número que deseja checar se é primo ou não: ");
        int numero = entrada.nextInt();
        if (primo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        entrada.close();
    }

    public static boolean primo(int num) {
        int checa = 2;
        while (checa <= num / 2) {
            if (num % checa == 0) {
                return false;
            } else {
                checa++;
            }
        }
        return true;
    }
}
