public class Pilha {
    private Celula topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void empilhar(int valor) {
        Celula novaCelula = new Celula(valor);
        if (this.topo != null) {
            novaCelula.setAnt(topo);
            this.topo.setProx(novaCelula);
        }
        this.topo = novaCelula;
        this.tamanho++;
    }

    public int desempilhar() {
        if (this.topo == null) {
            System.out.println("Pilha vazia.");
            return ' ';
        }
        int valor = this.topo.getValor();
        this.topo = this.topo.getAnt();
        if (this.topo != null) {
            this.topo.setProx(null);
        }
        this.tamanho--;
        return valor;
    }

    public int verTopo() {
        if (this.topo == null) {
            System.out.println("Pilha vazia.");
            return ' ';
        }
        return this.topo.getValor();
    }

    public void imprimirPilha() {
        Celula atual = this.topo;
        while (atual != null) {
            System.out.println("   " + atual.getValor());
            atual = atual.getAnt();
        }
    }

    public boolean vazia() {
        return this.topo == null;
    }

    public int tamanhoPilha() {
        return this.tamanho;
    }
}
