import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ControlePistaDecolagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Aviao> filaDecolagem = new LinkedList<>();

        // Adicionando aviões iniciais à fila de decolagem
        filaDecolagem.add(new Aviao("fw 190", 1));
        filaDecolagem.add(new Aviao("f16", 2));
        filaDecolagem.add(new Aviao("su 27", 3));
        filaDecolagem.add(new Aviao("f15", 4));
        filaDecolagem.add(new Aviao("boeing 747", 5));
        filaDecolagem.add(new Aviao("bf 109", 6));
        filaDecolagem.add(new Aviao("P51 Mustang", 7));
        filaDecolagem.add(new Aviao("B17", 8));
        filaDecolagem.add(new Aviao("b29", 9));

        while (true) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar as características do primeiro avião da fila");
            System.out.println("6. Sair");
            int opcao = input.nextInt();
            input.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDecolagem.size());
                    break;
                case 2:
                    if (!filaDecolagem.isEmpty()) {
                        Aviao aviao = filaDecolagem.poll();
                        System.out.println("Decolagem autorizada para o avião: " + aviao);
                    } else {
                        System.out.println("Não há aviões na fila de decolagem.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = input.nextLine();
                    System.out.print("Digite o identificador do avião: ");
                    int identificador = input.nextInt();
                    input.nextLine();  // Consumir a nova linha
                    filaDecolagem.add(new Aviao(nome, identificador));
                    System.out.println("Avião adicionado à fila de espera.");
                    break;
                case 4:
                    if (!filaDecolagem.isEmpty()) {
                        System.out.println("Aviões na fila de espera:");
                        for (Aviao aviao : filaDecolagem) {
                            System.out.println(aviao);
                        }
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;
                case 5:
                    if (!filaDecolagem.isEmpty()) {
                        Aviao primeiroAviao = filaDecolagem.peek();
                        System.out.println("Primeiro avião da fila: " + primeiroAviao);
                    } else {
                        System.out.println("Não há aviões na fila de decolagem.");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}