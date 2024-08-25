public class Pilha {
    private Celula topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int valor) {
        Celula novaCelula = new Celula(valor);
        if (this.topo != null) {
            novaCelula.setAnt(topo);
            this.topo.setProx(novaCelula);
        }
        this.topo = novaCelula;
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
        return valor;
    }

    public int verTopo() {
        if (this.topo == null) {
            System.out.println("Pilha vazia.");
            return ' ';
        }
        return this.topo.getValor();
    }

    public boolean vazia() {
        return this.topo == null;
    }
}
