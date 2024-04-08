public class Professor extends Pessoa {
    private String siape;
    private String titulacao;

    public Professor(String nome, String siape, String titulacao) {
        super(nome);
        this.siape = siape;
        this.titulacao = titulacao;
    }

    public String getSiape() {
        return siape;
    }

    public String getTitulacao() {
        return titulacao;
    }
}
