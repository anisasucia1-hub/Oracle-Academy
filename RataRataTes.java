import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan nilai untuk 5 tes (maksimal 100 poin):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextDouble();
            total += nilaiTes[i];
        }

        double rataRata = total / 5;
        System.out.println("\n--- Hasil ---");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);
        
        scanner.close();
    }
}