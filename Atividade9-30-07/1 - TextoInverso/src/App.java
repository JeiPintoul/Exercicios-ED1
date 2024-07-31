import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Stack pilha = new Stack();

        System.out.println("Digite a palavra a ser analisada: ");

        String palavra = entrada.nextLine().replace(" ", "").replace("{!?.><}", "");
        String frase = "";

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            frase += pilha.pop();
        }

        System.out.println("A palavra em sua forma inversa é: ");
        System.out.println(frase);

        if (palavra.equals(frase)) {
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }
    }
}
