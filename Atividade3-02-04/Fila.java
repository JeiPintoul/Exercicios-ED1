public class Fila {
    private byte quantidadeElementosFila;
    private byte tamanhoFila;
    private float[] elementosFila;
    private int inicioFila;
    private int finalFila;

    public Fila(byte tamanhoFila) {
        this.tamanhoFila = tamanhoFila;
        this.elementosFila = new float[tamanhoFila];
        this.inicioFila = 0;
        this.finalFila = -1;
        this.quantidadeElementosFila = 0;
    }

    public boolean apagarFila() {
        this.quantidadeElementosFila = 0;
        this.inicioFila = 0;
        this.finalFila = -1;
        return true;
    }

    public boolean filaCheia() {
        if (this.quantidadeElementosFila == this.tamanhoFila) return true;
        else return false;
    }

    public boolean filaVazia() {
        if (this.quantidadeElementosFila == 0) return true;
        else return false;
    }

    public boolean inserirElemento(float elemento) {
        if (filaCheia()) return false;
        this.finalFila = (this.finalFila + 1) % this.tamanhoFila;
        this.elementosFila[finalFila] = elemento;
        this.quantidadeElementosFila++;
        return true;
    }

    public int localizarElemento(float elemento) {
        int posicao = -1;
        for (int i = this.inicioFila; i < this.tamanhoFila; i++) {
            if (this.elementosFila[i] == elemento) {
                posicao = i - inicioFila;
                break;
            }
        }
        return posicao;
    }

    public float removerElemento() {
        float elementoRemovido = this.elementosFila[this.inicioFila];
        this.inicioFila = (this.inicioFila + 1) % this.tamanhoFila;
        this.quantidadeElementosFila--;
        return elementoRemovido;
    }
}
