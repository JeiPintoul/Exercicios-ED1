public class MDC {

    public int calcularMdc(int x, int y) {
        if (x > y) {
            return calcularMdc(x - y, y);
        } else if (y > x) {
            return calcularMdc(y, x);
        } else return x;
    }
}
