public class App {
    public static void main(String[] args) throws Exception {
        Lista vitinho = new Lista();

        vitinho.inserir(5);
        vitinho.inserir(3);
        vitinho.inserir(8);
        vitinho.inserir(9);
        vitinho.inserir(1);
        vitinho.inserir(6);
        vitinho.remover(3);
        System.out.println(vitinho.tamanho());

        Lista lista = new Lista();

        lista.inserir(5);
        lista.inserir(5);
        lista.inserir(5);
        lista.inserir(9);
        lista.inserir(1);
        lista.inserir(6);
        lista.remover(9);
        System.out.println(lista.tamanho());

        System.out.println(lista.iguais(lista, vitinho));

        System.out.println(lista.media());

        System.out.println(lista.buscar(5));

        lista.elimina(5);
        System.out.println(lista.tamanho());
        System.out.println(lista.buscar(5));
        System.out.println(lista.media());

        lista.eliminaPosicao(3);
        lista.eliminaPosicao(-1);
        lista.eliminaPosicao(1);
        System.out.println(lista.tamanho());

        lista.insereDireita(50, 1);
        System.out.println(lista.tamanho());
    }
}
