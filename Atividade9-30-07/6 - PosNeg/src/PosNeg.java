import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class PosNeg {
    public static void main(String[] args) {
        Random random = new Random();
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 2; i < 2002; i++) {
            if (i % 2 == 0) {
                fila.add(random.nextInt(1000));
            } else {
                fila.add(random.nextInt(-1 - (-1000) + 1) + (-1000));
            }
        }

        int tamanhoFila = fila.size();

        for (int i = 0; i < tamanhoFila; i++) {
            if (fila.peek() > 0) {
                pilha.push(fila.poll());
            } else {
                System.out.println("Número negativo encontrado: " + fila.poll());
            }
        }
    }
}
