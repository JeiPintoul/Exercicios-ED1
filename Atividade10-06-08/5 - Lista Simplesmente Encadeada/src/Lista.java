public class Lista {
    private No cabeca;
    private int tamanhoLista;

    public Lista() {
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public boolean isEmpty() {
        return cabeca == null;
    }

    public void inserir(int info) {
        No novoNo = new No(info);
        if (this.isEmpty() || info <= cabeca.getInfo()) {
            novoNo.setProx(cabeca);
            this.cabeca = novoNo;
        } else {
            No aux = cabeca;
            while (aux.getProx() != null && aux.getProx().getInfo() < info) {
                aux = aux.getProx();
            }
            novoNo.setProx(aux.getProx());
            aux.setProx(novoNo);
        }
        this.tamanhoLista++;
    }

    public void remover(int info) {
        if (cabeca != null) {
            if (cabeca.getInfo() == info) {
                cabeca = cabeca.getProx();
                this.tamanhoLista--;
            } else {
                    No aux = cabeca;
                    while (aux.getProx() != null && aux.getProx().getInfo() != info) {
                        aux = aux.getProx();
                    }
                    if (aux.getProx() != null) {
                        aux.setProx(aux.getProx().getProx());
                        this.tamanhoLista--;
                    } else System.out.println("Termo não encontrado.");
            }        
        }            
    }

    public int tamanho() {
        return this.tamanhoLista;
    }

    public boolean iguais(Lista lista1, Lista lista2) {
        if (lista1.tamanhoLista != lista2.tamanhoLista) return false;

        No aux1 = lista1.cabeca;
        No aux2 = lista2.cabeca;
        while (aux1.getProx() != null) {
            if (aux1.getInfo() != aux2.getInfo()) return false;
            aux1 = aux1.getProx();
            aux2 = aux2.getProx();
        }

        return true;
    }

    public float media() {
        if (tamanhoLista == 0) return 0;
        int soma = 0;
        No aux = cabeca;
        
        while (aux != null) {
            soma += aux.getInfo();
            aux = aux.getProx();
        }


        return (float) soma / tamanhoLista;
    }

    public boolean buscar(int info) {
        No aux = cabeca;
        while (aux != null) {
            if (aux.getInfo() == info) return true;
            aux = aux.getProx();
        }
        return false;
    }

    public void elimina(int info) {
        No aux = cabeca;
        No anterior = null;
    
        while (aux != null) {
            if (aux.getInfo() == info) {
                // Remover o nó atual
                if (anterior == null) {
                    // Remover o primeiro nó
                    cabeca = aux.getProx();
                } else {
                    anterior.setProx(aux.getProx());
                }
                tamanhoLista--;
            } else {
                anterior = aux;
            }
            aux = aux.getProx();
        }
    }

    public void eliminaPosicao(int posicao) {
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
    
        if (anterior == null) {
            cabeca = aux.getProx();
        } else {
            anterior.setProx(aux.getProx());
        }
    
        tamanhoLista--;
    }
    
    public void insereDireita(int info, int posicao) {
        if (posicao < 0 || posicao > tamanhoLista) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    
        No novoNo = new No(info);
        No aux = cabeca;
    
        if (posicao == 0) {
            novoNo.setProx(cabeca);
            cabeca = novoNo;
        } else {
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.getProx();
            }
            novoNo.setProx(aux.getProx());
            aux.setProx(novoNo);
        }
    
        tamanhoLista++;
    }
    
    public void insereEsquerda(int info, int posicao) {
        if (posicao < 0 || posicao > tamanhoLista) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    
        No novoNo = new No(info);
        No aux = cabeca;
    
        if (posicao == 0) {
            // Inserir no início da lista
            novoNo.setProx(cabeca);
            cabeca = novoNo;
        } else {
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.getProx();
            }
            novoNo.setProx(aux);
            if (aux != cabeca) { // Verifica se não estamos inserindo no início
                No anterior = cabeca;
                while (anterior.getProx() != aux) {
                    anterior = anterior.getProx();
                }
                anterior.setProx(novoNo);
            } else {
                cabeca = novoNo;
            }
        }
    
        tamanhoLista++;
    }    
}
