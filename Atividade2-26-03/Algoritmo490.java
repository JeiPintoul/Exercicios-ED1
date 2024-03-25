import java.util.Scanner;

public class Algoritmo490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String inputWord = scanner.nextLine();
        char[] palavra = inputWord.toCharArray();

        System.out.print("Digite o caractere que deseja remover: ");
        char caracter = scanner.next().charAt(0);

        int tam = palavra.length;
        int removidos = caractere(palavra, tam, caracter);

        System.out.println("Nova palavra: " + String.valueOf(palavra));
        System.out.println("Total de caracteres removidos: " + removidos);

        scanner.close();
    }

    public static int caractere(char[] palavra, int tam, char caracter) {
        int substituidos = 0;

        for (int i = 0; i < tam; i++) {
            if (palavra[i] == caracter) {
                palavra[i] = '*';
                substituidos++;
            }
        }

        return substituidos;
    }

}
