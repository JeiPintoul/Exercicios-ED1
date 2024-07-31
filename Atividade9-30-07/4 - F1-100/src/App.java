import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> f1 = new LinkedList<>();
        Random random = new Random();

        System.out.println("Fila 1:");

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(1000);
            f1.add(number);
            System.out.println(number);
        }

        Queue<Integer> f2 = inverterFila(f1);
        
        System.out.println();
        System.out.println("Fila 2:");

        while (!f2.isEmpty()) {
            System.out.println(f2.poll());
        }
    }

    public static Queue<Integer> inverterFila(Queue<Integer> fila) {
        LinkedList<Integer> pilha = new LinkedList<>();
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        Queue<Integer> novaFila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            novaFila.add(pilha.pop());
        }
        return novaFila;
    }
}
