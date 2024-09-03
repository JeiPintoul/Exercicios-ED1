public class Pessoa {
    private int id;
    private String sexo;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;
    private int prioridade;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = calcularPrioridade();
    }

    private int calcularPrioridade() {
        if (gestante || lactante) return 3;
        if (necessidadeEspecial) return 2;
        if (idade >= 60) return 1;
        return 0;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "ID=" + id +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", gestante=" + gestante +
                ", lactante=" + lactante +
                ", necessidadeEspecial=" + necessidadeEspecial +
                ", prioridade=" + prioridade +
                '}';
    }
}
