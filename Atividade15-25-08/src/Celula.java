public class Celula {
    private int valor;
    private Celula prox;
    private Celula ant;
    
    
    public Celula(int valor) {
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }

    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public Celula getProx() {
        return prox;
    }


    public void setProx(Celula prox) {
        this.prox = prox;
    }


    public Celula getAnt() {
        return ant;
    }


    public void setAnt(Celula ant) {
        this.ant = ant;
    }
}
