import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas (b): ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi (h): ");
        double tinggi = scanner.nextDouble();

        // Menghitung luas segitiga: A = (1/2) * b * h
        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        scanner.close();
    }
}