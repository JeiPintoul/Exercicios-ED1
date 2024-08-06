public class ConverterDecimalParaBinario {
    public String converterParaBinario(int n){

        if (n == 0 ) {
            return "0";
        }
        if (n == 1 ) {
            return "1";
        }
        int a = n % 2;



        return converterParaBinario(n/2)+ a;
    }
}
