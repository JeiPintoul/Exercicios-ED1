import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Queue<Integer> f = new LinkedList<>();
        Stack<Integer> p = new Stack<>();

        Queue<Integer> f2 = new LinkedList<>();
        Stack<Integer> p2 = new Stack<>();

        boolean tem = false;

        for (int i = 0; i < 1000; i++) {
            int n = random.nextInt(100000);
            int tamanhoF2 = f2.size();
            for (int j = 0; j < tamanhoF2; j++) {
                p2.add(f2.poll());
                if (p2.peek() == n) {
                    tem = true;
                }
            }
            if (!tem) {
                int tamanhoP2 = p2.size();
                for (int j = 0; j < tamanhoP2; j++) {
                    f2.add(p2.pop());
                }
                f2.add(n);
                f.add(n);
            } else {
                while (!p2.isEmpty()) {
                    f2.add(p2.pop());
                }
                p.add(n);
                tem = false;
            }
        }

        int tamanhoFila = f.size();

        System.out.println("FILA:");
        for (int i = 1; i <= tamanhoFila; i++) {
            System.out.println(i + ". " + f.poll());
        }

        System.out.println();
        System.out.println();

        int tamanhoPilha = p.size();

        System.out.println("PILHA:");
        for (int i = 1; i <= tamanhoPilha; i++) {
            System.out.println(i + ". " + p.pop());
        }
    }
}
