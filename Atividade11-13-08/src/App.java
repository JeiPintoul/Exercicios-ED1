

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        //1
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibirLista();

        //2
        lista.esvaziarLista();
        lista.exibirLista();

        //3
        lista.inserir("Homer");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Moll", 1);
        lista.exibirLista();

        //4
        lista.esvaziarLista();

        //5
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirPosicao("Lisa", 0);
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //6
        lista.esvaziarLista();
        lista.exibirLista();

        //7
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirPosicao("Bart", 0);
        lista.inserirPosicao("Marge", 1);
        lista.exibirLista();
        System.out.println(lista.buscar("Lisa"));

        //8
        lista.esvaziarLista();

        //9
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //10
        System.out.println(lista.buscar("Marge"));
        System.out.println(lista.buscar("Homer"));
        System.out.println(lista.buscar("Bart"));
        System.out.println(lista.buscar("Maggie"));
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //11
        lista.esvaziarLista();

        //12
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Marge");
        lista.inserirPosicao("Maggie", 1);
        lista.inserirPosicao("Ned Flanders", 0);
        lista.inserir("Sr. Burns");
        lista.exibirLista();

        //13
        lista.removerPosicao(lista.tamanho() - 1);
        lista.exibirLista();

        //14
        lista.removerPosicao(1);
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //15
        System.out.println(lista.buscar("Marge"));
        System.out.println(lista.buscar("Homer"));
        System.out.println(lista.buscar("Bart"));
        System.out.println(lista.buscar("Maggie"));
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //16
        lista.removerPosicao(0);
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //17
        System.out.println(lista.buscar("Marge"));
        System.out.println(lista.buscar("Homer"));
        System.out.println(lista.buscar("Bart"));
        System.out.println(lista.buscar("Maggie"));
        lista.exibirLista();
        System.out.println(lista.tamanho());

        //18
        lista.esvaziarLista();
        lista.exibirLista();
    }
}
