import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            Pilha aberto = new Pilha();
            Pilha fechado = new Pilha();
            
            System.out.print("Digite a expressão matemática: ");
            String expressao = entrada.nextLine();
            
            for (int i = 0; i < expressao.length(); i++) {
                char caractere = expressao.charAt(i);
                
                switch (caractere) {
                    case '(' -> aberto.empilhar(caractere);
                    case ')' -> {
                        if (aberto.vazia()) {
                            System.out.println("Expressão inválida");
                            return;
                        }
                        if (aberto.verTopo() == '(') {
                            fechado.empilhar(aberto.desempilhar());
                            break;
                        } else {
                            System.out.println("Expressão inválida");
                            entrada.close();
                            return;
                        }
                    }
                    case '[' -> aberto.empilhar(caractere);
                    case ']' -> {
                        if (aberto.vazia()) {
                            System.out.println("Expressão inválida");
                            entrada.close();
                            return;
                        }
                        if (aberto.verTopo() == '[') {
                            fechado.empilhar(aberto.desempilhar());
                            break;
                        } else {
                            System.out.println("Expressão inválida");
                            entrada.close();
                            return;
                        }
                    }
                    case '{' -> aberto.empilhar(caractere);
                    case '}' -> {
                        if (aberto.vazia()) {
                            System.out.println("Expressão inválida");
                            entrada.close();
                            return;
                        }
                        if (aberto.verTopo() == '{') {
                            fechado.empilhar(aberto.desempilhar());
                            break;
                        } else {
                            System.out.println("Expressão inválida");
                            entrada.close();
                            return;
                        }
                    }
                }
            }
            
            if (!aberto.vazia()) {
                System.out.println("Expressão inválida");
                entrada.close();
                return;
            }
            
            System.out.println("Expressão válida");
        }
    }

}
