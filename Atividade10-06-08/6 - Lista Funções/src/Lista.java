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

    public Lista inverter() {
        Lista novaLista = new Lista();
        No aux = this.cabeca;
        while (aux != null) {
            novaLista.inserirInicio(aux.getInfo()); // Insere no início da nova lista
            aux = aux.getProx();
        }
        return novaLista;
    }

    // Retornar elementos ímpares
    public Lista retornarImpares(Lista l1, Lista l2) {
        Lista novaLista = new Lista();
        for (No aux = l1.cabeca; aux != null; aux = aux.getProx()) {
            if (aux.getInfo() % 2 != 0) {
                novaLista.inserir(aux.getInfo());
            }
        }
        for (No aux = l2.cabeca; aux != null; aux = aux.getProx()) {
            if (aux.getInfo() % 2 != 0) {
                novaLista.inserir(aux.getInfo());
            }
        }
        return novaLista;
    }

    // Concatenar listas
    public Lista concatenar(Lista l1, Lista l2) {
        Lista novaLista = new Lista();
        for (No aux = l1.cabeca; aux != null; aux = aux.getProx()) {
            novaLista.inserir(aux.getInfo());
        }
        for (No aux = l2.cabeca; aux != null; aux = aux.getProx()) {
            novaLista.inserir(aux.getInfo());
        }
        return novaLista;
    }

    // Conjunto intersecção
    public Lista intersecao(Lista l1, Lista l2) {
        Lista novaLista = new Lista();
        for (No aux1 = l1.cabeca; aux1 != null; aux1 = aux1.getProx()) {
            for (No aux2 = l2.cabeca; aux2 != null; aux2 = aux2.getProx()) {
                if (aux1.getInfo() == aux2.getInfo()) {
                    novaLista.inserir(aux1.getInfo());
                    break; // Evita inserir o mesmo elemento múltiplas vezes
                }
            }
        }
        return novaLista;
    }

    // Intercalar 1 (mantendo a ordem original)
    public Lista intercalar1(Lista l1, Lista l2) {
        Lista novaLista = new Lista();
        No aux1 = l1.cabeca;
        No aux2 = l2.cabeca;
        while (aux1 != null || aux2 != null) {
            if (aux1 != null) {
                novaLista.inserir(aux1.getInfo());
                aux1 = aux1.getProx();
            }
            if (aux2 != null) {
                novaLista.inserir(aux2.getInfo());
                aux2 = aux2.getProx();
            }
        }
        return novaLista;
    }

    // Intercalar 2 (ordenadamente)
    public Lista intercalar2(Lista l1, Lista l2) {
        Lista novaLista = new Lista();
        No aux1 = l1.cabeca;
        No aux2 = l2.cabeca;
    
        while (aux1 != null && aux2 != null) {
            if (aux1.getInfo() <= aux2.getInfo()) {
                novaLista.inserir(aux1.getInfo());
                aux1 = aux1.getProx();
            } else {
                novaLista.inserir(aux2.getInfo());
                aux2 = aux2.getProx();
            }
        }
    
        // Copiar os elementos restantes (se houver)
        while (aux1 != null) {
            novaLista.inserir(aux1.getInfo());
            aux1 = aux1.getProx();
        }
        while (aux2 != null) {
            novaLista.inserir(aux2.getInfo());
            aux2 = aux2.getProx();
        }
    
        return novaLista;
    }

    // Método auxiliar para inserir no início da lista
    private void inserirInicio(int info) {
        No novoNo = new No(info);
        novoNo.setProx(cabeca);
        cabeca = novoNo;
        tamanhoLista++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        No aux = cabeca;
        while (aux != null) {
            sb.append(aux.getInfo());
            if (aux.getProx() != null) {
                sb.append(", ");
            }
            aux = aux.getProx();
        }
        sb.append("]");
        return sb.toString();
    }
}
