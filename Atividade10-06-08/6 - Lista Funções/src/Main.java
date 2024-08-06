public class Main {
    public static void main(String[] args) {
        // Criando listas para os testes
        Lista lista1 = new Lista();
        lista1.inserir(2);
        lista1.inserir(4);
        lista1.inserir(50);
        lista1.inserir(6);
        lista1.inserir(20);

        Lista lista2 = new Lista();
        lista2.inserir(1);
        lista2.inserir(3);
        lista2.inserir(5);
        lista2.inserir(6);

        // Testando as funções
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("\n");
        System.out.println("Lista 1 invertida: " + lista1.inverter());
        System.out.println("Elementos ímpares: " + lista1.retornarImpares(lista1, lista2));
        System.out.println("Lista concatenada: " + lista1.concatenar(lista1, lista2));
        System.out.println("Intersecção: " + lista1.intersecao(lista1, lista2));
        System.out.println("Intercalar 1: " + lista1.intercalar1(lista1, lista2));
        System.out.println("Intercalar 2: " + lista1.intercalar2(lista1, lista2));
    }
}
