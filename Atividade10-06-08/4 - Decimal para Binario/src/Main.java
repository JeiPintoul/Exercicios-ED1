public class Main {
    public static void main(String[] args) {
        int decimalNumber = 17;
        ConverterDecimalParaBinario converter = new ConverterDecimalParaBinario();

        String binaryNumber = converter.converterParaBinario(decimalNumber);
        System.out.println("O número " + decimalNumber + " em binário é: " + binaryNumber);
    }
}