public class ContarNumero {
    public int contarNumero(int N, int K){

        if (N == 0) {
            return 0;
        }
        int ultimodigito = N % 10;
        int contarproximo = contarNumero(N/10, K);

        if(ultimodigito == K ){

            return 1+ contarproximo;
        }
        return contarproximo;
    }
}
