public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private int numeracao;
    
    public Pessoa(String nome, String endereco, String telefone, String cpf, int numeracao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.numeracao = numeracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Telefone: " + this.telefone + ", Endereço: " + this.endereco + ", CPF: " + this.cpf;
    }
}
