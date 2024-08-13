public class Lista {
    private No cabeca;
    private No cauda;
    private int tamanhoLista;

    public Lista() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public boolean isEmpty() {
        return cabeca == null;
    }

    public void inserir(String info) {
        No novoNo = new No(info);
        if (this.cabeca == null) {
            this.cabeca = novoNo;
            this.cauda = novoNo;
            this.tamanhoLista++;
        } else {
            this.cauda.setProx(novoNo);
            novoNo.setAnt(this.cauda);
            this.cauda = novoNo;
            this.tamanhoLista++;
        }
    }

    public void exibirLista() {
        if (this.isEmpty()) {
            System.out.println("Erro: lista vazia.");
            return;
        }
        
        No atual = this.cabeca;
        while (atual.getProx() != null) {
            System.out.println(atual.getInfo() + ",");
            atual = atual.getProx();
        }
        System.out.println(atual.getInfo() + ".");
    }

    public void remover(String info) {
        No atual = this.cabeca;
        while (atual != null) {
            if (atual.getInfo() == null ? info == null : atual.getInfo().equals(info)) {
                if (atual.getAnt() != null) {
                    atual.getAnt().setProx(atual.getProx());
                    this.tamanhoLista--;
                } else {
                    this.cabeca = atual.getProx();
                } if (atual.getProx() != null) {
                    atual.getProx().setAnt(atual.getAnt());
                    this.tamanhoLista--;
                } else {
                    this.cauda = atual.getAnt();
                    atual = null;
                    this.tamanhoLista--;
                    return;
                }
            }
            atual = atual.getProx();
        }          
    }

    public int tamanho() {
        return this.tamanhoLista;
    }

    public void inserirPosicao(String info, int posicao) {
        if (posicao < 0 || posicao >= tamanhoLista) {
            System.out.println("Posição inválida");
            return;
        }
    
        No aux = cabeca;
        No anterior = null;
        int i = 0;
    
        while (i < posicao) {
            anterior = aux;
            aux = aux.getProx();
            i++;
        }

        No novoNo = new No(info);
    
        if (anterior == null) {
            novoNo.setProx(cabeca);
            this.cabeca = novoNo;
            novoNo.getProx().setAnt(novoNo);
        } else {
            novoNo.setAnt(anterior);
            novoNo.setProx(aux);
            anterior.setProx(novoNo);
            aux.setAnt(novoNo);
        }
        tamanhoLista++;
    }

    public void esvaziarLista() {
        No aux = this.cauda;
        while (aux != null) {
            No anterior = aux.getAnt();
            aux.setProx(null);
            aux = anterior;
            this.tamanhoLista--;
        }
        this.cabeca = null;
    }

    public void removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanhoLista) {
            System.out.println("Posição inválida");
            return;
        }
    
        No aux = cabeca;
        int i = 0;
    
        while (i < posicao) {
            aux = aux.getProx();
            i++;
        }
    
        if (aux.getAnt() == null) {
            cabeca = aux.getProx();
            if (cabeca != null) {
                cabeca.setAnt(null);
            }
        } else {
            aux.getAnt().setProx(aux.getProx());
        }
    
        if (aux.getProx() != null) {
            aux.getProx().setAnt(aux.getAnt());
        }
    
        tamanhoLista--;
    }

    public boolean buscar(String info) {
        No aux = cabeca;
        while (aux != null) {
            if (aux.getInfo() == null ? info == null : aux.getInfo().equals(info)) return true;
            aux = aux.getProx();
        }
        return false;
    } 
}
