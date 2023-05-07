public class Main {
    public static void main(String[] args) {
        double a, b, c, d, e;
        a = 14.5;
        b = a + 0.5;
        c = b - (b % 10);
        d = (b - c) - ((b - c) % 1);
        e = c + d;
        int f = (int) e;
        System.out.println("Число=" + a);
        System.out.println("Заокруглене число=" + (f));
    }
}