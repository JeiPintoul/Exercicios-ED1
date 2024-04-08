public class TecnicoAdministrativo extends Pessoa {
    private String siape;

    public TecnicoAdministrativo(String nome, String siape) {
        super(nome);
        this.siape = siape;
    }



    public String getSiape() {
        return siape;
    }
}
