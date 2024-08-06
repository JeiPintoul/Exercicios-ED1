public class MOD {

    public int calcularMOD(int x, int y) {
        if (x < 0 || y < 0) {
            return -1;
        }else if (x > y) {
            return calcularMOD(x - y, y);
        } else if (x < y) {
            return x;
        } else return 0;
    }
}
