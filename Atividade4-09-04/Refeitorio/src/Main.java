import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Pessoa> filaRefeitorio = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);

        byte operacao = 0;
        String nome;
        String curso;
        String matricula;
        String siape;
        String titulacao;

        do {
            System.out.print("\nEscolha qual a operação que deseja fazer:\n 1 - Adicionar Aluno à fila\n 2 - Adicionar Professor à fila\n 3 - Adicionar Técnico Administrativo na fila\n");
            System.out.print(" 4 - Remover primeiro da fila\n 5 - Tamanho da fila\n 6 - Parar programa\n");
            System.out.print("\nOperação: ");
            operacao = entrada.nextByte();
            entrada.nextLine();
            System.out.print("\n");

            switch (operacao) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    nome = entrada.nextLine();
                    System.out.print("\nInforme o curso do aluno: ");
                    curso = entrada.nextLine();
                    System.out.print("\nInforme a matrícula do aluno: ");
                    matricula = entrada.nextLine();

                    Aluno aluno = new Aluno(nome, curso, matricula);

                    filaRefeitorio.add(aluno);
                    System.out.println("Aluno adicionado à fila com sucesso.");
                    break;

                case 2:
                    System.out.print("Informe o nome do professor: ");
                    nome = entrada.nextLine();
                    System.out.print("\nInforme o SIAPE do professor: ");
                    siape = entrada.nextLine();
                    System.out.print("\nInforme a titulação do professor: ");
                    titulacao = entrada.nextLine();

                    Professor professor = new Professor(nome, siape, titulacao);

                    filaRefeitorio.add(professor);
                    System.out.println("Professor adicionado à fila com sucesso.");
                    break;

                case 3:
                    System.out.print("Informe o nome do técnico administrativo: ");
                    nome = entrada.nextLine();
                    System.out.print("\nInforme o SIAPE do técnico administrativo: ");
                    siape = entrada.nextLine();

                    TecnicoAdministrativo tecnico = new TecnicoAdministrativo(nome, siape);

                    filaRefeitorio.add(tecnico);
                    System.out.println("Técnico Administrativo adicionado à fila com sucesso.");
                    break;

                case 4:
                    if (!filaRefeitorio.isEmpty()) {
                        Pessoa removida = filaRefeitorio.poll();
                        System.out.println("Removido da fila: " + removida.getNome());
                    } else {
                        System.out.println("A fila está vazia. Nada para remover.");
                    }
                    break;

                case 5:
                    System.out.println("Tamanho da fila: " + filaRefeitorio.size());
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Número digitado inválido. Por favor, tente novamente.");
                    break;
            }
        } while (operacao != 6);

        entrada.close();
    }
}
