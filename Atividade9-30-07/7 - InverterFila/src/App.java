import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> fila = new LinkedList<>();
        Queue<Integer> fila2 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            fila.add(random.nextInt(100));
        }

        System.out.println("Fila Normal: " + fila);
        fila2 = inverterFila(fila);
        System.out.println("Fila Invertida: " + fila2);
    }

    public static Queue<Integer> inverterFila(Queue<Integer> fila) {
        Stack<Integer> auxiliar = new Stack<>();
        Queue<Integer> novaFila = new LinkedList<>();

        while (!fila.isEmpty()) {
            auxiliar.push(fila.poll());
        }

        while (!auxiliar.isEmpty()) {
            novaFila.add(auxiliar.pop());
        }

        return novaFila;
    }
}
