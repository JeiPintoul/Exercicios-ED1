import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha par = new Pilha();
        Pilha impar = new Pilha();
        Random random = new Random();
        int num = 0;

        do { 
            num = random.nextInt(256) - 128;
            if (num % 2 == 0) {
                par.empilhar(num);
            } else {
                impar.empilhar(num);
            }
        } while (num != 0);

        while (!par.vazia() && !impar.vazia()) {
            System.out.println("Elemento par: " + par.desempilhar());
            System.out.println("Elemento impar: " + impar.desempilhar());
        }

        int qtd = 0;

        if (!par.vazia()) {
            System.out.println("Pilha Impar vazia.");
            System.out.println("A seguir, os elementos restantes da Pilha Par: ");
            System.out.print("Par --> [");
            while (!par.vazia()) {
                System.out.print(par.desempilhar() + ", ");
                qtd++;
            }
            System.out.println("]");
            System.out.println("Número total de elementos: " + qtd);
        }

        if (!impar.vazia()) {
            System.out.println("Pilha Par vazia.");
            System.out.println("A seguir, os elementos restantes da Pilha Impar: ");
            System.out.print("Impar --> [");
            while (!impar.vazia()) {
                System.out.print(impar.desempilhar() + ", ");
                qtd++;
            }
            System.out.println("]");
            System.out.println("Número total de elementos: " + qtd);
        }
    }
}
