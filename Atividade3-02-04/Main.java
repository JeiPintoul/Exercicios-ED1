import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho máximo da fila: ");
        byte tamanhoFila = entrada.nextByte();
        entrada.nextLine();

        Fila fila = new Fila(tamanhoFila);

        byte operacao;

        do {
            System.out.println("Digite a operação que deseja realizar:\n 1 - Inserir elemento na fila\n 2 - Remover elemento da fila\n 3 - Checar posição de elemento na fila\n 4 - Apagar fila\n 5 - Fechar programa");
            System.out.print("Operação: ");
            operacao = entrada.nextByte();
            entrada.nextLine();

            switch (operacao) {
                case 1:
                    System.out.print("Digite o elemento que quer adicionar à sua fila: ");
                    float elemento = entrada.nextFloat();
                    entrada.nextLine();
                    if (fila.inserirElemento(elemento)) {
                        System.out.println("Elemento inserido com sucesso.");
                    } else System.out.println("Erro: A fila já está cheia. Por favor, esvazie a lista antes de prosseguir.");
                    break;
                
                case 2:
                    if (fila.filaVazia()) {
                        System.out.println("Erro: A fila está vazia. Por favor, adicione elementos a ela.");
                        break;
                    } else System.out.println("O primeiro elemento (" + fila.removerElemento() + ") da fila foi removido com sucesso.");
                    break;

                case 3:
                    System.out.print("Digite o elemento que deseja checar a posição na fila: ");
                    elemento = entrada.nextFloat();
                    entrada.nextLine();

                    if (fila.localizarElemento(elemento) == -1) {
                        System.out.println("O elemento não foi encontrado na fila em questão.");
                    } else System.out.println("O elemento em questão está na posição " + fila.localizarElemento(elemento) + ".");
                    break;

                case 4:
                    if (fila.apagarFila()) {
                        System.out.println("A fila foi apagada com sucesso.");
                    } else System.out.println("Erro: a fila não pôde ser apagada.");
                    break;

                case 5:
                    System.out.println("O programa será encerrado.");
                    break;

                default:
                    System.out.println("Número inválido digitado, tente novamente.\n");
            }
        } while (operacao != 5);
        entrada.close();
    }
}
