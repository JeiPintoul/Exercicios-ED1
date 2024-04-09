import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilhaPalavras = new Stack<String>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a frase que deseja inverter: ");
        String frase = entrada.nextLine();

        String[] palavrasFrase = frase.split(" ");
        String[] aux = new String[palavrasFrase.length];

        for (int i = 0; i < palavrasFrase.length; i++) {
            aux[i] = "";
            for (int j = palavrasFrase[i].length() - 1; j >= 0; j--) {
                aux[i] = aux[i] + palavrasFrase[i].charAt(j);
            }
        }

        for (int i = aux.length - 1; i >= 0; i--) {
            pilhaPalavras.add(aux[i]);
        }

        int tamanhoPilha = pilhaPalavras.size();

        for (int i = 0; i < tamanhoPilha; i++) {
            System.out.print(pilhaPalavras.pop() + " ");
        }

        entrada.close();
    }
}
