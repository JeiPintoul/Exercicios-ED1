public class Lista {
    private No sentinela;

    public Lista() {
        this.sentinela = new No(0);
    }

    public boolean isEmpty() {
        return sentinela.getProx() == sentinela;
    }

    public void inserirOrdenado(int info) {
        No novoNo = new No(info);
        No atual = sentinela.getProx();

        while (atual != sentinela && atual.getInfo() < info) {
            atual = atual.getProx();
        }

        No anterior = atual.getAnt();
        anterior.setProx(novoNo);
        novoNo.setAnt(anterior);
        novoNo.setProx(atual);
        atual.setAnt(novoNo);
    }

    public void exibirCrescente() {
        if (this.isEmpty()) {
            System.out.println("Lista => []");
            return;
        }

        No atual = sentinela.getProx();
        System.out.print("Lista => [");
        while (atual.getProx() != sentinela) {
            System.out.print(atual.getInfo() + ", ");
            atual = atual.getProx();
        }
        System.out.println(atual.getInfo() + "]\n\n\n");
    }

    public void exibirDecrescente() {
        if (this.isEmpty()) {
            System.out.println("Lista => []");
            return;
        }

        No atual = sentinela.getAnt();
        System.out.print("Lista => [");
        while (atual.getAnt() != sentinela) {
            System.out.print(atual.getInfo() + ", ");
            atual = atual.getAnt();
        }
        System.out.println(atual.getInfo() + "]\n\n\n");
    }

    public void removerPrimos() {
        if (this.isEmpty()) return;

        No atual = sentinela.getProx();
        while (atual != sentinela) {
            if (isPrimo(atual.getInfo())) {
                No anterior = atual.getAnt();
                No proximo = atual.getProx();
                anterior.setProx(proximo);
                proximo.setAnt(anterior);
            }
            atual = atual.getProx();
        }
    }

    private boolean isPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}