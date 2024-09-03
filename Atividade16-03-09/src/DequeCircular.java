public class DequeCircular {
    private Pessoa[] deque;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidade;

    public DequeCircular(int capacidade) {
        this.capacidade = capacidade;
        deque = new Pessoa[capacidade];
        frente = -1;
        tras = -1;
        tamanho = 0;
    }

    public boolean isVazio() {
        return tamanho == 0;
    }

    public boolean isCheio() {
        return tamanho == capacidade;
    }

    public void adicionarFrente(Pessoa p) {
        if (isCheio()) {
            System.out.println("Deque cheio, não é possível adicionar na frente");
            return;
        }
        frente = (frente - 1 + capacidade) % capacidade;
        deque[frente] = p;
        tamanho++;
        if (tras == -1) tras = frente;
    }

    public void adicionarTras(Pessoa p) {
        if (isCheio()) {
            System.out.println("Deque cheio, não é possível adicionar atrás");
            return;
        }
        tras = (tras + 1) % capacidade;
        deque[tras] = p;
        tamanho++;
        if (frente == -1) frente = tras;
    }

    public Pessoa removerFrente() {
        if (isVazio()) {
            System.out.println("Deque vazio, não é possível remover da frente");
            return null;
        }
        Pessoa p = deque[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return p;
    }

    public Pessoa removerTras() {
        if (isVazio()) {
            System.out.println("Deque vazio, não é possível remover de trás");
            return null;
        }
        Pessoa p = deque[tras];
        tras = (tras - 1 + capacidade) % capacidade;
        tamanho--;
        return p;
    }

    public Pessoa espiarFrente() {
        if (isVazio()) return null;
        return deque[frente];
    }

    public Pessoa espiarTras() {
        if (isVazio()) return null;
        return deque[tras];
    }

    public int tamanho() {
        return tamanho;
    }
}
