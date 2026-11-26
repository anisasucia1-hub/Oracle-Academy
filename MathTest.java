public class MathTest {
    public static void main(String[] args) {
        // Kita tentukan contoh nilai variabel x, y, dan z terlebih dahulu
        double x = 4.0;
        double y = 2.0;
        double z = 10.0;

        // Contoh uji rumus a: a = sqrt(x^5 - 6) / 4
        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
        System.out.println("Hasil rumus a = " + a);

        // Contoh uji rumus b: b = x^y - 6^x
        double b = Math.pow(x, y) - Math.pow(6, x);
        System.out.println("Hasil rumus b = " + b);

        // Contoh uji rumus c: c = 4 * cos(z/5) - sin(x^2)
        double c = 4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2));
        System.out.println("Hasil rumus c = " + c);
    }
}