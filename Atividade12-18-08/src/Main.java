import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[1000];
        Lista lista = new Lista();

        System.out.print("Vetor => [");
        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(19999) - 9999;
            if (i < 999) {
                System.out.print(vetor[i] + ", ");
            } else {
                System.out.print(vetor[i] + "]");
            }
            if (i % 100 == 99) {
                System.out.println();
            }
        }
        System.out.println("\n\n\n");

        System.out.println("\nTotal de números gerados: " + vetor.length + "\n\n");

        for (int num : vetor) {
            lista.inserirOrdenado(num);
        }

        System.out.println("Lista em ordem crescente (normal):");
        lista.exibirCrescente();

        System.out.println("Lista em ordem decrescente:");
        lista.exibirDecrescente();

        lista.removerPrimos();

        System.out.println("Lista após remoção dos números primos (ordem crescente/normal):");
        lista.exibirCrescente();

        System.out.println("Lista após remoção dos números primos (ordem decrescente):");
        lista.exibirDecrescente();
    }
}