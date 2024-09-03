public class PostoSaude {
    public static void main(String[] args) {
        int capacidadeFila = 100;
        DequeCircular filaAtendimento = new DequeCircular(capacidadeFila);

        int id = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                Pessoa pessoa = gerarPessoa(id++);
                filaAtendimento.adicionarTras(pessoa);
            }

            int pessoasParaAtender = i;
            for (int k = 0; k < pessoasParaAtender; k++) {
                Pessoa atendido = atender(filaAtendimento);
                if (atendido != null) {
                    System.out.println("Atendendo: " + atendido);
                }
            }
        }

        while (!filaAtendimento.isVazio()) {
            Pessoa naoAtendido = filaAtendimento.removerFrente();
            System.out.println("Não atendido: " + naoAtendido);
        }
    }

    private static Pessoa gerarPessoa(int id) {
        int prioridade = id % 10;
        return switch (prioridade) {
            case 0 -> new Pessoa(id, "Feminino", 30, false, false, true);
            case 1 -> new Pessoa(id, "Feminino", 25, true, false, false);
            case 2 -> new Pessoa(id, "Feminino", 28, false, true, false);
            case 3, 4, 5 -> new Pessoa(id, "Masculino", 65, false, false, false);
            default -> new Pessoa(id, "Masculino", 35, false, false, false);
        };
    }

    private static Pessoa atender(DequeCircular fila) {
        Pessoa pessoaPrioridade = null;
        int maxPrioridade = -1;

        for (int i = 0; i < fila.tamanho(); i++) {
            Pessoa atual = fila.removerFrente();
            if (atual.getPrioridade() > maxPrioridade) {
                if (pessoaPrioridade != null) fila.adicionarTras(pessoaPrioridade);
                pessoaPrioridade = atual;
                maxPrioridade = atual.getPrioridade();
            } else {
                fila.adicionarTras(atual);
            }
        }
        return pessoaPrioridade;
    }
}