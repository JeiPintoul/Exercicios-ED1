public class App {
    public static void main(String[] args) {
        ContarNumero a = new ContarNumero();
        int numerogrande = 5234423;
        int  numero = 2;
        int resultado = a.contarNumero(numerogrande, numero);
        System.out.println("o numero apareceu: "+resultado);
    }
}
