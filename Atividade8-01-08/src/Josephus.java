import java.util.ArrayList;
import java.util.Random;

public class Josephus {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Random random = new Random();

        int participantes = 20;

        for (int i = 1; i <= participantes; i++) {
            Pessoa pessoa = new Pessoa("Jimilso " + i, "cem", "476755785458", "657567575367", i);
            pessoas.add(pessoa);
        }

        int randomNum = random.nextInt(20) + 1;
        int indice = 0;

        while (pessoas.size() > 1) {
            indice = (indice + randomNum) % pessoas.size();
            pessoas.remove(indice);
        }

        System.out.println("O sobrevivente foi: " + pessoas.get(0));
    }
}
