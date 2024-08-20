public class Celula {
    private char valor;
    private Celula prox;
    private Celula ant;
    
    
    public Celula(char valor) {
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }

    public char getValor() {
        return valor;
    }


    public void setValor(char valor) {
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
