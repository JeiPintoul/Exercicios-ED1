import java.util.Random;
import java.util.Stack;

public class TestaPilha {

    private Stack<Integer> pilhaP;
    private Stack<Integer> pilhaN;

    public TestaPilha() {
        pilhaP = new Stack<>();
        pilhaN = new Stack<>();
    }

    public void processaNumeros() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // Gera um número entre -100 e 100

            if (numero > 0) {
                pilhaP.push(numero);
            } else if (numero < 0) {
                pilhaN.push(numero);
            } else {
                if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
                    int p = pilhaP.pop();
                    int n = pilhaN.pop();
                    System.out.println("Número retirado da pilha P: " + p);
                    System.out.println("Número retirado da pilha N: " + n);
                } else {
                    System.out.println("Uma das pilhas está vazia, não foi possível retirar.");
                }
            }
        }
    }
}