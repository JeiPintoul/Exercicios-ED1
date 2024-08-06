public class App {
    public static void main(String[] args) throws Exception {
        MDC mdc = new MDC();

        System.out.println(mdc.calcularMdc(500, 200));
    }
}
