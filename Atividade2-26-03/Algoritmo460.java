import java.util.Scanner;

public class Algoritmo460 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número que deseja receber o dobro: ");
        float num1 = entrada.nextFloat();
        entrada.nextLine();
        System.out.printf("O dobro de %.2f é: %.2f", num1, dobro(num1));

        System.out.print("\nDigite o segundo número que deseja receber o dobro: ");
        float num2 = entrada.nextFloat();
        entrada.nextLine();
        System.out.printf("O dobro de %.2f é: %.2f", num2, dobro(num2));

        System.out.print("\nDigite o terceiro número que deseja receber o dobro: ");
        float num3 = entrada.nextFloat();
        entrada.nextLine();
        System.out.printf("O dobro de %.2f é: %.2f", num3, dobro(num3));

        entrada.close();
    }

    public static float dobro(float x) {
        return x * 2;
    }
}
