import java.util.Scanner;

public class Algoritmo500 {
    private static final int TAMANHO = 5;
    private static int[] vetorA = new int[TAMANHO];
    private static int[] vetorB = new int[TAMANHO];
    private static boolean vetorAPreenchido = false;
    private static boolean vetorBPreenchido = false;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Preencher vetor A");
            System.out.println("2 - Preencher vetor B");
            System.out.println("3 - Mostrar dados dos vetores");
            System.out.println("4 - Somar os vetores");
            System.out.println("5 - Subtrair os vetores");
            System.out.println("6 - Fechar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor(vetorA, "A");
                    break;
                case 2:
                    preencherVetor(vetorB, "B");
                    break;
                case 3:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        mostrarDadosDosVetores();
                    } else {
                        System.out.println("Os vetores A e B precisam ser preenchidos antes.");
                    }
                    break;
                case 4:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        somarVetores();
                    } else {
                        System.out.println("Os vetores A e B precisam ser preenchidos antes.");
                    }
                    break;
                case 5:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        subtrairVetores();
                    } else {
                        System.out.println("Os vetores A e B precisam ser preenchidos antes.");
                    }
                    break;
                case 6:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);

        entrada.close();
    }

    private static void preencherVetor(int[] vetor, String nome) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preenchendo o vetor " + nome + ":");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        if (nome.equals("A")) {
            vetorAPreenchido = true;
        } else {
            vetorBPreenchido = true;
        }

        System.out.println("Vetor " + nome + " preenchido com sucesso.");
    }

    private static void mostrarDadosDosVetores() {
        System.out.println("Dados do vetor A:");
        mostrarVetor(vetorA);
        System.out.println("Dados do vetor B:");
        mostrarVetor(vetorB);
    }

    private static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    private static void somarVetores() {
        System.out.println("Soma dos vetores:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetorA[i] + vetorB[i] + " ");
        }
        System.out.println();
    }

    private static void subtrairVetores() {
        System.out.println("Subtração dos vetores:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetorA[i] - vetorB[i] + " ");
        }
        System.out.println();
    }
}
