import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Pilha pilha1 = new Pilha();
        Pilha pilha2 = new Pilha();
        Pilha pilha3 = new Pilha();

        System.out.println("Pilha 1:    Pilha 2:    Pilha 3:");
        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(9) + 1;

            if (valor <= 3) {
                pilha1.empilhar(valor);
                System.out.printf("%-15d\n", valor);
            }

            if (valor >= 4 && valor <= 6) {
                pilha2.empilhar(valor);
                System.out.printf("%15d\n", valor);
            }

            if (valor >= 7) {
                pilha3.empilhar(valor);
                System.out.printf("%30d\n", valor);
            }
        }

        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(3) + 1;

            if (valor == 1) {
                if (pilha2.vazia() || pilha3.vazia()) break;
                int num1 = pilha2.desempilhar();
                int num2 = pilha3.desempilhar();
                System.out.println("Retirando " + num1 + " da Pilha 2 e " + num2 + " da Pilha 3 e adicionando na Pilha 1:");
                pilha1.empilhar(num1);
                pilha1.empilhar(num2);
                pilha1.imprimirPilha();
            }

            if (valor == 2) {
                if (pilha1.vazia() || pilha3.vazia()) break;
                int num1 = pilha1.desempilhar();
                int num2 = pilha3.desempilhar();
                System.out.println("Retirando " + num1 + " da Pilha 1 e " + num2 + " da Pilha 3 e adicionando na Pilha 2:");
                pilha2.empilhar(num1);
                pilha2.empilhar(num2);
                pilha2.imprimirPilha();
            }

            if (valor == 3) {
                if (pilha1.vazia() || pilha2.vazia()) break;
                int num1 = pilha1.desempilhar();
                int num2 = pilha2.desempilhar();
                System.out.println("Retirando " + num1 + " da Pilha 1 e " + num2 + " da Pilha 2 e adicionando na Pilha 3:");
                pilha3.empilhar(num1);
                pilha3.empilhar(num2);
                pilha3.imprimirPilha();
            }

            if (i == 99) System.out.println("O loop será encerrado por ter atingido o número máximo de sorteios.");
        }
    }
}
