
public class TorreDeHanoi {
    private static long movimentos = 0;

    public static void main(String[] args) {
        int[] discosArray = {1, 10, 20, 30, 40, 41}; // Array com os casos de teste predefinidos
        
        // Loop para cada valor no array de discos
        for (int n : discosArray) {
            movimentos = 0; // Resetar o contador de movimentos para cada caso
            
            // Marcar o tempo de início
            long startTime = System.currentTimeMillis();
            
            // Chamar a função recursiva para resolver a Torre de Hanoi
            resolverTorreDeHanoi(n, 'A', 'C', 'B');
            
            // Marcar o tempo de término
            long endTime = System.currentTimeMillis();
            
            // Calcular e exibir o tempo de execução no formato HORAS:MINUTOS:SEGUNDOS:milisegundos
            long duration = endTime - startTime;
            long hours = duration / 3600000;
            long minutes = (duration % 3600000) / 60000;
            long seconds = (duration % 60000) / 1000;
            long milliseconds = duration % 1000;
            
            System.out.printf("Tempo necessário para resolver a Torre de Hanoi com %d discos: %02d:%02d:%02d:%03d\n",
                                n, hours, minutes, seconds, milliseconds);
            
            // Exibir o número total de movimentos
            System.out.println("Número total de movimentos: " + movimentos);
            System.out.println(); // Linha em branco para separar os resultados
        }
        
    }
    
    public static void resolverTorreDeHanoi(int n, char origem, char destino, char auxiliar) {
        // Caso base: se houver apenas um disco, mova-o diretamente da origem para o destino
        if (n == 1) {
            movimentos++;
            return;
        }
        
        // Passo 1: Mover n-1 discos da origem para o auxiliar
        resolverTorreDeHanoi(n - 1, origem, auxiliar, destino);
        
        // Passo 2: Mover o disco n da origem para o destino
        movimentos++;
        
        // Passo 3: Mover n-1 discos do auxiliar para o destino
        resolverTorreDeHanoi(n - 1, auxiliar, destino, origem);
    }
}
