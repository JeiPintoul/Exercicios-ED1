import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Stack<String> pilha = new Stack();
        Stack<String> pilhaAuxiliar = new Stack();
        int indiceLista = 0;

        pilha.push("Maçã");
        pilha.push("Banana");
        pilha.push("Pera");
        pilha.push("Jaca");
        pilha.push("Tomate");
        pilha.push("Melancia");
        pilha.push("Laranja");
        pilha.push("Cupuaçu");
        pilha.push("Limão");
        pilha.push("Açai");
        pilha.push("Manga");
        pilha.push("Goiaba");
        pilha.push("Uva");
        pilha.push("Ameixa");
        pilha.push("Mirtilo");
        pilha.push("Pêssego");
        pilha.push("Kiwi");

        for (int i = pilha.size() - 1; i >= 0; i--) {
            indiceLista++;
            System.out.println(indiceLista + ". " + pilha.get(i));
        }

        indiceLista = 0;
        
        System.out.print("Da lista anterior, indique o indíce do que deve ser removido: ");
        int indice = entrada.nextInt();
        System.out.println(indice);

        System.out.println("A seguir, a mesma lista removendo o indice informado:");

        int tamanhoPilha = pilha.size();
        String elemento;
        
        for (int i = 0; i < tamanhoPilha; i++) {
            elemento = pilha.pop();
            if (i != indice - 1) {
                indiceLista++;
                System.out.println(indiceLista + ". " + elemento);
            }
        }
    }
}
