import java.util.Scanner;

public class Algoritmo490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] palavras = new String[10];
        char caracter;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite uma palavra " + (i+1) + ": ");
            palavras[i] = scanner.nextLine();
        }
        
        System.out.print("Digite o caractere que deseja remover: ");
        caracter = scanner.next().charAt(0);
        
        for (int i = 0; i < 10; i++) {
            char[] palavra = palavras[i].toCharArray();
            int removidos = caractere(palavra, palavra.length, caracter);
            System.out.println("Palavra " + i + ": " + String.valueOf(palavra));
            System.out.println("Total de caracteres removidos: " + removidos);
        }

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
