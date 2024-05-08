import java.util.Stack;

public class Infixa {
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    public String paraNormalPosFixa(String expressao) {
        String[] tokens = expressao.split(" ");
        Stack<String> pilha = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                String operand2 = pilha.pop();
                String operand1 = pilha.pop();
                String resultado = "(" + operand1 + " " + token + " " + operand2 + ")";
                pilha.push(resultado);
            } else {
                pilha.push(token);
            }
        }

        return pilha.pop();
    }

    public String paraNormalPreFixa(String expressao) {
        Stack<String> stack = new Stack<>();
        
        // Dividir a expressão em tokens (operadores e operandos)
        String[] tokens = expressao.split(" ");
        
        // Percorrer os tokens da direita para a esquerda
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            
            // Se for um operando, empilhar na pilha
            if (!isOperator(token)) {
                stack.push(token);
            } else { // Se for um operador
                // Desempilhar dois operandos
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                
                // Formar uma expressão infixa
                String infixExp = "(" + operand1 + " " + token + " " + operand2 + ")";
                
                // Empilhar a expressão infixa formada
                stack.push(infixExp);
            }
        }
        
        // No final, a pilha terá apenas uma expressão infixa, que é o resultado final
        return stack.pop();
    }
}
